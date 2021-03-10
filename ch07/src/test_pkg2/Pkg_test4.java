package test_pkg2;

import test_pkg1.Pkg_test1;

public class Pkg_test4 {
	Pkg_test1 p2 = new Pkg_test1();
	
	public void test() {
//		System.out.println(p2.prv); // Error (private -> Same class only)
//		System.out.println(p2.dft); // Error (default -> Same package only)
//		System.out.println(p2.prt); // Error (protected -> Same package & inheritance)
		System.out.println(p2.pub); // No Error (public)
	}
}


class Pkg_test6 extends Pkg_test1{
	
	public void test() {
//		System.out.println(prv); // Error (private -> Same class only)
//		System.out.println(dft); // Error (default -> Same package only)
		System.out.println(prt); // No Error (protected -> Same package & inheritance)
		System.out.println(pub); // No Error (public)
	}

}