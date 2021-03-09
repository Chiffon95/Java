package ch06;

public class Static_n_Instance_method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	int iv; static int cv;
	
	void instanceMethod() {
		System.out.println(iv);
		System.out.println(cv);
	}
	static void staticMethod() {
//		System.out.println(iv); -> Error!
		System.out.println(cv);
	}
	
	void instanceMethod2() {}
	static void staticMethod2() {}
	
	void instanceMethod3() {
		instanceMethod2();
		staticMethod2();
	}
	
	static void staticMethod3() {
//		instanceMethod2(); -> Error !
		staticMethod2();
	}
}