package ch09_java_lang;

import java.util.Arrays;
import java.util.StringJoiner;

public class String_class_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = new String("Hello");
		System.out.println(s);
		
		StringBuffer sb = new StringBuffer("Hello");
		String s2 = new String(sb);
		System.out.println(s2);
		
		String s3 = "Hello";
		String n = "0123456789";
		char c = s.charAt(1);
		char c2 = n.charAt(3);
		System.out.println(c);
		System.out.println(c2);
		
		String str = "abcdefg";
		char[] c_arr = str.toCharArray();
		System.out.println(Arrays.toString(c_arr));
		
		int index1 = s.indexOf('h');
		int index2 = s.indexOf('H');
		int index3 = s.indexOf('o');
		System.out.println(index1 + ", " + index2 + ", " + index3);
		
		String s4 = "     Hello world!     ";
		System.out.println(s4);
		System.out.println(s4.trim());
		
		String animals = "dog, cat, bear";
		String[] arr = animals.split(", ");
		
		String str2 = String.join("-", arr);
		StringJoiner sj = new StringJoiner("/", "[", "]");
		
		for(String s5 : arr)
			sj.add(s5);
		System.out.println(str2);
		System.out.println(sj.toString());
		
		java.util.Date dd = new java.util.Date();
		String date = String.valueOf(dd);
		
		System.out.println("Date = " + date);
	}
}
