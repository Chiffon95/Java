package ch06;
import java.util.Scanner;

public class OOP1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Tv t1 = new Tv();
		Tv t2 = new Tv();

		t1.power();
		t1.inputChannel();
		t1.channelDown();
		t1.channelUp();
		t1.channelUp();
		t2 = t1;
		t2.currentChannel();
		t1.backChannel();
		t1.power();
	}

}

class Tv{
	String color;
	boolean power;
	int bChannel;
	int channel;
	
	void power() {
		power = !power;
		System.out.println((power) ? "Power : ON" : "Power : OFF");
		}
	void currentChannel() {
		System.out.println("Current Channel : " + channel);
	}
	void inputChannel() {
		System.out.print("Input Channel : ");
		Scanner scanner = new Scanner(System.in);
		
		channel = scanner.nextInt();
	}
	void backChannel() {
		int temp = channel;
		channel = bChannel;
		bChannel = temp;
		
		System.out.println("Channel (Back) : " + bChannel + " -> "+ channel);
		}
	void channelUp() {
		bChannel = channel;
		++channel;
		System.out.println("Changed Channel (+) ->" + channel);
		}
	void channelDown() {
		bChannel = channel;
		--channel;
		System.out.println("Changed Channel (-) ->" + channel);
		}
}
