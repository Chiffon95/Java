package ch06;
import java.util.Scanner;

public class Stack_1 {

	public static void main(String[] args) {
		Data1 d = new Data1();
		d.x = 10;
		System.out.println("main() : x = " + d.x);
		
		Stack_1.change1(d.x);
		//change(d.x);
		// Stack_1 st = new Stack_1(); st.change(d.x);
		System.out.println("After change(d.x)");
		System.out.println("main() : x = " + d.x);
	}
	
	static void change1(int x) {
		x = 1000;
		System.out.println("change() : x = " + x);
	}
}

class Data1 { int x; }