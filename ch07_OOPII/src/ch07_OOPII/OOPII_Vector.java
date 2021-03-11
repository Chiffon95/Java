package ch07_OOPII;

import java.util.Vector;

class Product2{
	int price; int bonusPoint;
}

class TV2 extends Product2{
	TV2(){
		super.price = 1_000_000;
		super.bonusPoint = super.price / 10;
	}
	
	public String toString() { return "TV2"; }
}

class Computer2 extends Product2{
	Computer2(){
		super.price = 2_000_000;
		super.bonusPoint = super.price / 10;
	}
	
	public String toString() { return "Computer2"; }
}

class Audio2 extends Product2{
	Audio2(){
		super.price = 1_000_000;
		super.bonusPoint = super.price / 10;
	}
	
	public String toString() { return "Audio2"; }
}

class Buyer2 {
	int money = 5_000_000;
	int bonusPoint = 0;

	Vector cart = new Vector();
	
	void buy(Product2 p) {
		
		if (money <= 0) {
			System.out.println("No money!!!");
			System.out.println();
			return;
		}
		
		money -= p.price;
		bonusPoint += p.bonusPoint;
		cart.add(p);
		//index++;
		
		System.out.println("Purchase Product2 -> " + p.toString());
		System.out.println("Spend money -> " + p.price + " Won");
		System.out.println("Bonus Point -> " + p.bonusPoint + " Point");
		System.out.println("Left money -> " + money + " Won");
		System.out.println();
	}
	
	void summary() {
		int sum = 0;
		int bP = 0;
		String list = "";
		
		for(int j = 0; j < cart.size(); j++) {
			Product2 p = (Product2)cart.get(j);
			sum += p.price;
			bP += p.bonusPoint;
			list += p.toString() + ( (j == cart.size() - 1) ? "" : ", " );
		}
		
		System.out.println("Your Total Price Sum : " + sum + " Won");
		System.out.println("Your Total Bonus Point : " + bP + " Point");
		System.out.println("You bought : " + list);
		System.out.println();
	}
}

public class OOPII_Vector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Buyer2 b1 = new Buyer2();
		
		b1.buy(new TV2() );
		b1.buy(new Computer2() );
		b1.buy(new Audio2() );

		b1.buy(new TV2() );
		b1.buy(new Computer2() );
		b1.buy(new Audio2() );
		
		b1.summary();
	}

}
