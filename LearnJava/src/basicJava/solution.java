package basicJava;

import java.util.Arrays;

public class solution {

	public static void main(String[] args) {

		int[] nums = new int[] { 1, 2, 0, 6, 0, 5, 0, 7, 0, 4 };

		// Start with first position
		int insertionPosition = 0;

		for (int i = 0; i < nums.length; i++) {

			// Fill all non-zero numbers
			if (nums[i] != 0) {
				
				nums[insertionPosition] = nums[i];
				
				insertionPosition++;
			}
		}
			while (insertionPosition < nums.length) {
				
				nums[insertionPosition++] = 0;
		}
		
		System.out.println(Arrays.toString(nums));

	}
}