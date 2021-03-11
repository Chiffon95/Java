package ch07_OOPII;

import java.lang.reflect.Array;
import java.util.Arrays;

class Product{
	int price; int bonusPoint;
}

class TV extends Product{
	TV(){
		super.price = 1_000_000;
		super.bonusPoint = super.price/10;
	}
	
	public String toString() { return "TV"; }
}

class Computer extends Product{
	Computer(){
		super.price = 2_000_000;
		super.bonusPoint = super.price/10;
	}
	
	public String toString() { return "Computer"; }
}

class Audio extends Product{
	Audio(){
		super.price = 1_000_000;
		super.bonusPoint = super.price/10;
	}
	
	public String toString() { return "Audio"; }
}

class Buyer {
	int index = 0;
	int money = 5_000_000;
	int bonusPoint = 0;

	Product[] cart = new Product[10];
	
	void buy(Product p) {
		
		if (money <= 0) {
			System.out.println("No money!!!");
			System.out.println();
			return;
		}
		
		money -= p.price;
		bonusPoint += p.bonusPoint;
		cart[index] = p;
		index++;
		
		System.out.println("Purchase Product -> " + p.toString());
		System.out.println("Left money -> " + money + " Won");
		System.out.println("Bonus Point -> " + bonusPoint + " Point");
		System.out.println();
	}
	
	void summary() {
		int sum = 0;
		int bP = 0;
		String list = "";
		
		for(int j = 0; j < index; j++) {
			sum += cart[j].price;
			bP += cart[j].bonusPoint;
			list += cart[j].toString() + ((j == index-1) ? "" : ", ");
		}
		
		System.out.println("Your Total Price Sum : " + sum + " Won");
		System.out.println("Your Total Bonus Point : " + bP + " Point");
		System.out.println("You bought : " + list);
	}
}

public class OOPII_IN1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Buyer b1 = new Buyer();
		
		b1.buy(new TV());
		b1.buy(new Computer());
		b1.buy(new Audio());

		b1.buy(new TV());
		b1.buy(new Computer());
		b1.buy(new Audio());
		
		b1.summary();
	}

}
