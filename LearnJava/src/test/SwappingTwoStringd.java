package test;

public class SwappingTwoStringd {

	public static void main(String[] args) {
		
		
		String s1="Good";
		String s2="Morning";
		
		 s1=s1+s2; //GoodMorning
		
		System.out.println(s1); //GoodMorning
		
		int value = s1.length()-s2.length(); // 11 - 7 = 4
		
		s2=s1.substring(0,value ); // 0, 4
		
		s1=s1.substring(s2.length()); // starts from 7th index
		
		
		System.out.println("s1="+s1);
		
		System.out.println("s2="+s2);

	}

}
