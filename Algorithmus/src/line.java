import java.awt.Color;
import java.awt.Graphics;
public class line extends Thread {

	int XKoord;
	int YKoord;
	
	int XKoord2;
	int YKoord2;
	
	public line (int XKoord, int YKoord, int XKoord2, int YKoord2){
			
			this.XKoord = XKoord;
			this.YKoord = YKoord;
			
			this.XKoord2 = XKoord2;
			this.YKoord2 = YKoord2;
			
	}
	
	public void zeichne(Graphics stift){
			
		stift.setColor(Color.black);									
		stift.drawLine(XKoord, YKoord, XKoord2, YKoord2);
		
	}
	
	public void clear(Graphics stift){
		stift.setColor(Color.white);		
		stift.fillRect(0, 0, 800, 800);
	}
	
}
