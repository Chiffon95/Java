package ch04;

public class Random1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		for (int i = 0; i < 20; i++) {
			num = (int)(Math.random() * 11) - 5;
			System.out.printf("Random number : %d%n", num);
		}
	}

}
