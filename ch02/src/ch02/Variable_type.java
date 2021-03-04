package ch02;

public class Variable_type {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "3";
		// '3' - '0' = 51 - 48 = 3
		System.out.println(str.charAt(0) - '0');
		// '3' - '0' + 1 = 51 - 48 + 1 = 4
		System.out.println('3' - '0' + 1);
		//char -> int --- 3 + 1 = 4
		System.out.println(Integer.parseInt("3") + 1);
		// string + int = string --- "3" + "1" = "31"
		System.out.println("3" + 1);
		//3 + '0' = 3 + 48 = 51 --- uni_code 51 = '3'
		System.out.println((char)(3 + '0'));
	}

}
