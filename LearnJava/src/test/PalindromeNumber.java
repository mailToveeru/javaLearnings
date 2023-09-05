package test;

public class PalindromeNumber {

	public static void main(String[] args) {

		int number = 555;
		
		int orginalNumber = number;
		
		int rem=0, sum=0;
		
		while(number>0) {
		
			rem=number%10;
			sum=(sum*10)+rem;
			number=number/10;
			
		}
		
		if(orginalNumber==sum) {
			
			System.out.println("It is a palindrome Number: "+ orginalNumber);
		}else {
			System.out.println("It is not a palindrome Number: "+ orginalNumber);

			
		}
	}

}
