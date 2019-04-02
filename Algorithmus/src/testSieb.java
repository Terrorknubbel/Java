

public class testSieb {

	public static void main(String[] args) {
		
		int i,j,max;
		max = 100;
		boolean[] gestrichen = new boolean[max+1];
		for (i=2; i<=max; ++i)
			gestrichen[i]=true;
		i=2;
	
		for(i = 2; i<max; i++){
			for(j = 2; j<i; j++){
				if(i % j == 0){
					gestrichen[i]=false;
				};
			};
		};
	
	
		for (i=1; i<max; i++)
			if(gestrichen[i])
				System.out.print(i+" ");

	}

}
