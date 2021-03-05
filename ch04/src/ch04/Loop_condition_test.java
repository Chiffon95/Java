package ch04;
import java.util.Scanner;

public class Loop_condition_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		//Q3
//		for(int i = 1; i <= 6; i++) {
//			for(int j = 1; j <= 6; j++) {
//				if ((i + j) == 6)
//					System.out.printf("%d + %d = %d%n", i, j, i + j);
//			}
//		}
//		
//		//Q4
//		Scanner scanner = new Scanner(System.in);
//		
//		int correctNum = (int)((Math.random() * 100) + 1);
//		int num, i = 0;
//		while(true) {
//			System.out.print("Enter Number (1 ~ 100)");
//			num = scanner.nextInt();
//			i++;
//			
//			if (num > correctNum) 
//				System.out.println("Enter Smaller Number!");
//			else if (num < correctNum) 
//				System.out.println("Enter Bigger Number!");
//			else {
//				System.out.println("Correct Number!");
//				break;
//			}
//		}
//		System.out.printf("Number Of Try - [%d]%n", i);
		
		//Q5
		int sum = 0, cnt = 0;
		while(sum < 100) {
			
			cnt++;
			
			if ((cnt % 2) != 0)
				sum += cnt;
			else
				sum += cnt * (-1);
		}
		System.out.printf("Number Of Try - [%d] => %d", cnt, cnt);
	}

}
