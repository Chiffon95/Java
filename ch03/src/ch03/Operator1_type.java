package ch03;

public class Operator1_type {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double d1 = (double)1234;
		double d2 = 1234;
		double d3 = 1234f;
		
		char ch1 = (char)97;
		char ch2 = 97;
		byte bytee = (byte)200;
		
		System.out.println(d1);
		System.out.println(d2);
		System.out.println(d3);
		System.out.println();
		System.out.println(ch1);
		System.out.println(ch2);
		System.out.println(bytee);
		System.out.println();
		
		int a = 10, b = 4;
		
		System.out.printf("%d / %d = %d%n", a, b, a/b);
		System.out.printf("%d / %.2f = %.2f%n", a, (float)b, a/(float)b);
	}

}
