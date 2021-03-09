package ch06;


class MyMath2 {
	int add2(int a, int b) {
		System.out.print("int add(int a, int b) - ");
		return a+b;
	}
	long add2(int a, long b) {
		System.out.print("long add(int a, long b) - ");
		return a+b;
	}
	long add2(long a, int b) {
		System.out.print("long add(long a, int b) - ");
		return a+b;
	}
	long add2(long a, long b) {
		System.out.print("long add(long a, long b) - ");
		return a+b;
	}
	int add2(int[] a) {
		System.out.print("int add(int[] a) - ");
		int result = 0;
		for(int i = 0; i < a.length; i++)
			result += a[i];
		return result;
	}
}
public class Overloading1 {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyMath2 mm = new MyMath2();
		System.out.println("mm.add(3, 3) result : " + mm.add2(3, 3));
		System.out.println("mm.add(3L, 3) result : " + mm.add2(3L, 3));
		System.out.println("mm.add(3, 3L) result : " + mm.add2(3, 3L));
		System.out.println("mm.add(3L, 3L) result : " + mm.add2(3L, 3L));
		
		int[] a = {100, 200, 300};
		System.out.println("mm.add(a) result : " + mm.add2(a));
	}

}
