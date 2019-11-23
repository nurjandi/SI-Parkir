import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
public class tampiltabel {
    koneksi k = new koneksi();
    public tampiltabel(){
        
    }
    
    public void tampilReport(JTable tbLaporan){
        String field[]={"nomor parkir","nomor polisi","jenis kendaraan","waktu masuk","waktu keluar","lama parkir(jam)","harga parkir (Rp)"};
        DefaultTableModel tblLaporan = new DefaultTableModel(null,field);
        try{ 
            k.koneksi();
            String sql = "select * from detail_parkir";
            ResultSet rs = k.cn.executeQuery(sql);
            while (rs.next())
            {
                tblLaporan.addRow(new Object[]{
                    rs.getString(1),
                    rs.getString(2),
                    rs.getString(3),
                    rs.getString(4),
                    rs.getString(5),
                    rs.getString(6),
                    rs.getString(7),
                });
            }
            tbLaporan.setModel(tblLaporan);
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "Ada kesalahan");
        }
    }
    

    //untuk semua data
    public tampiltabel(JTable tbLaporan){
        String field[]={"nomor parkir","nomor polisi","jenis kendaraan","waktu masuk","waktu keluar","lama parkir(jam)","harga parkir (Rp)"};
        DefaultTableModel tblLaporan = new DefaultTableModel(null,field);
        try{ 
            k.koneksi();
            String sql = "select * from detail_parkir";
            ResultSet rs = k.cn.executeQuery(sql);
            while (rs.next())
            {
                tblLaporan.addRow(new Object[]{
                    rs.getString(1),
                    rs.getString(2),
                    rs.getString(3),
                    rs.getString(4),
                    rs.getString(5),
                    rs.getString(6),
                    rs.getString(7),
                });
            }
            
            tbLaporan.setModel(tblLaporan);
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "Ada kesalahan");
        }
    }
    
    //untuk data yang dicari
    public tampiltabel(JTable tbLaporan, String nopol){
        String field[]={"nomor parkir","nomor polisi","jenis kendaraan","waktu masuk","waktu keluar","lama parkir(jam)","harga parkir (Rp)"};
        DefaultTableModel tblLaporan = new DefaultTableModel(null,field);
        try{ 
            k.koneksi();
            String sql = "select * from detail_parkir where nopol='"+nopol+"'";
            ResultSet rs = k.cn.executeQuery(sql);
            while (rs.next())
            {
                tblLaporan.addRow(new Object[]{
                    rs.getString(1),
                    rs.getString(2),
                    rs.getString(3),
                    rs.getString(4),
                    rs.getString(5),
                    rs.getString(6),
                    rs.getString(7),
                });
            }
            
            tbLaporan.setModel(tblLaporan);
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "Ada kesalahan");
        }
    }
    
    //untuk data berdasarkan interval hari
    public tampiltabel(JTable tbLaporan, int hari){
        
        String field[]={"nomor parkir","nomor polisi","jenis kendaraan","waktu masuk","waktu keluar","lama parkir(jam)","harga parkir (Rp)"};
        DefaultTableModel tblLaporan = new DefaultTableModel(null,field);
        try{ 
            k.koneksi();
            String sql = "select * from detail_parkir WHERE waktu_masuk between date(DATE_SUB(NOW(), INTERVAL "+hari+" day)) and date (now())";
            ResultSet rs = k.cn.executeQuery(sql);
            while (rs.next())
            {
                tblLaporan.addRow(new Object[]{
                    rs.getString(1),
                    rs.getString(2),
                    rs.getString(3),
                    rs.getString(4),
                    rs.getString(5),
                    rs.getString(6),
                    rs.getString(7),
                });
            }
            
            tbLaporan.setModel(tblLaporan);
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "Ada kesalahan");
        }
        
    }
        
}
