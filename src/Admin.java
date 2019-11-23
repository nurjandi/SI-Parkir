
import java.awt.HeadlessException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Admin extends javax.swing.JFrame {
    koneksi k = new koneksi();
    /**
     * Creates new form login
     */
    public Admin() {
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

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jLabel3 = new javax.swing.JLabel();
        TambahAdmin = new javax.swing.JButton();
        GantiPassword = new javax.swing.JButton();
        GantiTarif = new javax.swing.JButton();
        bg = new javax.swing.JLabel();

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images_layout/Badmin.PNG"))); // NOI18N
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, -1, -1));

        TambahAdmin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images_layout/bTambahAdmin.PNG"))); // NOI18N
        TambahAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TambahAdminActionPerformed(evt);
            }
        });
        getContentPane().add(TambahAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 240, 150, 150));

        GantiPassword.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images_layout/bGantiPass.PNG"))); // NOI18N
        GantiPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GantiPasswordActionPerformed(evt);
            }
        });
        getContentPane().add(GantiPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 240, 150, 150));

        GantiTarif.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images_layout/bGantiTarif.PNG"))); // NOI18N
        GantiTarif.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GantiTarifActionPerformed(evt);
            }
        });
        getContentPane().add(GantiTarif, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 240, 150, 150));

        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images_layout/menubg.jpg"))); // NOI18N
        getContentPane().add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void GantiPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GantiPasswordActionPerformed
        GantiPass gp = new GantiPass();
        gp.setVisible(true);
        gp.setLocationRelativeTo(null);
    }//GEN-LAST:event_GantiPasswordActionPerformed

    private void TambahAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TambahAdminActionPerformed
        TambahAdmin ta = new TambahAdmin();
        ta.setVisible(true);
        ta.setLocationRelativeTo(null);
    }//GEN-LAST:event_TambahAdminActionPerformed

    private void GantiTarifActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GantiTarifActionPerformed
        GantiTarif gt = new GantiTarif();
        gt.setVisible(true);
        gt.setLocationRelativeTo(null);
    }//GEN-LAST:event_GantiTarifActionPerformed

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        this.setVisible(false);
        new menu().setVisible(true);
    }//GEN-LAST:event_jLabel3MouseClicked

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
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin().setVisible(true);
            }
        });
    }
    
    public String getTanggal(){
        Date date = new Date();
        DateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String dateNow = String.format(dateFormat.format(date));
        return dateNow;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton GantiPassword;
    private javax.swing.JButton GantiTarif;
    private javax.swing.JButton TambahAdmin;
    private javax.swing.JLabel bg;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}
