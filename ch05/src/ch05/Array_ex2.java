package ch05;

public class Array_ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] score = {79, 88, 91, 33, 101, 55, 95};
	
		int min = score[0], max = score[0];
	
		for(int i = 0; i < score.length; i ++) {
			if(min > score[i])
				min = score[i];
			if(max < score[i])
				max = score[i];
		}
		
		System.out.println("Max : " + max + ", Min : " + min);
	}

}
