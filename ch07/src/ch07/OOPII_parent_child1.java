package ch07;

class Tv1{
	boolean power;
	int channel;
	
	void power() { power = !power; }
	void channelUp() { ++channel; }
	void channelDown() { --channel; }
}

class SmartTv1 extends Tv1 {
	boolean caption;
	void displayCaption(String text) {
		if (caption)
			System.out.println(text);
	}
}

public class OOPII_parent_child1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SmartTv1 stv = new SmartTv1();
		
		stv.channel = 10;
		stv.channelUp();
		System.out.println(stv.channel);
		stv.caption = true;
		stv.displayCaption("Hello, Java! - 1");
		stv.caption = false;
		stv.displayCaption("Hello, Java! - 2");
	}

}
