package ch08;

public class Try_catch_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(1);
		try {
			System.out.println(2);
			System.out.println(3);
		}catch(Exception e) {
			System.out.println(4);
		}
		System.out.println(5);
		System.out.println();
		
		System.out.println(1);
		try {
			System.out.println(0/0);
			System.out.println(3);
		}catch(Exception e) {
			System.out.println(e);
		}
		System.out.println(5);
	}
}
