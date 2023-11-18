
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.*;
import java.text.ParseException;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Random;
import java.time.LocalDate;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author AR10
 */
public class MonitorMantainance extends javax.swing.JFrame {

    /**
     * Creates new form MonitorMantainance
     */
    Connection con;
    PreparedStatement pst;
    ResultSet Rs;
    public void Connect () throws SQLException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/edubike", "root", "");
            System.out.println("The database was connected");
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(MonitorMantainance.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    static int ID;
    public MonitorMantainance() {
        initComponents();
    }
    public MonitorMantainance(int xx) {
        initComponents();
        ID = xx;
        try {
            Connect();
        } catch (SQLException ex) {
            Logger.getLogger(MonitorMantainance.class.getName()).log(Level.SEVERE, null, ex);
        }      
        table();
    }
    
     public static String getTodaysDate() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        return dateFormat.format(new java.util.Date());
    }
    
    public void table(){
        try {
            pst = con.prepareStatement("SELECT VehicleID, Cost, `Start Date`, Description "
                    + "FROM maintenance as M");
            Rs = pst.executeQuery();
            DefaultTableModel df = (DefaultTableModel) BINWT.getModel();
            df.setRowCount(0);
            while(Rs.next()){
                System.out.println("yoyoy");
                String data[] = {String.valueOf(Rs.getInt("VehicleID")), String.valueOf(Rs.getInt("Cost")), Rs.getDate("Start Date").toString(), Rs.getString("Description")};
                df.addRow(data);
            }
        } catch (SQLException ex) {
            Logger.getLogger(MonitorMantainance.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public static int randomNumberGenerator(int min, int max){
        Random r = new Random();
        int randomNum = r.nextInt(max - min);
        int result = randomNum + min;
        return result;
    }
    public String findmid () {
        boolean ok = true;
        String mfin = "";
        while (ok) {
            try {
                String mm = String.valueOf(randomNumberGenerator (10000000, 99999999));
                pst = con.prepareStatement("select * from vehicle as V WHERE V.VehicleID = ?");
                pst.setString(1, mm);
                var rs = pst.executeQuery();
                if (!rs.next()) {
                    ok = false;
                    mfin = mm;
                }
            } catch (SQLException ex) {
                Logger.getLogger(Login1.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return mfin;
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
        jScrollPane1 = new javax.swing.JScrollPane();
        BINWT = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        VID1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        JBP2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        VID2 = new javax.swing.JTextField();
        JBP1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        VC = new javax.swing.JTextField();
        VSD = new javax.swing.JTextField();
        VEOD = new javax.swing.JTextField();
        VD = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 204, 255));
        jPanel1.setForeground(new java.awt.Color(153, 204, 255));

        BINWT.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "VehicleID", "Cost", "Start Date", "Damage"
            }
        ));
        jScrollPane1.setViewportView(BINWT);

        jLabel1.setText("Release From mantainance:");

        VID1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VID1ActionPerformed(evt);
            }
        });

        jLabel2.setText("VehicleID:");

        JBP2.setText("Proceed");
        JBP2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBP2ActionPerformed(evt);
            }
        });

        jLabel3.setText("Add To Mantainance:");

        jLabel4.setText("VehicleID:");

        JBP1.setText("Proceed");
        JBP1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBP1ActionPerformed(evt);
            }
        });

        jLabel5.setText("Cost:");

        jLabel6.setText("Exp. Over Date:");

        jLabel8.setText("Damage:");

        VC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VCActionPerformed(evt);
            }
        });

        VSD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VSDActionPerformed(evt);
            }
        });

        VEOD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VEODActionPerformed(evt);
            }
        });

        VD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VDActionPerformed(evt);
            }
        });

        jLabel7.setText("Start Date:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 506, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JBP1)
                            .addComponent(VID1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(JBP2, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(VD)
                            .addComponent(VEOD)
                            .addComponent(VSD)
                            .addComponent(VC, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(VID2, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(121, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(VID1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(JBP1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(VID2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(VC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(VSD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(VEOD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(VD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addComponent(JBP2)
                .addContainerGap())
        );

        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JBP2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBP2ActionPerformed
        // TODO add your handling code here:
        String vid2 = VID2.getText();
        if (vid2.isEmpty()) {
            JOptionPane.showMessageDialog(this, "It cannot be blank!");
            return;
        }
        
        try {
            pst = con.prepareStatement("select * from vehicle as V where V.VehicleID = ?");
            pst.setString(1, vid2);
            var rs = pst.executeQuery();
            if (!rs.next()) {
                JOptionPane.showMessageDialog(this, "This vehicle is not registered");
                return;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Login1.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            pst = con.prepareStatement("select VehicleID, Owner_Type from vehicle as V where V.VehicleID = ?");
            pst.setString(1, vid2);
            var rs = pst.executeQuery();
            rs.next();
            int own = rs.getInt("Owner_Type");
            if (own == 0) {
                JOptionPane.showMessageDialog(this, "Sorry! Only EduVehicle's vechicles can be send to maintainance");
                return;
            }  
        } catch (SQLException ex) {
            Logger.getLogger(MonitorMantainance.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        // check if already in maintainance:
        try {
            pst = con.prepareStatement("select VehicleID from maintenance as M where M.VehicleID = ?");
            pst.setString(1, vid2);
            var rs = pst.executeQuery();
            
            if (rs.next()) {
                JOptionPane.showMessageDialog(this, "This vehicle is already in maintenance");
                return;
            }  
        } catch (SQLException ex) {
            Logger.getLogger(Login1.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        // set availability status of VID2 to unavaiible.
        try {
            pst = con.prepareStatement("update vehicle SET `Availability_Status` = 0 WHERE vehicleID = ?");
            pst.setString(1, vid2); 
            var rs = pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(Login1.class.getName()).log(Level.SEVERE, null, ex);
        }
        //insert VID2  to maintainance log
        try {
            
//            String mid = findmid();
            String cost = VC.getText();
            String startdate = VSD.getText();
            String expendofdate = VEOD.getText();
            String description = VD.getText(); 
            //vid2
            String adminnid = String.valueOf(ID);
            
            
            //
            java.sql.Date sqlDate = null;
            java.sql.Date sqlDateover = null;
            try {
                // Define the date format
                SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

                // Parse the String to java.util.Date
                Date utilDate = dateFormat.parse(startdate);
                Date utilDateover = dateFormat.parse(expendofdate);
                // Convert java.util.Date to java.sql.Date
                sqlDate = new java.sql.Date(utilDate.getTime());
                sqlDateover = new java.sql.Date(utilDateover.getTime());
                
//                System.out.println("Original String: " + dateString);
//                System.out.println("java.sql.Date: " + sqlDate);

            } catch (ParseException e) {
                e.printStackTrace();
            }
            //
            
            //
            int viddd = 0;
            int admiidddd = 0;
            try {
                // Convert String to int
                viddd = Integer.parseInt(vid2);
                admiidddd = Integer.parseInt(adminnid);
            } catch (NumberFormatException e) {
                // Handle the case when the string cannot be parsed to an int
                System.out.println("Error: Unable to parse the string as an integer.");
                e.printStackTrace();
            }
            //
            
            pst = con.prepareStatement("INSERT INTO maintenance (Cost, `Start Date`, `Expected Over Date`, Description, VehicleID, AdminID) VALUES (?, ?, ?, ?, ?, ?)");
//            pst.setString(, mid);
            pst.setString(1, cost);
            pst.setDate(2, sqlDate);
            pst.setDate(3, sqlDateover);
            pst.setString(4, description);
            pst.setInt(5, viddd);
            pst.setInt(6, ID);
            var rs = pst.executeUpdate();  
        } catch (SQLException ex) {
            Logger.getLogger(Login1.class.getName()).log(Level.SEVERE, null, ex);
        }
        table();
    }//GEN-LAST:event_JBP2ActionPerformed

    private void JBP1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBP1ActionPerformed
        // TODO add your handling code here:
        String vid1 = VID1.getText();
        if (vid1.isEmpty()) {
            JOptionPane.showMessageDialog(this, "It cannot be blank!");
            return;
        }
        // if already not in maintenance
        try {
            pst = con.prepareStatement("select * from maintenance as M where M.VehicleID = ?");
            pst.setString(1, vid1);
            var rs = pst.executeQuery();
            if (!rs.next()) {
                JOptionPane.showMessageDialog(this, "This vehicle is already not in maintenance");
                return;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Login1.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        // make VID1 available for rent
        try {
            pst = con.prepareStatement("update vehicle SET `Availability_Status` = 1 WHERE vehicleID = ?");
            pst.setString(1, vid1); 
            var rs = pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(Login1.class.getName()).log(Level.SEVERE, null, ex);
        }
        // remove VID1 from maintainance log
        try {
            pst = con.prepareStatement("select * from maintenance as M where M.VehicleID = ?");
            pst.setString(1, vid1); 
            var rs = pst.executeQuery();
            
            rs.next();
            String midd = rs.getString("MaintenanceID");
            
            pst = con.prepareStatement("DELETE FROM maintenance WHERE MaintenanceID = ?");
            pst.setString(1, midd); 
            var hoise = pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(Login1.class.getName()).log(Level.SEVERE, null, ex);
        }
        //update table:
        table();        
    }//GEN-LAST:event_JBP1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        AdminDashboard  hm = new AdminDashboard(ID);
        hm.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void VID1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VID1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_VID1ActionPerformed

    private void VSDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VSDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_VSDActionPerformed

    private void VEODActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VEODActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_VEODActionPerformed

    private void VDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_VDActionPerformed

    private void VCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_VCActionPerformed

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
            java.util.logging.Logger.getLogger(MonitorMantainance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MonitorMantainance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MonitorMantainance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MonitorMantainance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MonitorMantainance().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable BINWT;
    private javax.swing.JButton JBP1;
    private javax.swing.JButton JBP2;
    private javax.swing.JTextField VC;
    private javax.swing.JTextField VD;
    private javax.swing.JTextField VEOD;
    private javax.swing.JTextField VID1;
    private javax.swing.JTextField VID2;
    private javax.swing.JTextField VSD;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
