package ch07_OOPII_Implements;

interface Fightable{
	public abstract void move (int xPoint, int yPoint);
	public abstract void attack (Fightable f);
}

abstract class Unit{
	   int xPoint, yPoint;
	   abstract void move(int x, int y);
	   void stop() {}
}

class Marine extends Unit implements Fightable{
	public void move(int xPoint, int yPoint) {
		super.xPoint = xPoint;
		super.yPoint = yPoint;
		System.out.println(toString() + " [x="+xPoint+", y="+yPoint+"]");
	}
	      
	void stimPack() {}

	//Override
	public String toString() { return "Marine"; }
	public void attack(Fightable f) { System.out.println(toString() + " Attack!"); }
}

class Tank extends Unit{
	void move(int xPoint, int yPoint) {
		super.xPoint = xPoint;
		super.yPoint = yPoint;
		System.out.println(toString() + " [x="+xPoint+", y="+yPoint+"]");
	}

	//Override
	public String toString() { return "Tank"; }
	public void attack(Fightable f) { System.out.println(toString() + " Attack!"); }
	
	void chaneMode() {}
}

class Dropship extends Unit{
	void move(int xPoint, int yPoint) {
		super.xPoint = xPoint;
		super.yPoint = yPoint;
		System.out.println(toString() + " [x="+xPoint+", y="+yPoint+"]");
	}
	
	//Override
	public String toString() { return "Dropship"; }
	public void attack(Fightable f) {}
	
	void load() {}
	void unload() {}
}

public class Implements1 {

	public static void main(String[] args) {
	// TODO Auto-generated method stub
		Unit[] group = new Unit[3];
		group[0]= new Marine();
		group[1]= new Tank();
		group[2]=new Dropship();
	      
		for(int i = 0; i<group.length;i++) {
			group[i].move(100,200);
		}
		
		Marine f = (Marine)group[0];
		
		f.attack(f);
	}
}
