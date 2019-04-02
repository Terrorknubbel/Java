
import java.awt.Color;
import java.awt.Graphics;

public class Pendel extends Thread {
	int XKoord;	//Ball 1
	int YKoord;
	
	int XKoord2; //Ball 2
	int YKoord2;
	
	int XKoord3; //Ball 3
	int YKoord3;
	
	public Pendel (int pXKoord, int pYKoord, int pXKoord2, int pYKoord2, int pXKoord3, int pYKoord3){
		
		XKoord = pXKoord;
		YKoord = pYKoord;
		
		XKoord2 = pXKoord2;
		YKoord2 = pYKoord2;
		
		XKoord3 = pXKoord3;
		YKoord3 = pYKoord3;
		
	}
	
	
	public void zeichne(Graphics stift){
		
		stift.setColor(Color.white);		//Löschen des vorherigen Frames
		stift.fillRect(0, 0, 600, 600);
		
		
		stift.setColor(Color.black);										//Linie 1
		stift.drawLine(XKoord+10, YKoord+10, XKoord2+10, YKoord2+10);
		
		stift.setColor(Color.red);											//Ball rot
		stift.fillOval(XKoord, YKoord, 20, 20);
		
		stift.setColor(Color.black);										//Linie 2
		stift.drawLine(XKoord2+10, YKoord2+10, XKoord3+10, YKoord3+10);
		
		stift.setColor(Color.blue);											//Ball blau
		stift.fillOval(XKoord2, YKoord2, 20, 20);
		
		stift.setColor(Color.black);										//Ball schwarz
		stift.fillOval(XKoord3, YKoord3, 20,20);
	}
	
	public void position(){
		System.out.println("Meine Position ist: " + XKoord + " | " + YKoord);
	}
}