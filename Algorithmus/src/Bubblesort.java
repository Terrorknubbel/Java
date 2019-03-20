
public class Bubblesort {

	static int max = 20;
	static int[] feld = new int[max];
	public static void main(String[] args) {
		feld_fuellen();
		System.out.println("Unsortiertes Feld:");
		feld_ausgeben();
		auswahl_sortiere();
		System.out.println("Sortiertes Feld: ");
		feld_ausgeben();
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
	
	static void auswahl_sortiere() {
		int letztes;
		letztes = max-1;
		for (int i = 0; i<letztes; i++){
			for(int j = letztes; j>i; j--){
				if (feld[j-1]>feld[j]){
					tausche(j,j-1);
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
