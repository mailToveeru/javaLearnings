package basicJava;

import java.util.HashMap;
import java.util.Map;

public class countWords {

	public static void main(String[] args) {

//		String words= "veerabhadrappa Working in Rakuten" ;
//
//		String [] word =  words.split(" ");
//
//		HashMap<String,Integer> map = new HashMap<String,Integer>(); 
//
//		for(int i=0;i<word.length;i++){
//			
//			if(map.containsKey(word[i])){
//
//				int count = map.get(word[i]);
//				map.put(word[i], count+1);
//
//			}else{
//				map.put(word[i], 1);
//			}
//
//		}
//
//		System.out.println("No of words:" + map);
//	}
		
		
		String words= "veerabhadrappa Working in Rakuten" ;
		
		String [] str = words.split(" ");
		
		Map<String, Integer> map = new HashMap<String, Integer>();
	
	
		for(int i=0;i<str.length;i++) {
			
			
			if(map.containsKey(str[i])) {
				
				map.put(str[i], map.get(str[i])+1);
			}else {
				
				map.put(str[i], 1);
				
			}
		}
		
		System.out.println("no of words:" + map);
	}
}