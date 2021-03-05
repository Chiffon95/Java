package ch04;

import java.util.Scanner;

public class Continue_break_ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int menu = 0, num = 0;
		double result = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		Loop1 : while(true) {
			System.out.println("(1) square");
			System.out.println("(2) square root");
			System.out.println("(3) log");
			System.out.println("Choose the menu (1~3). -> End (0)");
			
			menu = scanner.nextInt();

			if(menu == 0) {
				System.out.println("Program End...");
				break;
			}else if (!(1 <= menu && menu <= 3)) {
				System.out.println("You choose wrong menu! -> End (0)");
				continue;
			}
			
			Loop2 : while(true) {
				System.out.printf("Enter number - Calculating End(0),All End(99) (%s) -> ", (menu == 1) ? "Square": ((menu == 2) ? "Root" : "Log"));
				num = scanner.nextInt();
				
				if (num == 0)
					break Loop2;
				else if(num == 99) {
					System.out.println("Program End...");
					break Loop1;
				}
				
				if (menu == 1) {
					result = num * num;
					System.out.printf("Result = %d%n", (int)result);
				}else if (menu ==2) {
					result = Math.sqrt(num);
					System.out.printf("Result = %.1f%n", result);
				}else {
					result = Math.log(num);
					System.out.printf("Result = %.1f%n", result);
				}
			}
		}
	}
}

