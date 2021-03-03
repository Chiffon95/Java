package ch02;

public class Variable3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float f = 123.4567890f;
		
		System.out.printf("%f %n", f);
		System.out.printf("%e %n", f);
		System.out.printf("%g %n", f);
		
		String str = "Moble";
		System.out.printf("[1234567890]%n");
		System.out.printf("[%s}%n]", str);
		System.out.printf("[%10s]%n", str);
		System.out.printf("[%-10s]%n", str);
		System.out.printf("[%.3s]%n", str);
		System.out.println();
		System.out.printf("[%05d]%n", 10);
		//space - 14, right //point - 10
		System.out.printf("d = %14.10f%n", 0.1234567891_2345);
	}

}
