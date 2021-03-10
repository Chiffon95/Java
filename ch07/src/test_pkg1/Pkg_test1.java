package test_pkg1;

public class Pkg_test1 {
	private int prv;
	int dft;
	protected int prt;
	public int pub;
	
	public void test() {
		System.out.println(prv); // No Error (private -> Same class only)
		System.out.println(dft); // No Error (default -> Same package only)
		System.out.println(prt); // No Error (protected -> Same package & inheritance)
		System.out.println(pub); // No Error (public)
	}
}

class Pkg_test2 extends Pkg_test1{
	public void test() {
//		System.out.println(prv); // Error (private -> Same class only)
		System.out.println(dft); // No Error (default -> Same package only)
		System.out.println(prt); // No Error (protected -> Same package & inheritance)
		System.out.println(pub); // No Error (public)
	}
}

class Pkg_test3 {
	Pkg_test1 p = new Pkg_test1();
	
	public void test() {
//		System.out.println(p.prv); // Error (private -> Same class only)
		System.out.println(p.dft); // No Error (default -> Same package only)
		System.out.println(p.prt); // No Error (protected -> Same package & inheritance)
		System.out.println(p.pub); // No Error (public)
	}
}