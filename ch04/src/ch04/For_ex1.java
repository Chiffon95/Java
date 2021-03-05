package ch04;

public class For_ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 10; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.printf("*");
			}
			System.out.println();
		}
		System.out.println();
		
		for(int i = 5; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				System.out.printf("*");
			}
			System.out.println();
		}
	}
}
