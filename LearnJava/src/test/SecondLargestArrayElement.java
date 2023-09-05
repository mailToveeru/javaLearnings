package test;

public class SecondLargestArrayElement {

	public static void main(String[] args) {

		int arr[] = new int[] { 1, 2, 3, 5, 645, 66, 776, 343, 23, 56 };

		for (int i = 0; i < arr.length; i++) {

			for (int j = i + 1; j < arr.length; j++) {

				if (arr[i] > arr[j]) {

					int temp = arr[i];

					arr[i] = arr[j];

					arr[j] = temp;
				}

			}
		}

		for (int i = arr.length - 2; i > 0; i--) {

			if (arr[i] != arr[arr.length - 1]) {

				System.out.println("Second Largest element :" + arr[i]);

				break;
			}

		}
		
		for (int j = arr.length - 3; j > 0; j--) {

			if (arr[j] != arr[arr.length - 1]) {

				System.out.println("Third Largest element :" + arr[j]);

				break;
			}
		}


	}
	
}


