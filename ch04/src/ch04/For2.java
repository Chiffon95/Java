package ch04;

public class For2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 2; i <= 9; i++) {
			for(int j = 1; j <= 9; j ++) {
				System.out.printf("%2d X %2d = %2d /", i, j, i*j);
			}
			System.out.println();
		}
	}

}
