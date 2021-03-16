package ch11;

import java.util.*;

public class Comparator_n_Comparable_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] stArr1 = {"Cat", "Dog", "Lion", "tiger"};
		String[] stArr2 = {"Apple", "kiwi", "Orange", "Banana", "Watermelon", "Cherry"};
		
		Arrays.sort(stArr1); // Ascending order (ex. 'A', 'a' )
		//Standard - length
//		Arrays.sort(stArr2, (s1, s2) -> s1.length() - s2.length()); // 1. Use Lambda-style
		Arrays.sort(stArr2, new Comparator<String>() { // 2. Use compare()
			@Override
			public int compare(String s1, String s2) {
				return s1.length() - s2.length();
			}
		});
		
		System.out.println(Arrays.toString(stArr1));
		System.out.println(Arrays.toString(stArr2));
		
	} // main()

}
