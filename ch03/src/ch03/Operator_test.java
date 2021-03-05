package ch03;

public class Operator_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 2, y = 5; char c = 'A';
		
		System.out.println(y >= 5 || x < 0 && x > 2);
		System.out.println(y += 10 - x++);
		System.out.println(x += 2);
		System.out.println(!('A' <= c && c <= 'Z'));
		System.out.println('C' - c);
		System.out.println('5' - '0');
		System.out.println(c + 1);
		System.out.println(++c);
		System.out.println(c++);
		System.out.println(c);
		
		int numOfApples = 120;
		int sizeOfBucket = 10;
		int numOfBucket = numOfApples / sizeOfBucket + ((numOfApples % sizeOfBucket) != 0 ? 1 : 0); 
		//int numOfBucket = (int)Math.round((double)numOfApples / 10.0 + 0.4);
		
		System.out.println("How many buckets are need? : " + numOfBucket);
		
		int fahrenheit = 100;
		float celcius = (int)((5f / 9 * (fahrenheit - 32)) * 100 + 0.5) / 100.0f;
		
		System.out.println("Fahrenheit : " + fahrenheit);
		System.out.println("Celcius : " + celcius);
	}

}
