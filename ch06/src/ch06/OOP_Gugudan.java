package ch06;
import java.util.Scanner;

public class OOP_Gugudan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter dan (Gugudan - (2 ~ 9) ) -> ");
		Scanner input = new Scanner(System.in);
		int dan = input.nextInt();
		
		Gugudan mm = new Gugudan();
		mm.printGugudan(dan);
	}

}

class Gugudan{
	void printGugudan (int dan) {
		if (!(2 <= dan && dan <= 9) ) {
			System.out.println("Wrong Number Entered!");
			return;
		}
		
		for(int i = 1; i <= 9; i++) {
			System.out.printf("%2d x %2d = %2d%n", dan, i, dan*i);
		}
		return;
	}
}
