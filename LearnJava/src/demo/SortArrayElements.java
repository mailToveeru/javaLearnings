package demo;

import java.util.Arrays;

public class SortArrayElements {

	public static void main(String[] args) {

		
		int a[]=new int[] {4,5,3,4,3,23,59,23,56,76};
				
//		for(int i=0;i<a.length;i++) 
//		{
//			
//			for(int j=i+1;j<a.length;j++) {
//				
//				if(a[i]>a[j]) {
//					
//					int temp=a[i];  // 
//					a[i]=a[j];
//					a[j]=temp;
//				}
//				
//			}
//		}
//		
//		System.out.println("sorted array :"+ Arrays.toString(a));
//	}
		
		
		
		//
		for(int i=0;i<a.length;i++) 
		{
			
			for(int j=i+1;j<a.length;j++) {
				
				if(a[i]==a[j]) {
					
					System.out.println("Duplicate elements are:"+ a[j]);
				}
				
				
			}
		}
		
		//System.out.println("sorted array :"+ Arrays.toString(a));
	}

}
