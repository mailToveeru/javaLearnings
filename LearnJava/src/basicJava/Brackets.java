package basicJava;

import java.util.Arrays;

public class Brackets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//String str = "{[()]}";
		//String str = "{(()]}";

		
		int arr[] = {-5,4,6,-3,4,-1}; 
		
	//	int givennumber=0, sum=0;
		
//		for(int i=0;i<arr.length;i++) {
//			
//			for(int j=i+1;j<arr.length;j++) {
//				
//				int temp = arr[i]+arr[j];
//				
//				sum= Math.max(0, temp);
//			}
//			System.out.println(sum);
//		}
//		
		int ans[] = new int[arr.length];
		
		int left[]=new int[arr.length];
		
		int right[]=new int[arr.length];

		
		left[0]=1;
		
		for(int i=1;i<arr.length;i++) {
			
			left[i]=left[i-1]*arr[i-1];
		}
		
		right[arr.length-1]=1;
		
		for(int j=arr.length-2;j>-1;j--) {
			
			right[j]= right[j+1]*arr[j+1];
		}
		
		
		for(int i=0;i<ans.length;i++) {
			
			ans[i]=left[i]*right[i]; 
			
		}
		
		System.out.println(Arrays.toString(ans));
		

	}

}
