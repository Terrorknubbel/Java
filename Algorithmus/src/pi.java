 
public class pi{
	    
		  public static void main( String[] args)
		  {		
			   
			double pi = 1;
			double nenner = 3;
			double vorzeichen = 1;
			
			for(int i = 2; i < 1000000; i++){
		
				vorzeichen *= -1;
				pi += vorzeichen*(1/nenner);
				
				nenner = nenner + 2;
				
			};
			pi = pi *4;
			System.out.print(pi);
		  }

	}


