import java.util.Random;
import java.util.Scanner;


public class Spiel {

	static Karte[] Karten = new Karte[32];
	static Karte[] KartenA = new Karte[Karten.length/2];
	static Karte[] KartenB = new Karte[Karten.length/2];

	static int Runde = 0;
	static int AuswahlA;
	static int AuswahlB;
	static int AnzahlKartenA = 16;
	static int AnzahlKartenB = 16;

	public static void main(String[] args) {

	Karten[0] = new Karte("Auto1", 0, 0, 0);
	Karten[1] = new Karte("Auto2", 1300, 45, 345);
	Karten[2] = new Karte("Auto3", 4230, 52, 423);
	Karten[3] = new Karte("Auto4", 2343, 43, 234);
	Karten[4] = new Karte("Auto5", 1543, 83, 134);
	Karten[5] = new Karte("Auto6", 2373, 83, 334);
	Karten[6] = new Karte("Auto7", 5343, 43, 484);
	Karten[7] = new Karte("Auto8", 1020, 20, 299);
	Karten[8] = new Karte("Auto9", 1553, 10, 345);
	Karten[9] = new Karte("Auto10", 5755, 73, 434);
	Karten[10] = new Karte("Auto11", 3343, 102, 684);
	Karten[11] = new Karte("Auto12", 4343, 25, 548);
	Karten[12] = new Karte("Auto13", 2943, 77, 245);
	Karten[13] = new Karte("Auto14", 2999, 85, 754);
	Karten[14] = new Karte("Auto15", 2999, 38, 248);
	Karten[15] = new Karte("Auto16", 1000, 100, 756);
	Karten[16] = new Karte("Auto17", 5234, 99, 845);
	Karten[17] = new Karte("Auto18", 3462, 99, 154);
	Karten[18] = new Karte("Auto19", 1342, 98, 80);
	Karten[19] = new Karte("Auto20", 5123, 54, 64);
	Karten[20] = new Karte("Auto21", 2000, 76, 159);
	Karten[21] = new Karte("Auto22", 3000, 43, 145);
	Karten[22] = new Karte("Auto23", 4000, 68, 145);
	Karten[23] = new Karte("Auto24", 5000, 76, 189);
	Karten[24] = new Karte("Auto25", 6000, 49, 654);
	Karten[25] = new Karte("Auto26", 3142, 94, 245);
	Karten[26] = new Karte("Auto27", 5232, 16, 285);
	Karten[27] = new Karte("Auto28", 6132, 86, 354);
	Karten[28] = new Karte("Auto29", 1341, 43, 524);
	Karten[29] = new Karte("Auto30", 999, 120, 756);
	Karten[30] = new Karte("Auto31", 600, 111, 288);
	Karten[31] = new Karte("Auto32", 423, 24, 666);



	System.out.println("~~~~~Autoquartett~~~~~");
	System.out.println("");
	gameloop();


	};

	public static void gameloop(){
		if(AnzahlKartenA == 0){
			System.out.println("~~~~~~~~~Spieler2 hat das Spiel gewonnen!!~~~~~~~~~");
			System.exit(0);
		}else if(AnzahlKartenB == 0){
			System.out.println("~~~~~~~~~Spieler1 hat das Spiel gewonnen!!~~~~~~~~~");
			System.exit(0);
		}else{
			
		};
		
		mischen();
		for (int i = 0; i < 16; i++){
			KartenA[i] = Karten[i];
		};
		for (int i = 0; i < 16; i++){
			KartenB[i] = Karten[i+16];
		};

		if(KartenA[Runde].equals(null)){
			gameloop();
		}else{

		};

		System.out.println("__Neue Runde__");
		System.out.println("");
		System.out.println("Sie haben " + AnzahlKartenA + " Karten");
		System.out.println("(Der Gegner hat " + AnzahlKartenB + " Karten)");
		System.out.println("Ihre oberste Karte ist: " + KartenA[Runde].Name);
		System.out.println("Hubraum: " + KartenA[Runde].Hubraum + " ccm");
		System.out.println("Leistung " + KartenA[Runde].Leistung + " kW");
		System.out.println("Höchstgeschwindigkeit " + KartenA[0].Höchstgeschwindigkeit + " km/h");
		System.out.println("");
		System.out.println("Sie sind am Zug.");

		Abfrage();
		
	};
	
