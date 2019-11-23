import javax.media.Player;
import javax.media.MediaLocator;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.media.Manager;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.media.Buffer;
import javax.media.CannotRealizeException;
import javax.media.NoPlayerException;
import javax.media.control.FrameGrabbingControl;
import javax.media.format.VideoFormat;
import javax.media.util.BufferToImage;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
public class Capture {
    Player broadcast = null;
    Image img = null;
    public Component komponen() throws IOException, NoPlayerException {
        Component comp_video;
        MediaLocator loc = new MediaLocator("vfw://0");
        try {
            broadcast = Manager.createRealizedPlayer(loc);
            broadcast.start();
        } catch (CannotRealizeException ex) {
            Logger.getLogger(Capture.class.getName()).log(Level.SEVERE, null, ex);
        }
        if((comp_video = broadcast.getVisualComponent()) != null){
            comp_video.setSize(400, 370);
            return comp_video;
        }
        else{
            return null;
        }
    }
    public void capture_image(String auto_inc){
        FrameGrabbingControl grab = (FrameGrabbingControl) broadcast.getControl("javax.media.control.FrameGrabbingControl");
        Buffer buff = grab.grabFrame();
        BufferToImage buffer = new BufferToImage((VideoFormat) buff.getFormat());
        img = buffer.createImage(buff);
        BufferedImage image = (BufferedImage) img;
        try {
            ImageIO.write(image, "png", new File("C:\\Users\\DELL\\Desktop\\"+auto_inc+".png"));
            JOptionPane.showMessageDialog(null, "gambar berhasil disimpan");
        } catch (IOException ex) {
            Logger.getLogger(Capture.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public Image open_image(){
        Image img;
        ImageIcon ii = new ImageIcon("C:\\Users\\DELL\\Desktop\\2.png");
        img = ii.getImage();
        return img;
    }
}
