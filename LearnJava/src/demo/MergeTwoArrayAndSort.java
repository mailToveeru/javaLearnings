package demo;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class MergeTwoArrayAndSort {

	public static void main(String[] args) {


		int[] a = new int[] {1,5,3,4,3};

		int[] b = new int[] {6,5,3,7,8};


		int[] c = new int[a.length+b.length];


		int i=0, j=0, k=0;

		while(i < a.length) {

			c[k]= a[i];

			i++;
			k++;
		}

		while(j < b.length) {

			c[k] = b[j];

			j++;
			
			k++;
		}

		

//	  Arrays.sort(c);	
//	  
//	  
//	  
//	System.out.println(Arrays.toString(c));
		
		
		
		
		
		System.out.println(c.length);
		
		for(int d=0;d<c.length;d++) {
			
			for(int e=d+1;e<c.length;e++) {
				
				if(c[d] < c[e]) {
				
				int temp = c[d];
				
					c[d] = c[e];
					
					c[e] = temp;
				}
			}
		}
		
		
		System.out.println("Merged and sorted array elemnts: "+ Arrays.toString(c));
		
		for(int g=0;g<c.length;g++) {
			
			if(g==0||c[g]!=c[g-1]) {
				System.out.print(c[g]+" ");
			}
		}
		
	
	//	System.out.println("Merged and sorted array elements without duplicates: "c[g]);
	


	}

}
