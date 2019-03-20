
public class Heron {

	public static void main(String[] args) {
		System.out.println(HeronA(6,20));
	}
	
	static float HeronA(float x, float n){
		float a = 0;
		a = x/2;
		for (int i = 1; i <= n; i++){
			a = a+x/a;
			a = a/2;
		};
		return a;
	}
}