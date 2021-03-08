package ch06;

public class OOP_ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyMath mm = new MyMath();
		long result1 = mm.add(5L, 3L);
		long result2 = mm.subtract(5, 3);
		long result3 = mm.multiply(5L, 3L);
		double result4 = mm.divide(5, 3);
		
		System.out.println("add(5L, 3L) = " + result1);
		System.out.println("subtract(5, 3) = " + result2);
		System.out.println("multiply(5L, 3L) = " + result3);
		System.out.println("divide(5, 3) = " + result4);
		
	}
}

class MyMath{
	long add(long a, long b) { return a+b; }
	long subtract(long a, long b) { return a-b; }
	long multiply(long a, long b) { return a*b; }
	double divide(double a, double b) { return a/b; }
}
