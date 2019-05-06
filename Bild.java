import java.awt.*;
import java.awt.image.*;
import java.io.*;
import javax.swing.*;
import javax.imageio.ImageIO;

public class Bild {

	public static void main(String[] args) throws IOException{
		JPanel panel = new JPanel();
		 
	    BufferedImage image = ImageIO.read(new File("Z:/HTML/Shop/E-Piano.jpg"));
	    JLabel label = new JLabel(new ImageIcon(image));
	    panel.add(label);
	 
	    // main window

	    JFrame frame = new JFrame("JPanel Example");
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 
	    // add the Jpanel to the main window
	    frame.add(panel); 
	 
	    frame.pack();
	    frame.setVisible(true);

	}

}
