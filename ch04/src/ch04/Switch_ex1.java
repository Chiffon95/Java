package ch04;
import java.util.Scanner;

public class Switch_ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter the month in number - > ");
		int input = scanner.nextInt();
		
		//switch-case
		switch(input) {
		case 12:
		case 1:
		case 2:
			System.out.println("Sprrrrrrrrrring!");
			break;
		case 3:
		case 4:
		case 5:
			System.out.println("Summeeeeeeeeeer!");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println("Faaaaaaaaaaaall!");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println("Winteeeeeeeeeer!");
			break;
		default :
			System.out.println("Wrong Entered!");
		}
		
		//if-else
		if (input < 1 || input > 12)
			System.out.println("Wrong Entered!");
		else if (input <= 2 || input == 12)
			System.out.println("Spring!");
		else if (input <= 5)
			System.out.println("Summer!");
		else if (input <= 8)
			System.out.println("Fall!");
		else
			System.out.println("Winter!");
	}

}
