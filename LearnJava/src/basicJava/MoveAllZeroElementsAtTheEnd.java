package basicJava;

import java.util.Arrays;

public class MoveAllZeroElementsAtTheEnd {

	public static void main(String[] args) {

		int array[] = new int[] {1,0,20, 0,3, 4, 0, 5, 6, 7, 8, 9};
		
		int insertionPostion=0;
		
		for(int i=0;i<array.length;i++) {
			
			if(array[i]!=0) {
				
				array[insertionPostion] = array[i];
				insertionPostion++;
			}
			
		}
		while(insertionPostion<array.length)
		{
			
			array[insertionPostion++]=0;
		}
		
		System.out.println(Arrays.toString(array));


	}
	
}
