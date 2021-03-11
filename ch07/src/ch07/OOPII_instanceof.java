package ch07;

public class OOPII_instanceof {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FireEngine1 f = new FireEngine1();
		Car1 c = new Car1();
		
		Car1 c2 = (Car1)f;
		FireEngine1 c3 = (FireEngine1)c2;
		
		if(c2 instanceof Ambulance1) {
			Ambulance1 a = (Ambulance1)c2;
			a.drive();
		}else
			System.out.println("Ambulance1 - Type change Fail!!!");
		
		if(c2 instanceof FireEngine1) {
			FireEngine1 c4 = (FireEngine1)c2;
			c4.drive();
		}else
			System.out.println("FireEngine1 - Type change Fail!!!");
	}
}
