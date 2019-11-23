


import java.sql.ResultSet;
import javax.swing.JOptionPane;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class GantiPass extends javax.swing.JFrame {
    koneksi k = new koneksi();
    /**
     * Creates new form TambahAdmin
     */
    public GantiPass() {
        initComponents();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tfUname = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btUbah = new javax.swing.JButton();
        tfOld = new javax.swing.JPasswordField();
        tfNew = new javax.swing.JPasswordField();
        rGantiPass = new javax.swing.JLabel();
        bg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tfUname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfUnameActionPerformed(evt);
            }
        });
        getContentPane().add(tfUname, new org.netbeans.lib.awtextra.AbsoluteConstraints(144, 140, 190, -1));

        jLabel1.setForeground(new java.awt.Color(255, 102, 0));
        jLabel1.setText("Username");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(46, 143, -1, -1));

        jLabel2.setForeground(new java.awt.Color(255, 102, 0));
        jLabel2.setText("Password Lama");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(46, 181, -1, -1));

        jLabel3.setForeground(new java.awt.Color(255, 102, 0));
        jLabel3.setText("Password Baru");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(46, 219, -1, -1));

        btUbah.setForeground(new java.awt.Color(255, 102, 0));
        btUbah.setText("Ubah");
        btUbah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btUbahActionPerformed(evt);
            }
        });
        getContentPane().add(btUbah, new org.netbeans.lib.awtextra.AbsoluteConstraints(277, 270, 70, -1));
        getContentPane().add(tfOld, new org.netbeans.lib.awtextra.AbsoluteConstraints(144, 178, 190, -1));
        getContentPane().add(tfNew, new org.netbeans.lib.awtextra.AbsoluteConstraints(144, 216, 190, -1));

        rGantiPass.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images_layout/rGantiPass.PNG"))); // NOI18N
        rGantiPass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rGantiPassMouseClicked(evt);
            }
        });
        getContentPane().add(rGantiPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, -10, -1, 110));

        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images_layout/bgTambahAdmin.jpg"))); // NOI18N
        getContentPane().add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 370, 480));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btUbahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btUbahActionPerformed
        k.koneksi();
        try {
            ResultSet rs = k.cn.executeQuery("select * from admin where username = '"+tfUname.getText()+"' and password = '"+String.valueOf(tfOld.getPassword())+"';");
            if(rs.next()){
                k.cn.executeUpdate("update admin set password='"+tfNew.getText()+"' where username='"+tfUname.getText()+"' ;");
                JOptionPane.showMessageDialog(null,"Password sudah dirubah");
            }
            else{
                 JOptionPane.showMessageDialog(null,"Password lama atau username salah!");
            }
        } catch (SQLException ex) {
            Logger.getLogger(TambahAdmin.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,"Data yang dimasukkan salah");
        }
    }//GEN-LAST:event_btUbahActionPerformed

    private void tfUnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfUnameActionPerformed
        
    }//GEN-LAST:event_tfUnameActionPerformed

    private void rGantiPassMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rGantiPassMouseClicked
        this.setVisible(false);
        new Admin().setVisible(true);
    }//GEN-LAST:event_rGantiPassMouseClicked

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
            java.util.logging.Logger.getLogger(TambahAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TambahAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TambahAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TambahAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GantiPass().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bg;
    private javax.swing.JButton btUbah;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel rGantiPass;
    private javax.swing.JPasswordField tfNew;
    private javax.swing.JPasswordField tfOld;
    private javax.swing.JTextField tfUname;
    // End of variables declaration//GEN-END:variables
}
