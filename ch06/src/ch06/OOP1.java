package ch06;

public class OOP1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tv t1 = new Tv();
		Tv t2 = new Tv();
		
		t1.channel = 7;
		t1.channelDown();
		System.out.println("t1 channel -> " + t1.channel);
		System.out.println("t2 channel -> " + t2.channel);
		
		t2 = t1;
		System.out.println("Changed t1 channel ->" + t1.channel);
		System.out.println("Changed t2 channel ->" + t2.channel);
	}

}

class Tv{
	String color;
	boolean power;
	int channel;
	
	void power() { power = !power; }
	void channelUp() { ++channel; }
	void channelDown() { --channel; }
}
