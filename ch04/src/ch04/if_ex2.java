package ch04;
import java.util.Scanner;

public class if_ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter your score ->");
		String input = scanner.nextLine();
		int score = Integer.parseInt(input);
		
		if ( score < 0 || score > 100)
			System.out.println("Wrong Score!");
		else if (score >= 90)
			System.out.println("Grade : A");
		else if (score >= 80)
			System.out.println("Grade : B");
		else if (score >= 70)
			System.out.println("Grade : C");
		else if (score >= 60)
			System.out.println("Grade : D");
		else
			System.out.println("Grade : F");
	}

}
