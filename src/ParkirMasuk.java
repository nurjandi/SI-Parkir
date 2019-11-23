import java.awt.Image;
import java.io.IOException;
import java.util.logging.Level;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.imageio.ImageIO;
import javax.media.NoPlayerException;
import java.awt.HeadlessException;
import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;

public class ParkirMasuk extends javax.swing.JFrame {
    koneksi k = new koneksi();
    Capture capture;
    
    /**
     * Creates new form login
     */
    
    public ParkirMasuk() {
        initComponents();
        displayDate();
        
        capture = new Capture();
        try {
            jPanel3.add(capture.komponen());
        } catch (IOException ex) {
            Logger.getLogger(ParkirMasuk.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NoPlayerException ex) {
            Logger.getLogger(ParkirMasuk.class.getName()).log(Level.SEVERE, null, ex);
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

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btReset = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tfNopol = new javax.swing.JTextField();
        btSave = new javax.swing.JButton();
        cbJenisKendaraan = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lDate = new javax.swing.JLabel();
        bg = new javax.swing.JLabel();

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 370, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 150, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images_layout/Bmasuk.PNG"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel2MouseExited(evt);
            }
        });
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 250, 120));

        jPanel1.setBackground(new java.awt.Color(221, 57, 50));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btReset.setText("reset");
        btReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btResetActionPerformed(evt);
            }
        });
        jPanel1.add(btReset, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 240, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nomor Polisi");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 80, 30));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Jenis Kendaraan");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        tfNopol.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tfNopol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNopolActionPerformed(evt);
            }
        });
        jPanel1.add(tfNopol, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 40, 150, 30));

        btSave.setText("save");
        btSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSaveActionPerformed(evt);
            }
        });
        jPanel1.add(btSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 240, 20));

        cbJenisKendaraan.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "motor", "mobil" }));
        cbJenisKendaraan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbJenisKendaraanActionPerformed(evt);
            }
        });
        jPanel1.add(cbJenisKendaraan, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, 150, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 280, 370));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("CURRENT DATE:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 200, 160, -1));

        jPanel2.setBackground(new java.awt.Color(255, 51, 0));

        lDate.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lDate.setForeground(new java.awt.Color(255, 255, 255));
        lDate.setText("jLabel4");
        jPanel2.add(lDate);

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 230, 160, 30));

        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images_layout/menubg.jpg"))); // NOI18N
        getContentPane().add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfNopolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNopolActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNopolActionPerformed

    private void cbJenisKendaraanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbJenisKendaraanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbJenisKendaraanActionPerformed

    private void btSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSaveActionPerformed
        // TODO add your handling code here:

        String nopol = tfNopol.getText();
        String jenisKendaraan = cbJenisKendaraan.getSelectedItem().toString();
        try{
            k.koneksi();
            //Statement cn = (Statement)koneksi.GetConnection().createStatement();
            k.cn.executeUpdate("insert into detail_parkir(nopol,jenis_kendaraan) values('"+nopol+"' ,'"+jenisKendaraan+"');");
            
            //ngambil id
            ResultSet rs = k.cn.executeQuery("select max(id) from detail_parkir;");
            String maxid = null;
            if(rs.next()){
                maxid = rs.getString(1);
            }
            capture.capture_image(maxid);
            //akhir ngambil id
            k.conn.close();
            JOptionPane.showMessageDialog(null,"data tersimpan");
        }catch (SQLException | HeadlessException t){
            JOptionPane.showMessageDialog(null,"data tidak tersimpan");
        }

        //print tiket parkir
        Connection conn = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost/parkir", "root", "");
        }
        catch (SQLException | ClassNotFoundException ex) {
        }

        try {
            File f = new File("src/laporan/tiket.jrxml");
            Map<String,Object> par = new HashMap<String,Object>();
            JasperDesign jasperDesign = JRXmlLoader.load(f);
            par.put("nopol",nopol);
            JasperReport jasperReport = JasperCompileManager.compileReport(jasperDesign);

            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, par,conn);
            JasperViewer.viewReport(jasperPrint,false);

        } catch (Exception e) {
            System.out.println(e);
        }
        
        //akhir print tiket karcis
    }//GEN-LAST:event_btSaveActionPerformed

    private void btResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btResetActionPerformed
        // TODO add your handling code here:
        tfNopol.setText(null);
    }//GEN-LAST:event_btResetActionPerformed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        
        new menu().setVisible(true);
        
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseEntered
        
    }//GEN-LAST:event_jLabel2MouseEntered

    private void jLabel2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseExited
       
    }//GEN-LAST:event_jLabel2MouseExited

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
                new ParkirMasuk().setVisible(true);
            }
        });
    }
    
    public void displayDate(){
        Date date = new Date();
        DateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd HH:mm");
        String dateNow = String.format(dateFormat.format(date));
        lDate.setText(dateNow);
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bg;
    private javax.swing.JButton btReset;
    private javax.swing.JButton btSave;
    private javax.swing.JComboBox cbJenisKendaraan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lDate;
    private javax.swing.JTextField tfNopol;
    // End of variables declaration//GEN-END:variables
}
