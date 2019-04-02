import java.applet.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class visual extends Applet implements ActionListener{

	private static final long serialVersionUID = 1L;
		
	static line line;
	
	static Graphics stift;
	
	static int max = 20;
	
	int x = 10;
	static int y = 600;
	static int hoehe = 600;
	static int breite = 600;

	
	Button Bubble,Selection,reset;
	
	static int[] feld = new int[max];

	public void init(){
		setSize(hoehe, breite);
		setBackground(Color.white);
		
		
		stift = getGraphics();


		Bubble = new Button("Bubblesort");
		Selection = new Button("SelectionSort");
		reset = new Button("Reset");
		
		add(reset);
		add(Selection);
		add(Bubble);
		
		reset.setBounds(breite-100,10, 90, 20);
		Bubble.setBounds(breite-100, 40, 90, 20);
		Selection.setBounds(breite-100, 70, 90, 20);
		
		setLayout(null);
		
		reset.addActionListener(this);
		Selection.addActionListener(this);
		Bubble.addActionListener(this);
		
		
		feld_fuellen();
		feld_ausgeben();
		
	}
	
	public void paint(Graphics stift){	
		for(int i = 0; i<max; i++){
			line = new line(i*20, hoehe, i*20, hoehe-feld[i]*(hoehe/100));
			line.zeichne(stift);
			stift.drawString(Integer.toString(feld[i]), i*20, hoehe-feld[i]*(hoehe/100));
			try {
				Thread.sleep(25);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		};
		
	}
	
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == Bubble){
			Bubblesort.auswahl_sortiere();
		}else if (e.getSource() == reset){
			line.clear(stift);
			feld_fuellen();
			paint(stift);
		}else{
			SelectionSort.auswahl_sortiere();
		}
			
	}
	
	static void feld_fuellen(){
		for (int i=0; i<max;i++){
			feld[i]=(int)(Math.random()*100+1);
		}
	}
	
	static void feld_ausgeben(){
		for (int i=0; i<max; i++){
			System.out.print(feld[i]+" ");
		}
		System.out.println();
	}	
	
	public static class Bubblesort{	
		
		public static void drawsort(Graphics stift){
			line.clear(stift);	
			for(int i = 0; i<max; i++){
				line = new line(i*20, hoehe, i*20, y-feld[i]*(hoehe/100));
				line.zeichne(stift);
				stift.drawString(Integer.toString(feld[i]), i*20, hoehe-feld[i]*(hoehe/100));
				
				
			};
		}
		
		static void auswahl_sortiere() {
			int letztes;
			letztes = max-1;
			for (int i = 0; i<letztes; i++){
				for(int j = letztes; j>i; j--){
					if (feld[j-1]>feld[j]){
						tausche(j,j-1);
						drawsort(stift);
						try {
							Thread.sleep(25);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					};
						
			
				};
				
			}
		}
		
		static void tausche(int a, int b){
			int hilf;
			hilf=feld[a];
			feld[a]=feld[b];
			feld[b] = hilf;
		}
		
	}
	
	
	public static class SelectionSort{
	
		public static void drawsort(Graphics stift){
			line.clear(stift);	
			for(int i = 0; i<max; i++){
				line = new line(i*20, hoehe, i*20, hoehe-feld[i]*(hoehe/100));
				line.zeichne(stift);
				stift.drawString(Integer.toString(feld[i]), i*20, y-feld[i]*(hoehe/100));
				
				
			};
		}
		
		static void auswahl_sortiere() {
			int grenze, letztes;
			letztes = max-1;
			for (grenze = 0; grenze<letztes; grenze++){
				int kleinstes = letztes;
				for(int i=grenze; i<=letztes; i++){
					drawsort(stift);
					try {
						Thread.sleep(25);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					if (feld[i]<feld[kleinstes]) kleinstes=i;
				};
				tausche(grenze,kleinstes);
			}
		}
		
		static void tausche(int a, int b){
			int hilf;
			hilf=feld[a];
			feld[a]=feld[b];
			feld[b] = hilf;
		}
	}

	

}
