package ch06;

public class OOP1_test6 {

	static int abs1(int value) {
		return Math.abs(value);
	}
	static int abs2(int value) {
		return (value >= 0) ? value : value * -1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int value = 0;
		System.out.println(value + "'s abs = " + abs2(value) );
		
		value = 5;
		System.out.println(value + "'s abs = " + abs1(value) );

		value = -10;
		System.out.println(value + "'s abs = " + abs1(value) );

		value = 0;
		System.out.println(value + "'s abs = " + abs2(value) );

		value = 5;
		System.out.println(value + "'s abs = " + abs2(value) );

		value = -10;
		System.out.println(value + "'s abs = " + abs2(value) );
	}

}
