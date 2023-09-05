package test;

public class PrimeNumber {

	public static void main(String[] args) {

		int i=0, j=0;
		
		for (i = 0; i < 100; i++) {

			for (j = 2; j < i; j++) {

				if (i % j == 0) {
					
					break;
				}
			}
				if (i == j) {

					System.out.println("It is a prime no " + i);

				}else {
					System.out.println("It is not a prime no " + i);

				}
		}
	}

}
