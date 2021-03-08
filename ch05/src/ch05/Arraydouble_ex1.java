package ch05;

public class Arraydouble_ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] score = {
				{100, 100, 100},
				{20, 20, 20},
				{30, 30, 30},
				{40, 40, 40},
				{50, 50, 50}
		};
		int korTotal = 0, engTotal = 0, mathTotal = 0;
		
		System.out.println("Num\tKor\tEng\tMath\tSum\tAve");
		System.out.println("==============================================");
		for (int i = 0; i < score.length; i++) {
			
			int sum = 0;
			float avg = 0.0f;
			
			System.out.printf("%3d\t", i + 1);
			for (int j = 0; j < score[i].length; j++) {
				System.out.printf("%3d\t", score[i][j]);
				sum += score[i][j];
			}
			
			korTotal += score[i][0];
			engTotal += score[i][1];
			mathTotal += score[i][2];
			avg = (float)sum/score[i].length;
			
			System.out.printf("%4d\t%4.1f%n", sum, avg);
		}
		System.out.println("==============================================");
		System.out.printf("Total Sum -> Kor Total : %4d, Eng Total : %4d, Math Total : %4d%n", korTotal, engTotal, mathTotal);
		System.out.printf("Total Ave -> Kor Ave : %4.1f, Eng Ave : %4.1f, Math Ave : %4.1f%n",
				(float)korTotal/score.length, (float)engTotal/score.length, (float)mathTotal/score.length);
	}

}
