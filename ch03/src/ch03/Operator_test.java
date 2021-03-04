package ch03;

public class Operator_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numOfApples = 123;
		int sizeOfBucket = 10;
		int numOfBucket = (int)Math.round((double)numOfApples / 10.0 + 0.5);
		
		System.out.println("How many buckets are need? : " + numOfBucket);
		
		int fahrenheit = 100;
		float celcius = (int)((5 * (float)(fahrenheit - 32) / 9) * 100 + 0.5) / 100.0f;
		
		System.out.println("Fahrenheit : " + fahrenheit);
		System.out.println("Celcius : " + celcius);
	}

}
