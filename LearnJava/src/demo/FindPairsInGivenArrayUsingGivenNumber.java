package demo;

public class FindPairsInGivenArrayUsingGivenNumber {

	public static void main(String[] args) {

	int a[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		int GivenNumber = 8;

		int temp = 0,
			count = 0;


		for(int i=0;i<a.length;i++){

			for(int j=i+1;j<a.length;j++){

				temp  = a[i]+a[j];

				if(temp==GivenNumber){
					
					count++;
				}
			}
		}
		
		System.out.println("No of 8 pair:"+ count);
		
		
	}	
}
