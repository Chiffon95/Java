package ch06;

public class OOP1_test4 {
	
	static boolean isNumber(String str) {
		
		if (str == "" || str == null) return false;
		
		for (int i = 0; i < str.length(); i++) {
			if (! ( '0' <= str.charAt(i) && str.charAt(i) <= '9') ) return false;
		}
		return true;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "123467890";
		System.out.println(str + " is number? -> " +isNumber(str));

		String str2 = "123d";
		System.out.println(str2 + " is number? -> " +isNumber(str2));

		String str3 = "";
		System.out.println(str3 + " is number? -> " +isNumber(str3));
		
		String str4 = null;
		System.out.println(str4 + " is number? -> " +isNumber(str4));
	}

}
