package ch04;
import java.util.Scanner;

public class While_ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.printf("Enter the number! - > ");
		int input = scanner.nextInt(), sum = 0;
		
		System.out.printf("Entered number : %d%n", input);
		System.out.println();
		
		while (input != 0) {
			System.out.println("Calculating...");
			sum += (input % 10);
			System.out.printf("Entered Number : %d%n",input);
			System.out.printf("Plus Sum : %d%n",input % 10);
			input /= 10;
			System.out.println();
		}
		System.out.printf("Total Sum : %d%n",sum);
	}
}
