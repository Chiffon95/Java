package ch06;

public class Stack_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Data2 d = new Data2();
		d.x = 10;
		System.out.println("main() : x = " + d.x);
		
		Stack_2.change2(d);
		//change(d);
		System.out.println("After change(d.x)");
		System.out.println("main() : x = " + d.x);
	}
	
	private static void change2(Data2 d) {
		d.x = 1000;
		System.out.println("change() : x = " + d.x);
	}
}

class Data2 { int x; }