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
	
	void setHour(int hour) {
		if (hour < 0 || hour > 23) {
			System.out.println("Reset your hour!!!");
			return;
		}
		this.hour = hour;
	}
	void setMin(int minute) {
		if (minute < 0 || minute > 59) {
			System.out.println("Reset your Minute!!!");
			return;
		}
		this.minute = minute;
	}
	void setSec(int second) {
		if (second < 0 || second > 59) {
			System.out.println("Reset your Second!!!");
			return;
		}
		this.second = second;
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
}
public class OOPII_private1 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		Time t = new Time();
		t.setHour(25);
		System.out.println(t.getHour());
		t.setHour(17);
		System.out.println(t.getHour());

		t.setMin(70);
		System.out.println(t.getMin());
		t.setMin(48);
		System.out.println(t.getMin());

		t.setSec(70);
		System.out.println(t.getSec());
		t.setSec(40);
		System.out.println(t.getSec());
		
		while(true) {
			
		    try {
		        Thread.sleep(1000);
		      } catch (InterruptedException e) { }
		    
			System.out.println(t.getHour() + " : " + t.getMin() + " : " + t.getSec());
			t.increaseTime();
		}
	}
}
