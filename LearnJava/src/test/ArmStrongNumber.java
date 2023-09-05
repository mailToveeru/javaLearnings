package test;

public class ArmStrongNumber {

	public static void main(String[] args) {

		int ArmStrongNum = 371;

		int orginalNum = ArmStrongNum;

		double result = 0;

		while (orginalNum > 0) {

			int n = orginalNum % 10;//1
			result = result + Math.pow(n, 3);
			orginalNum = orginalNum / 10;

		}
		
		if(result == ArmStrongNum ) {
			System.out.println("It is a ArmStrong number");
		}else {
			System.out.println("It is not a AruStrong number");

	  }
	}

}
