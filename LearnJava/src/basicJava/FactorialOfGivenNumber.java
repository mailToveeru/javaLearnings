package basicJava;

public class FactorialOfGivenNumber {

	public static void main(String[] args) {
		
		int givenNumber = 7;

		int fact = 1;

		for (int i = 1; i <= givenNumber; i++) {

			fact = fact * i;
		}

		System.out.println("Factorial of a given Number:" + fact);


	}

}