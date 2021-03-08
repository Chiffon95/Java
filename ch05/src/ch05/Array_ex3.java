package ch05;
import java.util.Arrays;

public class Array_ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numArr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
		
		for (int i = 0; i < numArr.length; i++) {
			int ranNum = (int)(Math.random() * numArr.length);
			int temp = numArr[i];
			numArr[i] = numArr[ranNum];
			numArr[ranNum] = temp;
		}
		System.out.println(Arrays.toString(numArr));
	}

}
