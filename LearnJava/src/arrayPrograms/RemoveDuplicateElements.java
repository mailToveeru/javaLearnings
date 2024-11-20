package arrayPrograms;

import java.util.HashSet;

public class RemoveDuplicateElements {

	public static void main(String[] args) {

		
        int[] array = {4, 5, 6, 7, 4, 6, 8, 4, 6};

        
        //To add unique elements
        HashSet<Integer> set = new HashSet<Integer>();
        
        //To add duplicate elements
        HashSet<Integer> duplicate = new HashSet<Integer>();
      
        int count=0;
        
        for(int i=0;i<array.length;i++) {
        	
        	if(!set.add(array[i])) {
        		duplicate.add(array[i]);
        		count++;
        	}
        }
        
        System.out.println("Unique elements in an array: "+ set);
        
        System.out.println("Duplicate elements in an array: "+ duplicate);
        
        System.out.println("Duplicate elements count: "+ count);


		
	}

}
