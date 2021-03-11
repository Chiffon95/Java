package ch07_OOPII;

abstract class Unit{
	double xPoint, yPoint;
	double xSpeed, ySpeed;
	abstract void move (double xPoint, double yPoint);
	abstract void speed (double x, double y);
	void stop() {}
	void printfInfo() {}
}

class Marine extends Unit{
	void move(double xPoint, double yPoint) {
		super.xPoint = Math.round(xPoint * 100) / 100.0;
		super.yPoint = Math.round(yPoint * 100) / 100.0;
	}
	void speed (double xPoint, double yPoint) {
		super.xSpeed = Math.abs(super.xPoint - xPoint);
		super.ySpeed = Math.abs(super.yPoint - yPoint);
	}

	void printfInfo() {
		System.out.println(this.toString() + " :  -> "
				+ "Move [x = " + super.xPoint + ", y = " + super.yPoint + "]");
	}
	public String toString() { return "Marine"; }
}

class Tank extends Unit{
	void move(double x, double y) {
		super.xPoint = Math.round(xPoint * 100) / 100.0;
		super.yPoint = Math.round(yPoint * 100) / 100.0;
	}
	void speed (double x, double y) {
		super.xSpeed = Math.abs(super.xPoint - xPoint) * 1.2;
		super.ySpeed = Math.abs(super.yPoint - yPoint) * 1.2;
	}
	
	void changeMode() {
		System.out.println("Tank mode changing");
	}

	void printfInfo() {
		System.out.println(this.toString() + " :  -> "
				+ "Move [x = " + super.xPoint + ", y = " + super.yPoint + "]");
	}
	public String toString() { return "Tank"; }
}

class Dropship extends Unit {
	void move(double x, double y) {
		super.xPoint = Math.round(xPoint * 100) / 100.0;
		super.yPoint = Math.round(yPoint * 100) / 100.0;
	}
	void speed (double x, double y) {
		super.xSpeed = Math.abs(super.xPoint - xPoint) * 1.5;
		super.ySpeed = Math.abs(super.yPoint - yPoint) * 1.5;
	}
	
	void load() {
		System.out.println("Load!!!");
	}
	
	void unload() {
		System.out.println("Unload!!!");
		}
	
	void printfInfo() {
		System.out.println(this.toString() + " :  -> "
				+ "Move [x = " + super.xPoint + ", y = " + super.yPoint + "]");
	}
	public String toString() { return "Dropship"; }
}	

public class OOPII_abstract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Unit[] group = new Unit[3];
		group[0] = new Marine();
		group[1] = new Tank();
		group[2] = new Dropship();
		double xxx = 4.65, yyy = 4.65;
		
		for (int i = 0; i < group.length; i++) {
			
			group[i].move(xxx, yyy);
			group[i].printfInfo();
			xxx += 10;
			yyy += 10;
			group[i].move(xxx, yyy);
			group[i].printfInfo();
			xxx -= 10;
			yyy -= 10;
			group[i].move(xxx, yyy);
			group[i].printfInfo();
		}

	}
}
