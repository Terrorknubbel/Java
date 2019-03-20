
public class Euklid {

	public static void main(String[] args) {
		System.out.println (ggt(24,18));

	}
	static int ggt(int a, int b){
		if (a==0) return b;
		else
			while (b!=0){
				if (a>b) a=a-b;
				else b=b-a;
			}
		return a;
		
	}

}
