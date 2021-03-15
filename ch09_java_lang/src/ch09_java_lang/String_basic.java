package ch09_java_lang;

public class String_basic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int val = Integer.valueOf(" 123 "); //Error!!!
//		System.out.println(val);
		int val = Integer.valueOf("  123  ".trim());
		System.out.println(val);
	}

}
