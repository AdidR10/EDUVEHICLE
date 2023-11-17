import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.util.Random;
import java.sql.*;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author AR10_RAHMAN
 */
public class BICYCLE_RENT extends javax.swing.JFrame {

    /**
     * Creates new form BICYCLE_RENT
     */
    public BICYCLE_RENT() {
        initComponents();
    }
    
    public static String generateRandomString(int length) {
        // Define the characters from which to generate the random string
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";

        // Create a StringBuilder to store the generated random string
        StringBuilder randomString = new StringBuilder();

        // Create a Random object
        Random random = new Random();

        for (int i = 0; i < length; i++) {
            // Generate a random index between 0 and characters.length() - 1
            int randomIndex = random.nextInt(characters.length());

            // Append the character at the random index to the randomString
            randomString.append(characters.charAt(randomIndex));
        }

        return randomString.toString();
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
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        V_ID_GET = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        TRXID = new javax.swing.JTextField();
        PROCEED = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        REF_TABLE = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        PAY_MEDIUM = new javax.swing.JComboBox<>();
        jComboBox3 = new javax.swing.JComboBox<>();
        STR_TME = new javax.swing.JComboBox<>();
        END_TME = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 153, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 170, 130, 90));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rsz_1bicycle_rent.jpg"))); // NOI18N
        jLabel1.setMaximumSize(new java.awt.Dimension(1000, 1000));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel2.setBackground(new java.awt.Color(153, 204, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setBackground(new java.awt.Color(153, 204, 255));
        jTable1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 51, 153), 4, true));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
                "Sr No.", "Model", "Hourly Rate", "Special Features", "Location"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 600, 600));

        jLabel3.setText("Enter VehicleID:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 160, 20));

        V_ID_GET.setText("jTextField1");
        V_ID_GET.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                V_ID_GETActionPerformed(evt);
            }
        });
        jPanel2.add(V_ID_GET, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 10, 130, -1));

        jLabel4.setText("Complete payment and enter TrxID:");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 200, -1));

        TRXID.setText("jTextField2");
        jPanel2.add(TRXID, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 60, 130, -1));

        PROCEED.setText("Proceed");
        PROCEED.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PROCEEDActionPerformed(evt);
            }
        });
        jPanel2.add(PROCEED, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 160, -1, 20));

        jLabel5.setForeground(new java.awt.Color(255, 51, 51));
        jLabel5.setText("generate demo TrxID");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 160, -1, 20));

        REF_TABLE.setText("refresh");
        REF_TABLE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                REF_TABLEMouseClicked(evt);
            }
        });
        REF_TABLE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                REF_TABLEActionPerformed(evt);
            }
        });
        jPanel2.add(REF_TABLE, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 160, -1, -1));

        jLabel6.setText("Rental Start time: ");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        jLabel7.setText("Rental End Time:");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        jLabel8.setText("Medium:");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));

        PAY_MEDIUM.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bkash", "Nagad" }));
        PAY_MEDIUM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PAY_MEDIUMActionPerformed(evt);
            }
        });
        jPanel2.add(PAY_MEDIUM, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 160, 90, -1));

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23" }));
        jPanel2.add(jComboBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 120, -1, -1));

        STR_TME.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23" }));
        jPanel2.add(STR_TME, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, -1, -1));

        END_TME.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59" }));
        jPanel2.add(END_TME, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 120, -1, -1));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59" }));
        jPanel2.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 90, -1, -1));

        jLabel9.setText("minutes");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 130, -1, -1));

        jLabel10.setText("hrs");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 100, -1, -1));

        jLabel11.setText("hrs");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 130, -1, -1));

        jLabel12.setText("minutes");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 100, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void V_ID_GETActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_V_ID_GETActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_V_ID_GETActionPerformed

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        // TODO add your handling code here:
        while (true) {
            String trx = generateRandomString(8);
            //if (exist in database )continue;
            // insert the trx into vehileiD owners user ID:
            JOptionPane.showMessageDialog(this, trx);
            break;
        }
    }//GEN-LAST:event_jLabel5MouseClicked

    private void PAY_MEDIUMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PAY_MEDIUMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PAY_MEDIUMActionPerformed

    private void PROCEEDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PROCEEDActionPerformed
        // TODO add your handling code here: vehicle's user's database
        
        //if (trxid is not found in vehicle's ownners database, then print payment is not completed yet. trxid is wrong) return;
        
        String VID = V_ID_GET.getText();
        int veh_id = Integer.parseInt(VID);
        String t_id = TRXID.getText();
        String pm = (String) PAY_MEDIUM.getSelectedItem();
        int rsth = (int) STR_TME.getSelectedItem();
        int rstm = (int) jComboBox2.getSelectedItem();
        int rndh = (int) jComboBox3.getSelectedItem();
        int rndm = (int) END_TME.getSelectedItem();
        
        
        
    }//GEN-LAST:event_PROCEEDActionPerformed

    private void REF_TABLEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_REF_TABLEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_REF_TABLEActionPerformed

    private void REF_TABLEMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_REF_TABLEMouseClicked
        // TODO add your handling code here:
        Connection con;
        PreparedStatement pst;
        Class.forName("com.mysql.cj.jdbc.Driver");
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sports_01", "root", "");
        System.out.println("The database was connected");
        pst = con.prepareStatement("")

    }//GEN-LAST:event_REF_TABLEMouseClicked

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
            java.util.logging.Logger.getLogger(BICYCLE_RENT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BICYCLE_RENT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BICYCLE_RENT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BICYCLE_RENT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BICYCLE_RENT().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> END_TME;
    private javax.swing.JComboBox<String> PAY_MEDIUM;
    private javax.swing.JButton PROCEED;
    private javax.swing.JButton REF_TABLE;
    private javax.swing.JComboBox<String> STR_TME;
    private javax.swing.JTextField TRXID;
    private javax.swing.JTextField V_ID_GET;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
