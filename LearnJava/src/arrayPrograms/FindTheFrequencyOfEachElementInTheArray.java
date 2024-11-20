package arrayPrograms;

import java.util.HashMap;

public class FindTheFrequencyOfEachElementInTheArray {

	public static void main(String[] args) {

		// Example array
        int[] array = {4, 5, 6, 7, 4, 6, 8, 4, 6};
        
        // HashMap to store the frequency of each element
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
        
        
        // Iterate through the array to calculate frequencies
        for(int num:array) {
        	hm.put(num, hm.getOrDefault(num, 0)+1);
        }
        
        //To print the frequency of an element
        
        for(int key : hm.keySet()) {
        	
        	System.out.println("Element key "+ key+" : frequency of an element: "+ hm.get(key));
        }
	}
	
	
	/* 
	 1. HashMap:
		The key is the array element.
		The value is the frequency of that element.
		
	  2. Logic:
		
		Use getOrDefault(num, 0) to get the current frequency of the element. If it doesn't exist, return 0.
		Increment the frequency by 1 and update the map.
		
	  3. Finally, iterate over the HashMap to print each element and its frequency.
	 */

    
    

}
