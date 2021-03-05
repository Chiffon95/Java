package ch04;
import java.util.Scanner;

public class Continue_ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int menu = 0, num = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
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
			System.out.println("You choose " + menu + " !!!");
		}
	}

}
