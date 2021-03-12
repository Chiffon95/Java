package ch08;

public class Try_catch_3 {
	class iu{}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(1);
		System.out.println(2);
		try {
			System.out.println(3);
			Object iu = new Object();
			iu obob = (iu) iu;
			System.out.println(0/0); //Exception!!!
			//ArithmeticException instance!!!
			//Saved at 'printStackTrace()', 'getMessage()'
			System.out.println(4);
		}catch (ArithmeticException ae) {
			ae.printStackTrace(); // Method info & message print
			System.out.println("Exception message : " + ae.getMessage());
			//Get Saved message print
		}catch (ClassCastException ae) {
			ae.printStackTrace(); // Method info & message print
			System.out.println("Exception message : " + ae.getMessage());
			//Get Saved message print
		}
	}

}
