import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import java.util.Date;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author AR10
 */
public class CAR_RENT extends javax.swing.JFrame {

    /**
     * Creates new form CAR_RENT
     */
    static int ID;
    Connection con;
    PreparedStatement pst;
    ResultSet Rs;
    public CAR_RENT() {
        initComponents();
    }
    public CAR_RENT(int xx) throws SQLException {
        initComponents();
        ID = xx;
        Connect();
        table();
        
    }
    public void Connect () throws SQLException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/edubike", "root", "");
            System.out.println("The database was connected");
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(BICYCLE_RENT.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void table(){
        try {
//            pst = con.prepareStatement("SELECT VehicleID , Model , Hourly_Rate, Special_Features, Location_Name "
//                    + "FROM vehicle , location "
//                    + "WHERE vehicle.UserID != ? AND vehicle.LocationID = location.LocationID AND Vehicle_Type = \"Bicycle\" AND Availability_Status = 1");
            System.out.println("yoyoyoyo");
            pst = con.prepareStatement("SELECT VehicleID , Model , Hourly_Rate, Special_Features, Location_Name FROM vehicle CROSS JOIN location WHERE vehicle.UserID <> ? AND vehicle.LocationID = location.LocationID AND Vehicle_Type = 'Car' AND Availability_Status = 1");
            pst.setInt(1 , ID);
            Rs = pst.executeQuery();
            DefaultTableModel df = (DefaultTableModel) BINWT.getModel();
            df.setRowCount(0);
            System.out.println("yoyoyoyo");
            while(Rs.next()){
                System.out.println("yoyoyoyo");
                String data[] = {String.valueOf(Rs.getInt("VehicleID")), Rs.getString("Model"), String.valueOf(Rs.getInt("Hourly_Rate")), Rs.getString("Special_Features"), Rs.getString("Location_Name")};
                df.addRow(data);
            }
        } catch (SQLException ex) {
            Logger.getLogger(EdubikeLocations.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public static String getTodaysDate() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        return dateFormat.format(new Date());
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        BINWT = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        V_ID_GET = new javax.swing.JTextField();
        TRXID = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        PAY_MEDIUM = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        NDM = new javax.swing.JComboBox<>();
        STRM = new javax.swing.JComboBox<>();
        NDH = new javax.swing.JComboBox<>();
        STRH = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rsz_2car_rental.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 501));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 690));

        jPanel2.setBackground(new java.awt.Color(0, 153, 204));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BINWT.setBackground(new java.awt.Color(153, 204, 255));
        BINWT.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 51, 153), 4, true));
        BINWT.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "VehicleID", "Model", "Hourly Rate", "Special Features", "Location"
            }
        ));
        jScrollPane1.setViewportView(BINWT);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 590, 610));

        jLabel3.setText("Enter VehicleID:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 160, 20));

        jLabel4.setText("Complete payment and enter TrxID:");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 200, -1));

        V_ID_GET.setText("jTextField1");
        V_ID_GET.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                V_ID_GETActionPerformed(evt);
            }
        });
        jPanel2.add(V_ID_GET, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 10, 130, -1));

        TRXID.setText("jTextField2");
        jPanel2.add(TRXID, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 60, 130, -1));

        jButton1.setText("Proceed");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 200, -1, -1));

        jLabel6.setText("Rental Start time: ");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        jLabel7.setText("Rental End Time:");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        PAY_MEDIUM.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bkash", "Nagad" }));
        PAY_MEDIUM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PAY_MEDIUMActionPerformed(evt);
            }
        });
        jPanel2.add(PAY_MEDIUM, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 160, 90, -1));

        jLabel2.setText("Medium:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));

        jButton3.setText("Back");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 10, -1, -1));

        NDM.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59" }));
        jPanel2.add(NDM, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 120, -1, -1));

        STRM.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59" }));
        jPanel2.add(STRM, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 90, -1, -1));

        NDH.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23" }));
        jPanel2.add(NDH, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 120, -1, -1));

        STRH.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23" }));
        jPanel2.add(STRH, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(698, 0, 590, 660));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void V_ID_GETActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_V_ID_GETActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_V_ID_GETActionPerformed

    private void PAY_MEDIUMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PAY_MEDIUMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PAY_MEDIUMActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        RentAVehicle hm = new RentAVehicle(ID);
        hm.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        try {
            // TODO add your handling code here: vehicle's user's database
            
            //if (trxid is not found in vehicle's ownners database, then print payment is not completed yet. trxid is wrong) return;
            
            String VID = V_ID_GET.getText();
            int veh_id = Integer.parseInt(VID);
            String t_id = TRXID.getText();
            
            String pm = (String) PAY_MEDIUM.getSelectedItem();
            int rsth = Integer.parseInt((String) STRH.getSelectedItem());
            int rstm = Integer.parseInt((String) STRM.getSelectedItem());
            int rndh = Integer.parseInt((String) NDH.getSelectedItem());
            int rndm = Integer.parseInt((String) NDM.getSelectedItem());
            int acst = rsth * 60 + rstm;
            int acnt = rndh * 60 + rndm;
            if(acnt - acst < 10){
                JOptionPane.showMessageDialog(this, "You Can not rent a bicylce for less than 10 minutes");
                return;
            }
            String todayString = getTodaysDate();
            pst = con.prepareStatement("INSERT INTO `rental payment` (`Rental Start Time` , `Rental End Time`, `TransactionID` , `Payment Date`, `Payment Method`, VehicleID, UserID) VALUES (?,?,?,?,?,?,?)");
            pst.setInt(1 , acst);
            pst.setInt(2 , acnt);
            pst.setInt(3, Integer.parseInt(t_id));
            pst.setString(4 , todayString);
            pst.setString(5 , pm);
            pst.setInt(6 , veh_id);
            pst.setInt(7 , ID);
            int heo = pst.executeUpdate();
            pst = con.prepareStatement("SELECT * FROM rents WHERE VehicleID = ? AND USERID = ?");
            pst.setInt(1 , veh_id);
            pst.setInt(2 , ID);
            Rs = pst.executeQuery();
            boolean chk = Rs.next();
            if(!chk){
                pst = con.prepareStatement("INSERT INTO rents (UserID, VehicleID) VALUES (?,?)");
                pst.setInt(1 , ID);
                pst.setInt(2 , veh_id);
                pst.executeUpdate();
            } 
            pst = con.prepareStatement("UPDATE vehicle SET Availability_Status = 0 WHERE VehicleID = ?");
            pst.setInt(1 , veh_id);
            pst.executeUpdate();
            table();
            
        } catch (SQLException ex) {
            Logger.getLogger(BICYCLE_RENT.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CAR_RENT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CAR_RENT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CAR_RENT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CAR_RENT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CAR_RENT().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable BINWT;
    private javax.swing.JComboBox<String> NDH;
    private javax.swing.JComboBox<String> NDM;
    private javax.swing.JComboBox<String> PAY_MEDIUM;
    private javax.swing.JComboBox<String> STRH;
    private javax.swing.JComboBox<String> STRM;
    private javax.swing.JTextField TRXID;
    private javax.swing.JTextField V_ID_GET;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
