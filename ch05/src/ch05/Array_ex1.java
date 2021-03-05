package ch05;

public class Array_ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		float ave = 0f;
		
		int[] score = {100, 88, 100, 100, 90};
		
		for(int i = 0; i < score.length; i ++)
			sum += score[i];
		
		ave = sum / score.length;
		
		System.out.printf("Total Sum : %d%n", sum);
		System.out.printf("Total ave : %.2f%n", ave);
	}

}
