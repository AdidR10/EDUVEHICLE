//import com.mysql.cj.protocol.Resultset;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.sql.*;
import javax.swing.table.DefaultTableModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author AR10
 */
public class MY_VEHCILES extends javax.swing.JFrame {

    /**
     * Creates new form MY_VEHCILES
     */
    Connection con;
    PreparedStatement pst;
    ResultSet Rs;
    public MY_VEHCILES() {
        initComponents();
    }
    public static int UID;
    public MY_VEHCILES(int xxx) throws SQLException{
        
        
        initComponents();
        UID = xxx;
        Connect();
        table();
        
    }
    public void Connect () throws SQLException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/edubike", "root", "");
            System.out.println("The database was connected");
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(MY_VEHCILES.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void table(){
        try {
            pst = con.prepareStatement("SELECT Vehicle_Type , VehicleID, Model , Availability_Status "
                    + "FROM vehicle "
                    + "WHERE vehicle.UserID = ?");
            pst.setInt(1 , UID);
            Rs = pst.executeQuery();
            DefaultTableModel df = (DefaultTableModel) NWT.getModel();
            df.setRowCount(0);
            while(Rs.next()){
                int sttt = Rs.getInt("Availability_Status");
                String wowo = "YES";
                if(sttt == 0) wowo = "NO";
                String data[] = {Rs.getString("Vehicle_Type"), String.valueOf(Rs.getInt("VehicleID")), Rs.getString("Model"), wowo};
                df.addRow(data);
            }
        } catch (SQLException ex) {
            Logger.getLogger(EdubikeLocations.class.getName()).log(Level.SEVERE, null, ex);
        }
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
        NWT = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        Vehicle_ID = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        Set_Vehicle = new javax.swing.JRadioButton();
        Save_Vehicle = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        NWT.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Type", "VehicleID", "Brand", "Availability"
            }
        ));
        jScrollPane1.setViewportView(NWT);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 492, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );

        getContentPane().add(jPanel1);

        jPanel2.setBackground(new java.awt.Color(51, 153, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("MY VEHICLES");

        jLabel3.setText("Insert Your VehicleID and choose to set it's avalability:");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Set Availability:");

        Vehicle_ID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Vehicle_IDActionPerformed(evt);
            }
        });

        jLabel12.setText("VehicleID:");

        Set_Vehicle.setText("Set");
        Set_Vehicle.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Set_VehicleMouseClicked(evt);
            }
        });
        Set_Vehicle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Set_VehicleActionPerformed(evt);
            }
        });

        Save_Vehicle.setText("Save");
        Save_Vehicle.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Save_VehicleMouseClicked(evt);
            }
        });
        Save_Vehicle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Save_VehicleActionPerformed(evt);
            }
        });

        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton1))
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 360, Short.MAX_VALUE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(70, 70, 70)
                                .addComponent(jLabel8))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(jLabel12)
                                .addGap(30, 30, 30)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Set_Vehicle)
                                    .addComponent(Vehicle_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Save_Vehicle))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jButton1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Vehicle_ID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Set_Vehicle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Save_Vehicle)
                .addGap(225, 225, 225)
                .addComponent(jLabel8)
                .addContainerGap(117, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Set_VehicleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Set_VehicleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Set_VehicleActionPerformed

    private void Vehicle_IDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Vehicle_IDActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_Vehicle_IDActionPerformed

    private void Save_VehicleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Save_VehicleMouseClicked
        // TODO add your handling code here:
        String lep = Vehicle_ID.getText();
        if(lep.length() == 0){
            JOptionPane.showMessageDialog(this, "Please Give Vehicle ID");
            return;
        }
        int v_id = Integer.parseInt(lep);
        boolean is_set = Set_Vehicle.isSelected();
        // JOptionPane.showMessageDialog(this , "rtrss x");
        
        boolean asenaki = false;
        try{
            pst = con.prepareStatement("SELECT VehicleID FROM vehicle WHERE VehicleID = ? AND UserID = ?");
            pst.setInt(1 , v_id);
            pst.setInt(2, UID);
            var rst = pst.executeQuery();
            asenaki = rst.next();
        } catch (SQLException ex) {
            Logger.getLogger(MY_VEHCILES.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        if(!asenaki){
            JOptionPane.showMessageDialog(this, "Please Give A Proper Vehicle ID");
        }else{
            try {
                pst = con.prepareStatement("UPDATE vehicle SET Availability_Status = ? WHERE VehicleID = ?");
                int tempis_set = 0;
                if(is_set) tempis_set = 1;
                pst.setInt(1, tempis_set);
                pst.setInt(2, v_id);
            
            
                Vehicle_ID.setText("");
//                user_name.setText("");

                pst.executeUpdate();
                table();
                JOptionPane.showMessageDialog(this, "Vehicle Status is updated");    
            } catch (SQLException ex) {
                Logger.getLogger(MY_VEHCILES.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }//GEN-LAST:event_Save_VehicleMouseClicked

    private void Set_VehicleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Set_VehicleMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Set_VehicleMouseClicked

    private void Save_VehicleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Save_VehicleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Save_VehicleActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Dashboard c = new Dashboard(UID);
        c.setVisible(true);
        this.setVisible(false);
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
            java.util.logging.Logger.getLogger(MY_VEHCILES.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MY_VEHCILES.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MY_VEHCILES.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MY_VEHCILES.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MY_VEHCILES().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable NWT;
    private javax.swing.JButton Save_Vehicle;
    private javax.swing.JRadioButton Set_Vehicle;
    private javax.swing.JTextField Vehicle_ID;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
