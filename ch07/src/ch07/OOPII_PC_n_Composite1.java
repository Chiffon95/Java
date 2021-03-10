package ch07;
class MyPoint1{
	int x, y;
}
class MyPoint2{
	int x, y;
}

class Circle1 extends MyPoint1{
	int r;
}
class Circle2 {
	MyPoint2 p = new MyPoint2();
	int r;
}

public class OOPII_PC_n_Composite1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle1 c1 = new Circle1();
		Circle2 c2 = new Circle2();
		
		c1.x = 1; c1.y = 2; c1.r = 3;
		c2.p.x = 1; c2.p.y = 2; c2.r = 3;
		
		System.out.println("c1.x = " + c1.x);
		System.out.println("c1.y = " + c1.y);
		System.out.println("c1.r = " + c1.r);

		System.out.println("c2.p.x = " + c2.p.x);
		System.out.println("c2.p.y = " + c2.p.y);
		System.out.println("c2.r = " + c2.r);
	}

}
