package basicJava;

import java.util.HashMap;
import java.util.Set;

public class Test {

	public static void main(String[] args) {

		
		String str = "abbcdb"; //abb
		
		String [] ch = str.split(""); // a b b 
		
		
		HashMap<String, Integer> hm =new HashMap<String, Integer>();

		
		for(int i=0;i<ch.length;i++) {
			
			
			if(hm.containsKey(ch[i])) {
				
				int	count = hm.get(ch[i]);
				
				hm.put(ch[i], count+1 );
				
			}else {
				hm.put(ch[i], 1 );
			}
		}
		      System.out.println("number of word = " + hm);

	
//		Set<String> keys=hm.keySet();
//		
//		if(hm.get(ch[i])==1) {
//			
//			
//			System.out.println("Test value: "+ ch[i]);
//			
//		}
		
		
		}
		
//	}

}
