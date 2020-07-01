
import java.io.File;
import java.io.IOException;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;
import javax.imageio.ImageIO;

public class myGraphics {
    public static void main(String[] args) throws IOException {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(620, 480);
        MainFormAppearance demo = new MainFormAppearance();
	    frame.setContentPane(demo.createContentPane());



      frame.setVisible(true);
      
    }
}