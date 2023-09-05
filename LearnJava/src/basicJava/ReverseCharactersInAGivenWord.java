package basicJava;

public class ReverseCharactersInAGivenWord {

	public static void main(String[] args) {

		String value = "Hi How Are You";

		String[] words = value.split(" ");

		String reverseString = " ";

		for (String word : words) {

			String reverseCharacter = " ";

			for (int i = word.length() - 1; i >= 0; i--) {

				reverseCharacter = reverseCharacter + word.charAt(i);

			}

			reverseString = reverseString + reverseCharacter;

		}
		
		System.out.println(" Reversed String: "+ reverseString );

	}

}
