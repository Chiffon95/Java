package ch07_OOPII;

abstract class Unit{
	int x, y;
	abstract void move (int x, int y);
	void stop() {}
	void printfInfo() {}
}

class Marine extends Unit{
	void move(int x, int y) {
		this.x = x; this.y = y;
	}
	public String toString() { return "Marine"; }
}

class Tank extends Unit{
	void move(int x, int y) {
		this.x = (int) (1.2 * x);
		this.y = (int) (1.2 * x);
	}
	
	void changeMode() {
		System.out.println("Tank mode changing");
	}
	public String toString() { return "Tank"; }
}

class Dropship extends Unit {
	void move(int x, int y) {
		this.x = (int) (1.5 * x);
		this.y = (int) (1.5 * y);
	}
	
	void load() {
		System.out.println("Load!!!");
	}
	
	void unload() {
		System.out.println("Unload!!!");
		}
	public String toString() { return "Dropship"; }
	

public class OOPII_abstract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Unit[] group = new Unit[3];
		group[0] = new Marine();
		group[1] = new Tank();
		group[2] = new Dropship();
		
		for(int i = 0; i < group.length; i++) {
			group[i].move(100, 200);
		}
	}

}
