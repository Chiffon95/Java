package ch04;

public class For1 {

	public static void main(String[] args) {
		long sum = 0;

		for (int i = 1; i <= 5; i++) {
			sum += i;
			System.out.printf("1���� %3d������ �� : %3d%n", i, sum);
		}
	}
}
