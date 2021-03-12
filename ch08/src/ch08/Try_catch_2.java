package ch08;

public class Try_catch_2 {

	class iu {}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(1);
		try {
			System.out.println(2);
			System.out.println(0/0);
		}catch(ClassCastException error) {
			if (error instanceof  ClassCastException) System.out.println(true);
			System.out.println("ClassCastException Error!");
		}catch(ArithmeticException error) {
			if (error instanceof  ArithmeticException) System.out.println(true);
			System.out.println("ArithmeticException Error!");
		}catch(Exception error) {
			System.out.println(error);
			System.out.println("Exception Error!");
		}
		System.out.println(5);
		System.out.println();
		
		System.out.println(1);
		try {
			System.out.println(3);
			Object ewr = new Object();
			iu sd = (iu)ewr;
		}catch(ArithmeticException error) {
			if (error instanceof  ArithmeticException) System.out.println(true);
			System.out.println("ArithmeticException Error!");
		}catch(ClassCastException error) {
			if (error instanceof  ClassCastException) System.out.println(true);
			System.out.println("ClassCastException Error!");
		}catch(Exception error) {
			System.out.println(error);
			System.out.println("Exception Error!");
		}
		System.out.println(5);
	}
}
