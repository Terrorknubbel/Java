import java.util.Scanner;
public class fibonacci {

	public static void main(String[] args) {
		Scanner ein = new Scanner(System.in);
		int N;
		System.out.print("N: ");
		N = ein.nextInt();
		for (int i=0; i<=N; ++i){
			System.out.println("a("+i+")="+fib(i));
		}
	}
	
	static int fib(int n){
		if (n<=1) return 1;
		else return fib(n-1)+fib(n-2);
	}

}
