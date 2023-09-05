package basicJava;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateIpAddress {

	public static void main(String[] args) {


		
		String ip = "10.123.15.034";
		
		
//		String zeroTo255 = "(\\d{1,2}|(0|1)\\d{2}|2[0-4]\\d|25[0-5])";
//		
//		
//		String regex = zeroTo255+"\\."
//				       + zeroTo255+"\\."
//				       + zeroTo255+"\\."
//				       +zeroTo255;
//		
//		Pattern p = Pattern.compile(regex);
//		
//		Matcher m = p.matcher(ip);
//		 
//		
//		if(m.matches()==true) {
//			
//			System.out.println("valid ip address");
//			
//		}else {
//			
//			System.out.println("Invalid ip address");
//
//		}
		
		String zeroTo255= "(\\d{1,2}|(0|1)\\d{2}|2[0-4]\\d|25[0-5])";
		
		
		String regEx=zeroTo255+"\\."+zeroTo255+"\\."+zeroTo255+"\\."+zeroTo255;
		
		Pattern p=Pattern.compile(regEx);
		
		Matcher m= p.matcher(ip);
		
		if(m.matches()==true) {
			
			System.out.println("Valid Ip Address");
		}
		else {
			
			System.out.println("InValid Ip Address");
		}
	}

}
