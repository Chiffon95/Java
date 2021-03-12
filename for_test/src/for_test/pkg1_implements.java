package for_test;

interface Fightable{
	public abstract void move (int xPoint, int yPoint); // move each unit
	public abstract void attack (); // just "start attack!"
	public abstract void attack (Fightable f); // "this.toString()" attack "f.toString()"
	public abstract boolean attackable (); //check attackable
}

abstract class Unit{
	   int xPoint, yPoint;
	   abstract void move(int x, int y);
	   void stop() {}
}

class Marine extends Unit implements Fightable{
    
	void stimPack() {}

	//Overriding
	public void move(int xPoint, int yPoint) {
		super.xPoint = xPoint;
		super.yPoint = yPoint;
		System.out.println(toString() + " [x="+xPoint+", y="+yPoint+"]");
	}
	public String toString() { return "Marine"; }
	public void attack() { System.out.println(this.toString() + " start attack!"); }
	public void attack(Fightable f) {
		System.out.println(this.toString()
				+ (this.attackable() ? " start attack " : " can't Attack ")
				+ f.toString() );
		}
	public boolean attackable () { return true; }
}

class Tank extends Unit implements Fightable{
	void chaneMode() {}

	//Overriding
	public void move(int xPoint, int yPoint) {
		super.xPoint = xPoint;
		super.yPoint = yPoint;
		System.out.println(toString() + " [x="+xPoint+", y="+yPoint+"]");
	}
	public String toString() { return "Tank"; }
	public void attack() { System.out.println(this.toString() + " start attack!"); }
	public void attack(Fightable f) {
		System.out.println(this.toString()
				+ (this.attackable() ? " start attack " : " can't Attack ")
				+ f.toString() );
		}
	public boolean attackable () { return true; }
}

class Dropship extends Unit implements Fightable{
	
	void load() {}
	void unload() {}

	//Overriding
	public void move(int xPoint, int yPoint) {
		super.xPoint = xPoint;
		super.yPoint = yPoint;
		System.out.println(toString() + " [x="+xPoint+", y="+yPoint+"]");
	}
	
	public String toString() { return "Dropship"; }
	public void attack() { System.out.println(this.toString() + " start attack!"); }
	public void attack(Fightable f) {
		System.out.println(this.toString()
				+ (this.attackable() ? " start attack " : " can't Attack ")
				+ f.toString() );
		}
	public boolean attackable () { return false; }
}

public class pkg1_implements {

	public static void main(String[] args) {
	// TODO Auto-generated method stub
		Unit[] group = new Unit[3];
		group[0]= new Marine();
		group[1]= new Tank();
		group[2]= new Dropship();
	      
		for(int i = 0; i<group.length;i++) {
			group[i].move(100,200);
		}
		
		Marine f = (Marine)group[0];
		Tank f1 = (Tank)group[1];
		Dropship f2 = (Dropship)group[2];
		
		f.attack(); f.attack(f); f1.attack(f2); f2.attack(f2);
	}
}
