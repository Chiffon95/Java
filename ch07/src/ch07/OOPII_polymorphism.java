package ch07;

class Car1 {
	String color;
	int door;
	
	void drive() {
		System.out.println("Drive, Brrr~");
	}
}
class FireEngine1 extends Car1 {
	void water() {
		System.out.println("Water!!!");
	}
}
class Ambulance1 extends Car1{}

public class OOPII_polymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FireEngine1 f = new FireEngine1();
		Car1 c = new Car1();
		
		Car1 c2 = (Car1)f;
		FireEngine1 c3 = (FireEngine1)c2; //c2 is 'FireEngine1'
		
		FireEngine1 f2 = (FireEngine1)c; // Can't polymorphism from 'Car' to 'FireEngine1'
		
//		Ambulance1 a = (Ambulance1)f; //NO extends - 'Ambulance1' & 'FireEngine1'
	}

}
