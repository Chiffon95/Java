package ch07;

class Car2 {
	String color;
	int door;
	
	void drive() { System.out.println("Drive, Brrr~~~"); }
	void stop() { System.out.println("STOP!!!"); }
}
class FireEngine2 extends Car2 {
	void water() { System.out.println("Water!!!"); }
}

public class OOPII_polymorphism2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car2 car = null;
		FireEngine2 fe = new FireEngine2();
		FireEngine2 fe2 = null;
		
		fe.water();
		car = (Car2)fe; // Auto type chane - from 'FE' to 'Car'
//		car.water(); // 'void water()' can't be used by type 'Car'
		fe2 = (FireEngine2)car;
		fe2.water();
	}

}
