package ch07;

class Car1 {
	String color;
	int door;
	
	void drive() {
		System.out.println("Drive, Brrr~");
	}
}
class FireEngine extends Car1 {
	void water() {
		System.out.println("Water!!!");
	}
}
class Ambulance extends Car1{}

public class OOPII_polymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FireEngine f = new FireEngine();
		Car1 c = new Car1();
		
		Car1 c2 = (Car1)f;
		FireEngine c3 = (FireEngine)c2;
		
		FireEngine f2 = (FireEngine)c; // Can't polymorphism from Car to FireEngine
		
//		Ambulance a = (Ambulance)f; //NO extends - Ambulance & FireEngine
	}

}
