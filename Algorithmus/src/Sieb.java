import java.util.Scanner;
public class Sieb {

	public static void main(String[] args) {
		Scanner ein = new Scanner(System.in);
		int i,j,max;
		System.out.print("Bis Zahl: ");
		max = ein.nextInt();
		boolean[] gestrichen = new boolean[max+1];
		for (i=2; i<=max; ++i)
			gestrichen[i]=false;
		i=2;
		while (i*i<=max){
			if(!gestrichen[i]){
				for(j=i*i;j<=max;j=j+i)
					gestrichen[j]=true;
			}
			i++;
		}
		for (i=2; i<=max; ++i)
			if(!gestrichen[i])
				System.out.print(i+" ");

	}

}
