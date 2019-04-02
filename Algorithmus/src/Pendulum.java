
import java.applet.*;
import java.awt.Graphics;
import java.awt.event.*;
import java.awt.*;




public class Pendulum extends Applet implements ActionListener{
	

	private static final long serialVersionUID = -2168644634193138754L;

	static Pendel Figur;
	
	Graphics stift;
	
	int x = 300; // x,y Koordinaten für Ball Rot
	int y = 200;
	
	int w; // x,y Koordinaten für Ball Blau
	int z;
	
	int a; // x,y Koordinaten für Ball Schwarz
	int b;
	
	double Winkel = 90;  // Startposition
	double Winkel2 = 90;
	
	int Richtung = 1;
	int RichtungS = 1;
	
	int Energie = 100;

	double g = 0; //Geschwindigkeit
	double g2 = 0;
	double Speicher = 0;
	
	boolean t = true;
	
	public void init(){
		
		setSize(600,600);
		setBackground(Color.white);
		
		
		stift = getGraphics();
		
		
		Figur = new Pendel(x,y, w,z, a,b);
		
		Figur.position();
		
	}
	

	public void paint(Graphics stift){	
		
		
		while(t == true){
		
			if(Richtung == 1) {
			BallBlau(stift);
			}
			
			if(Richtung == 0) {
			BallBlauR(stift);
			}
		
			if(RichtungS == 1) {
			BallSchwarz(stift);
			}
			
			if(RichtungS == 0) {
			BallSchwarzR(stift);
			}
			
			System.out.println("---------");
			System.out.println("Geschwindigkeit: " + outg());
			System.out.println("GeschwindigkeitS: " + outg2());
			System.out.println("Energie: " + Energie);
			System.out.println("Winkel: " + Winkel);
			System.out.println("WinkelS: " + Winkel2);
			
	
			/*
			if(Energie <= 0){
				t = false;
			};*/
			
			
			Geschwindigkeit();
			GeschwindigkeitR();
			
			try {
				Thread.sleep(25);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		} 
				
		
	}
	
	
	public double outg(){
		return g;
	}
	
	public double outg2(){
		return g2;
	}
	
	
	public double Geschwindigkeit() {

		
		if (Winkel <= 0){
			g -= 0.5;
			
		};
		
		
		if (Winkel >= 0){
			g += 0.5;
			
		};
		
		if (w >= 350){
			Energie += 5;
		};
		
		
		
		
		
		/*
		Speicher = g;
		
		if (Speicher < 0){
			Speicher = Speicher * -1;
		};
		
		if (Energie >= 110 || Energie <= -50){
			g = g * 0.8; 
		};*/
		
		return g;
	};
	
	public double GeschwindigkeitR() {
		
		
		if (Winkel2 <= 0 ){
			g2 -= 0.5;
		}
		
		
		if (Winkel2 >= 0){
			g2 += 0.5;
		}
		
		if (Winkel <= 0){
			if (Winkel2 <= 0 ){
				g2 -= 0.5;
			}
			
			
			if (Winkel2 >= 0){
				g2 += 0.5;
			}
		}
		
		if (Winkel >= 0){
			if (Winkel2 <= 0 ){
				g2 += 0.1;
			}
			
			
			if (Winkel2 >= 0){
				g2 -= 0.1;
			}
		}
		

		return g2;
	}
	
	
	public void BallBlau(Graphics stift){
		
		double wSinus = (x + Math.sin(Math.toRadians(Winkel))*100);
		w = (int) Math.round(wSinus);
		
		System.out.println("X Koordinate: " + w);
		
		double zCosinus = (y + Math.cos(Math.toRadians(Winkel))*100);
		z = (int) Math.round(zCosinus);
		
		System.out.println("Y Koordinate: " + z);
		System.out.println("-----------");
		
		Winkel -= Geschwindigkeit();
		
		Figur.zeichne(stift);
		
	}
	
	public void BallBlauR(Graphics stift){
			
		double wSinus = (x + Math.sin(Math.toRadians(Winkel))*100);
		w = (int) Math.round(wSinus);
		

		
		double zCosinus = (y + Math.cos(Math.toRadians(Winkel))*100);
		z = (int) Math.round(zCosinus);
		
	
		
		Winkel += Geschwindigkeit();	
		
		Figur.zeichne(stift);
		
	
	}
	
	
	
	
	public void BallSchwarz(Graphics stift){
		
		
		double aSinus = (w + Math.sin(Math.toRadians(Winkel2))*100);
		a = (int) Math.round(aSinus);
		
		double bCosinus = (z + Math.cos(Math.toRadians(Winkel2))*100);
		b = (int) Math.round(bCosinus);
		
		System.out.println();
		
		
		
		Figur = new Pendel(x,y, w,z, a, b);
		
		Winkel2 -= GeschwindigkeitR();
		
		Figur.zeichne(stift);
		
	
	}
	
	public void BallSchwarzR(Graphics stift){
	
		
		double aSinus = (w + Math.sin(Math.toRadians(Winkel2))*100);
		a = (int) Math.round(aSinus);
		
		double bCosinus = (z + Math.cos(Math.toRadians(Winkel2))*100);
		b = (int) Math.round(bCosinus);
		
		System.out.println();
		Figur = new Pendel(x,y, w,z, a, b);
		
		Winkel2 += GeschwindigkeitR();
		
		Figur.zeichne(stift);
		
		
	
	}



	}

