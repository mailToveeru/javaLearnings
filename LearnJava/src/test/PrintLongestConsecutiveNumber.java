package test;

public class PrintLongestConsecutiveNumber {

	public static void main(String[] args) {

		int count=0, max=0;
		
		int []arr = {1,3,4,5,6,7,8,9,7,49,5};
		
		for(int i=0;i<arr.length-1;i++) {
			
			if(arr[i]+1==arr[i+1])
			{
				count++;
				
				System.out.println(arr[i]);
				
			} else {
				
				count=0;
				
			}
		}
		
		max = Math.max(max, count+1);//gets maximum of two 
		
		System.out.println("logest consecutive integers: " + max);
	
	

}
}
