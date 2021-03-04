package ch04;
import java.util.Scanner;

public class If_ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		System.out.println("Plz, Enter one number or one alphabet.");
		String str1 = scanner.nextLine();
		char ch = str1.charAt(0);
		System.out.println(('0' <= ch && ch <= '9') ?
		"Number Entered!" : (('A' < ch && ch < 'Z') || ('a' < ch && ch < 'z')) ?
		"Alphabet Entered!" : "Wrong Entered!");
	}

}
