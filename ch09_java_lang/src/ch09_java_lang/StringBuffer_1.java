package ch09_java_lang;

public class StringBuffer_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb = new StringBuffer(100);
		sb.append("abcd");
		int bufferSize = sb.capacity();
		int stringSize = sb.length();
		System.out.println(bufferSize);
		System.out.println(stringSize);
		
		sb = new StringBuffer("abc");
		char c = sb.charAt(2);
		System.out.println(c);		
		
		sb = new StringBuffer("0123456789");
		sb.insert(3, ".");
		System.out.println(sb);
		
		int lenght = sb.length();
		System.out.println(lenght);
		
		
	}

}
