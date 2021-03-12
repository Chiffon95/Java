package ch07_OOPII;

class A {
	
	//Overriding
	public void method(B b) {b.method(); }
	public void method(C c) {c.method(); }
}
interface I { public abstract void method(); }

class B implements I{
	public void method() {
		System.out.println("B class's method");
	}
}
class C implements I{
	public void method() {
		System.out.println("C class's method");
	}
}

public class OOPII_interface1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a = new A();
		a.method(new B());
		a.method(new C());
	}

}
