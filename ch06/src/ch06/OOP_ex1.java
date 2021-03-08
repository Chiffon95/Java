package ch06;

public class OOP_ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Card.width = " + Card.width);
		System.out.println("Card.width = " + Card.height);
		
		Card c1 = new Card();
		c1.kind = "Heart";
		c1.number = 7;
		
		Card c2 = new Card();
		c2.kind = "Spade";
		c2.number = 4;
		
		System.out.println("c1.kind : " + c1.kind + ", c1.number : "
		+ c1.number + ", c1.width : " + c1.width + ", c1.height : " + c1.height);
		System.out.println("c2.kind : " + c2.kind + ", c2.number : "
		+ c2.number + ", c2.width : " + c2.width + ", c2.height : " + c2.height);
		System.out.println();
		
		System.out.println("c1 width, height change from (100, 250) to (50, 80)");
		c1.width = 50; c1.height = 80;

		System.out.println("c1.kind : " + c1.kind + ", c1.number : "
		+ c1.number + ", c1.width : " + c1.width + ", c1.height : " + c1.height);
		System.out.println("c2.kind : " + c2.kind + ", c2.number : "
		+ c2.number + ", c2.width : " + c2.width + ", c2.height : " + c2.height);
	}
}

class Card{
	String kind;
	int number;
	static int width = 100;
	static int height = 250;
}