	public static void Abfrage(){
		@SuppressWarnings("resource")
		Scanner myObj = new Scanner(System.in);
	    System.out.println("Welches Attribut wollen Sie setzen?");
	    System.out.println("Tippen Sie 'A' für Hubraum, 'B' für Leistung', oder 'C' für Höchstgeschwindigkeit: ");

	    String Attribut = myObj.nextLine();
	    if(Attribut.equals("A")){
	    	System.out.println("Sie wählen Hubraum, der Wert beträgt " + KartenA[Runde].Hubraum + " ccm");
	    	AuswahlA = KartenA[Runde].Hubraum;
	    	System.out.println("");
	    	AuswahlA = 1;
	    	GegnerReaktion();
	    }else if(Attribut.equals("B")){
	    	System.out.println("Sie wählen Leistung, der Wert beträgt " + KartenA[Runde].Leistung + " kW");
	    	AuswahlA = KartenA[Runde].Leistung;
	    	System.out.println("");

	    	AuswahlA = 2;
	    	GegnerReaktion();
	    }else if(Attribut.equals("C")){
	    	System.out.println("Sie wählen Höchstgeschwindigkeit, der Wert beträgt " + KartenA[Runde].Höchstgeschwindigkeit + " km/h");

	    	AuswahlA = KartenA[Runde].Höchstgeschwindigkeit;
	    	System.out.println("");

	    	AuswahlA = 3;
	    	GegnerReaktion();
	    }else{
	    	System.out.println("Mit der Eingabe scheint etwas nicht zu stimmen");
	    	Abfrage();
	    }
	}

	public static void GegnerReaktion(){

		System.out.println("Der Gegner ist am Zug..");
    	System.out.println("");
		System.out.print("Gegner setzt Karte " + KartenB[Runde].Name + " mit dem Attribut: ");

		if(AuswahlA == 1){
			System.out.println("Hubraum " + KartenB[Runde].Hubraum + " ccm");
			if(KartenA[Runde].Hubraum < KartenB[Runde].Hubraum){
				System.out.println("Spieler 2 hat die Runde gewonnen");
				KartenA[Runde] = null;
				AnzahlKartenA -= 1;
				System.out.println("");
				gameloop();
			}else if(KartenA[Runde].Hubraum > KartenB[Runde].Hubraum){
				System.out.println("Spieler 1 hat die Runde gewonnen");
				KartenB[Runde] = null;
				AnzahlKartenB -= 1;
				System.out.println("");
				gameloop();
			}else{
				System.out.println("Die Werte sind gleich!");

				System.out.println("");

				gameloop();
			}

		}else if(AuswahlA == 2){
			System.out.println("Leistung " + KartenB[Runde].Leistung + " kW");
			if(KartenA[Runde].Leistung < KartenB[Runde].Leistung){
				System.out.println("Spieler 2 hat die Runde gewonnen");
				KartenA[Runde] = null;
				AnzahlKartenA -= 1;
				System.out.println("");
				gameloop();
			}else if(KartenA[Runde].Leistung > KartenB[Runde].Leistung){
				System.out.println("Spieler 1 hat die Runde gewonnen");
				KartenA[Runde] = null;
				AnzahlKartenB -= 1;
				System.out.println("");
				gameloop();
			}else{
				System.out.println("Die Werte sind gleich!");

				System.out.println("");

				gameloop();
			}

		}else{
			System.out.println("Höchstgeschwindigkeit " + KartenB[Runde].Höchstgeschwindigkeit + " km/h");
			if(KartenA[Runde].Höchstgeschwindigkeit < KartenB[Runde].Höchstgeschwindigkeit){
				System.out.println("Spieler 2 hat die Runde gewonnen");
				KartenA[Runde] = null;
				AnzahlKartenA -= 1;
				System.out.println("");
				gameloop();
			}else if(KartenA[Runde].Höchstgeschwindigkeit > KartenB[Runde].Höchstgeschwindigkeit){
				System.out.println("Spieler 1 hat die Runde gewonnen");
				KartenA[Runde] = null;
				AnzahlKartenB -= 1;
				System.out.println("");
				gameloop();
			}else{
				System.out.println("Die Werte sind gleich!");

				System.out.println("");

				gameloop();
			}
		}
	};

	public static Karte[] mischen(){
		Random r = new Random();
        for (int i = 0; i < Karten.length; i++) {
            int rand = r.nextInt(Karten.length);
            Karte tmp = Karten[i];
            Karten[i] = Karten[rand];
            Karten[rand] = tmp;
        } ;
		return Karten;

	};

}



