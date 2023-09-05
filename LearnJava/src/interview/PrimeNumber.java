package interview;

public class PrimeNumber {

	public static void main(String[] args) {
		
		
		int i, j, number=100;
		
		
		
		for( i=1;i<number;i++) {
			
			
			for(j=2;j<i;j++) {
				
				
				if(i%j==0) {
					
					break;
				}
			}
			
			if(i==j) {
				
				System.out.println("It's a prime Number: "+ i);
				
			}else {
				
				System.out.println("It's not a prime Number: "+ i);
			}
			
		}

	}

}
