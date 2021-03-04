package ch04;
import java.util.Scanner;

public class If1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		System.out.println("Plz, Enter a number");
		String str1 = scanner.nextLine();
		int num = Integer.parseInt(str1);
		char ch = str1.charAt(0);
		
		System.out.println(str1);
		System.out.println(num);
		System.out.println(ch);
	}

}
