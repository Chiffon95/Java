package ch07;

import java.util.Scanner;
import java.io.*;

class Time{
	private int hour;
	private int minute;
	private int second;
	
	int getHour() { return hour; }
	int getMin() { return minute; }
	int getSec() { return second; }
	
	boolean setHour(int hour) {
		if (hour < 0 || hour > 23) {
			System.out.println("Reset your hour!!!");
			return false;
		}
		this.hour = hour;
		return true;
	}
	boolean setMin(int minute) {
		if (minute < 0 || minute > 59) {
			System.out.println("Reset your Minute!!!");
			return false;
		}
		this.minute = minute;
		return true;
	}
	boolean setSec(int second) {
		if (second < 0 || second > 59) {
			System.out.println("Reset your Second!!!");
			return false;
		}
		this.second = second;
		return true;
	}
	void increaseTime() {
		this.second++;
		if (this.second > 59) {
			this.second = 0;
			this.minute++;
			if (this.minute > 59) {
				this.minute = 0;
				this.hour++;
				if(this.hour > 23) this.hour = 0;
			}
		}
		setSec(this.second);
	}
	boolean checkTF(boolean method) {
		return method;
	}
}
public class OOPII_private1 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		Time t = new Time();
		
		System.out.print("Set Hour : ");
		t.setHour(scanner.nextInt());
		System.out.println(t.getHour());

		System.out.print("Set Minute : ");
		t.setMin(scanner.nextInt());
		System.out.println(t.getMin());

		System.out.print("Set Second : ");
		t.setSec(scanner.nextInt());
		System.out.println(t.getSec());
		
		while(true) {
			
		    try {
		        Thread.sleep(1000);
		      } catch (InterruptedException e) { }
		    
			System.out.println(t.getHour() + " : " + t.getMin() + " : " + t.getSec());
			t.increaseTime();
		}
	}

	private static boolean checkTF() {
		// TODO Auto-generated method stub
		return false;
	}
}
