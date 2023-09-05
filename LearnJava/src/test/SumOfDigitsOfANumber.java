package test;

public class SumOfDigitsOfANumber {

	public static void main(String[] args) {

		int number = 234;
		int rem,sum=0;
		
		while(number!=0) {
			
			rem = number%10;
			sum = sum+rem;
			number=number/10;
		}
		System.out.println("Sum of the digits of the given number =  "+ sum);
	}

}
