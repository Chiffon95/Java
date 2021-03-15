package ch08;

import java.util.*;

import javax.management.RuntimeErrorException;

public class Try_catch_test1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		int answer = (int)(Math.random() * 100) + 1;
		int input = 0;
		int count = 0;
		
		do {
			count++;
			System.out.print("Enter number from 1 to 100 : ");
			
			try {
				input = new Scanner(System.in).nextInt();
				if (input < 0 || input > 100) {
					RuntimeException e = new RuntimeException("Enter number between 1 to 100!!!");
					throw e;
				}
			}catch (InputMismatchException e) {
				count--;
				System.out.println("Wrong words entered!!!");
				continue;
			}catch (RuntimeException e) {
				count--;
				System.out.println(e.getMessage());
				continue;
			}
			
			if (answer > input)
				System.out.println("Enter bigger number!");
			else if (answer < input)
				System.out.println("Enter smaller number!");
			else {
				System.out.println("Correct Number!!!");
				System.out.println("Try number -> " + count);
				break;
			}
		}while(true);
	}

}
