package ch05;
import java.util.Arrays;

public class Array_ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ball = new int[45];
		
		for (int i = 0; i < ball.length; i++) {
			ball[i] = i + 1;
		}
		System.out.println(Arrays.toString(ball));
		
		for (int i = 0; i < ball.length; i++) {
			int ranNum = (int)(Math.random() * ball.length);
			int temp = ball[i];
			ball[i] = ball[ranNum];
			ball[ranNum] = temp;
		}
		
		int[] arrNum = Arrays.copyOfRange(ball, 0, 6);
		Arrays.sort(arrNum);
		
		for (int i = 0; i < arrNum.length; i++) {
			System.out.printf("%d", arrNum[i]);
			
			if(i != 5)
				System.out.print(", ");
		}
	}

}
