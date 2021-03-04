package ch04;
import java.util.Scanner;

public class if_ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter your score ->");
		String input = scanner.nextLine();
		int score = Integer.parseInt(input);
		String grade = "";
		
		if ( score < 0 || score > 100)
			System.out.println("Wrong Score!");
		else if (score >= 90) 
			grade = "A";
		else if (score >= 80) 
			grade = "B";
		else if (score >= 70)
			grade = "C";
		else if (score >= 60)
			grade = "D";
		else
			grade = "F";
		
		if (grade.equals("F"))
			grade += "";
		else if ((score % 10) >= 8)
			grade += "+";
		else if ((score % 10) >= 4)
			grade += "0";
		else
			grade += "-";
		
		System.out.println("Your Grade is \"" + grade + "\".");
	}

}
