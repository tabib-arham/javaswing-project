/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package travelmanagement;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author tabib
 */
public class checkingticket extends javax.swing.JFrame {

    Connection con=null;
    PreparedStatement pr=null;
    /**
     * Creates new form checkingticket
     */
    public checkingticket() {
        initComponents();
        con=connectionclass.connectDB();
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
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        transport = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        From = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        To = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        time = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));
        jPanel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/travel(1).jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(593, 0, -1, -1));

        jLabel3.setFont(new java.awt.Font("sansserif", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 255));
        jLabel3.setText("check for ticket");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(514, 36, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Transport name");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(264, 101, -1, -1));

        transport.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        transport.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Goldenline", "Southline", "Hanif", "Shohag", "Eagle" }));
        jPanel1.add(transport, new org.netbeans.lib.awtextra.AbsoluteConstraints(272, 138, 135, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("From");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(425, 101, 95, -1));

        From.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        From.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Dhaka", "Gabtoli", "Faridpur", "Jossore", "Barisal" }));
        jPanel1.add(From, new org.netbeans.lib.awtextra.AbsoluteConstraints(425, 138, 84, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setText("To");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(599, 101, 64, -1));

        To.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        To.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Dhaka", "Gabtoli", "Faridpur", "Jossore", "Barisal" }));
        jPanel1.add(To, new org.netbeans.lib.awtextra.AbsoluteConstraints(599, 138, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setText("Time");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 101, 72, -1));
        jPanel1.add(time, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 138, 72, -1));

        jButton1.setBackground(new java.awt.Color(204, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/search.png"))); // NOI18N
        jButton1.setText("Go For Check");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(515, 216, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/bus.jpg"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 1230, 780));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String transportname = transport.getSelectedItem().toString();
        String staringpoint  = From.getSelectedItem().toString();
        String endpoint= To.getSelectedItem().toString();
        String Time=time.getText();
        try {
            String Sql = "Select transportname,staringpoint,endpoint,journeydate From interfaceadmin";
            Statement st = con.createStatement();
            ResultSet rt = st.executeQuery(Sql);
            int count = 0;
            while (rt.next()) {
                String tname = rt.getString("transportname");
                String tfrom = rt.getString("staringpoint");
                String tto=rt.getString("endpoint");
                String ttime=rt.getString("journeydate");
                if (tname.equals(transportname) && tfrom.equals(staringpoint) && tto.equals(endpoint) && ttime.equals(Time)) {
                    JOptionPane.showMessageDialog(null, "Yes Bus is available For this route");
                    new userinterface().setVisible(true);
                    dispose();
                    count = 1;
                }
            }
            if (count == 0) {
                JOptionPane.showMessageDialog(null, "NO bus in this route");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        new userinterface().setVisible(true);
        dispose();
        // TODO add your handling code here:
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
            java.util.logging.Logger.getLogger(checkingticket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(checkingticket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(checkingticket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(checkingticket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new checkingticket().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> From;
    private javax.swing.JComboBox<String> To;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField time;
    private javax.swing.JComboBox<String> transport;
    // End of variables declaration//GEN-END:variables
}
