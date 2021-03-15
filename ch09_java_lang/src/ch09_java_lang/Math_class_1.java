package ch09_java_lang;

public class Math_class_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Math.abs
		int i = Math.abs(-10);
		int j = Math.abs(10);
		System.out.println(i);
		System.out.println(j);
		System.out.println();
		
		//Math.ceil
		double d = Math.ceil(10.1);
		double d2 = Math.ceil(-10.1);
		System.out.println(d);
		System.out.println(d2);
		System.out.println();
		
		//Math.floor
		d = Math.floor(10.8);
		d2 = Math.floor(-10.8);
		System.out.println(d);
		System.out.println(d2);
		System.out.println();
		
		//Math.max
		d = Math.max(9.5, 9.500001);
		System.out.println(d);
		System.out.println();
		
		//Math.min
		d = Math.min(4.5, 6.8);
		System.out.println(d);
		System.out.println();
		
		//Math.random
		d = Math.random();
		i = (int)Math.random() * 10 + 1;
		System.out.println(d);
		System.out.println(i);
		System.out.println();
		
		//Math.rint
		d = Math.rint(1.2);
		d2 = Math.rint(3.4);
		double d3 = Math.rint(3.5);
		double d4 = Math.rint(4.5);
		System.out.println(d);
		System.out.println(d2);
		System.out.println(d3);
		System.out.println(d4);
		System.out.println();
		
		//Math.round
		long l = Math.round(1.2);
		long l2 = Math.round(2.6);
		long l3 = Math.round(3.5);
		long l4 = Math.round(4.5);
		d = 90.7552;
		d2 = Math.round(d * 100) / 100.0;
		System.out.println(l);
		System.out.println(l2);
		System.out.println(l3);
		System.out.println(l4);
		System.out.println(d);
		System.out.println(d2);
	}

}
