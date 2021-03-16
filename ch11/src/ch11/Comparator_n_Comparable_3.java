package ch11;

import java.util.*;

class Fruit implements Comparable<Fruit>{
	private String name;
	private int price;
	Fruit(String name, int price){
		this.name = name;
		this.price = price;
	}
	
	public String toString() {
		return "(name: " + name + ", price : " + price + ")\n";
	}

	@Override
	public int compareTo(Fruit fruit) {
		// TODO Auto-generated method stub
		return this.price - fruit.price;
	}
}
public class Comparator_n_Comparable_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fruit[] arr = { new Fruit("Apple", 100), new Fruit("Kiwi", 500), new Fruit("Oranege", 200),
				new Fruit("Banana", 50), new Fruit("Watermelon", 800), new Fruit("Cherry", 10)
		};
		//Price order
		// Use compareTo()
		Arrays.sort(arr); // Ascending order
		System.out.println(Arrays.toString(arr)); // Descending order
		Arrays.sort(arr, Collections.reverseOrder());
		System.out.println(Arrays.toString(arr));
	}

}
