package interview;

public class RemoveDuplicate {

	public static void main(String[] args) {

		
		
//	int [] array = new int[] {1, 1, 3, 2, 3, 4, 2, 4, 6, 5, 3, 2, 4, 4, 5} ;
	
//	HashSet<Integer> set = new HashSet<Integer>(); 
//	
//	for(int i=0;i<array.length;i++) {
//		
//		set.add(array[i]);
//		
//	}
//	
//	System.out.println("Without duplicate :" + set);
	
	
//	int [] array1 = new int[] {3,2,1,4};
//	
//	int min = array1[0];
//	
//	for(int i=1;i<array1.length;i++) {
//		
//		for(int j=i+1;j<array1.length;j++) {
//			
//			
//			if(array[i]<array1[j]) {
//				
//				min = array1[i];
//				
//			}
//		}
//		
//	}
//	
//	System.out.println("smallest number : " + min);
//	
//	
//	}
	
	int [] array1 = new int[] {3,2,1,4,6,7,10};
	
	int max = array1[0];
	
	for(int i=1;i<array1.length;i++) {
		
		for(int j=i+1;j<array1.length;j++) {
			
			
			if(array1[i]<array1[j]) {
				
				max = array1[j];
				
			}
		}
		
	}
	
	System.out.println("Maximum number : " + max);
	
	
	}
	
	
//	<h3 class="text-xl text-skin-bold font-semibold"> Login / Register</h3>
//	
//	
//	//h3[text()='Login / Register']
//	
//	//h3[contains(text(),'Login')]
//	
//	
//	<input autocomplete="off" oncopy="return false" onpaste="return false" onkeyup="if(Math.floor(event.target.value)>9999999 &amp;&amp; event.key){event.target.value=Number(String(event.target.value).slice(0,7));event.preventDefault();}" onkeydown="if(event.target.value>9999999 &amp;&amp; event.key){event.preventDefault();}" id="priceOrderPad" type="text" defaultvalue="0" class="border border-skin-grey bg-skin-overlapWhite accent-[#3F5BD9] text-skin-black input-number h-8 border pl-2 outline-0  w-3
//	
//	
//	//input[@id='priceOrderPad']
//	
//	
//	
//	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
