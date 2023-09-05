package test;

public class GenerateOutput {

	public static void main(String[] args) {

		String str = "a2b3c4";
		
	//	o/p = aabbbcccc

		for (int i = 0; i < str.length(); i++) {

			if (Character.isAlphabetic(str.charAt(i))) {

				System.out.println(str.charAt(i));

			} else {

				int number = Character.getNumericValue(str.charAt(i));

				for (int j = 1; j < number; j++) {

					System.out.println(str.charAt(i-1));
				}
			}

		}
	}

}
