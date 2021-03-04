package ch03;

public class Operator2_math_round {

	public static void main(String[] args) {
		double pi = 3.141592;
		
		double shortPi = Math.round(pi * 1000) / 1000.0;
		System.out.println(shortPi);
		
		double shortPi2 = (int)(pi * 1000) / 1000.0;
		System.out.println(shortPi2);
	}
}
