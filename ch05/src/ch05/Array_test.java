package ch05;
import java.util.Arrays;

public class Array_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Q3
		int[] ballArr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		int[] ball3 = new int[3];
		
		for (int i = 0; i < ballArr.length; i++) {
			int rNum = (int)(Math.random() * ballArr.length);
			int temp = ballArr[i];
			ballArr[i] = ballArr[rNum];
			ballArr[rNum] = temp;
		}
		
		ball3 = Arrays.copyOf(ballArr, ball3.length);
		
		System.out.println(Arrays.toString(ball3));
		System.out.println();
		
		//Q4
		
		int[][] arr = {
				{5, 5, 5, 5, 5},
				{10, 10, 10, 10, 10},
				{20, 20, 20, 20, 20},
				{30, 30, 30, 30, 30}
		};
		
		int total = 0; float average = 0;
		
		for(int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				total += arr[i][j];
			}
		}
		average = (float)total / (arr.length * arr[0].length);
		
		System.out.println("Total : " + total);
		System.out.println("Average : " + average);
		System.out.println();
		
		//Q5
		int[] coinUnit = {500, 100, 50, 10};
		
		int money = 2680;
		System.out.println("money = " + money);
		
		for(int i = 0; i < coinUnit.length; i++) {
			int cnt = 0;
			
			cnt = money / coinUnit[i];
			money -= cnt * coinUnit[i];
			System.out.printf("[%3d]Won : %d%n", coinUnit[i], cnt);
		}
	}

}
