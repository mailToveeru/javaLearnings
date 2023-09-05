package basicJava;

import java.util.HashMap;

//public class FindOccurenceOfEachCharacter {
//
//	public static void main(String[] args) {
//
//		String words= "rrrrr" ;
//		String worda = words.replace(" ", "");
//		String [] word =  worda.split("");
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


public class FindOccurenceOfEachCharacter {

	public static void main(String[] args) {

//		String str= "rrrrrdfgd";
//
//		int count[]= new int[256];
//
//
//		for(int i=0;i<str.length();i++){
//
//			count[(int)str.charAt(i)]++;
//
//		}
//
//
//		for(int i=0;i<256;i++){
//
//			if(count[i]!=0) {
//
//				System.out.println((char)i +"---> "+count[i] );
//			}
//		}
		
		
		
		
		 String str = "Veerabhadrappa GR";
		    
		   String word =  str.replaceAll(" ", "");
		   
		   String [] words =  word.split("");
		   
		   
		   
		   HashMap<String, Integer> map = new HashMap<String, Integer>();
		   
		   
		   for(int i=0;i<words.length;i++){
		       
		       if(map.containsKey(words[i])){
		           
		       int  count =  map.get(words[i]);
		         
		         map.put(words[i], count+1);
		         
		        }else{
		           
		            map.put(words[i], 1);
		         }
		     }

		      System.out.println("number of word = " + map);
		    }
		
	
}


