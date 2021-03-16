package ch11;

import java.util.*;

public class Hashset_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set set = new HashSet();
		
		for(int i = 0; set.size() < 6; i++) {
			int num = (int)(Math.random() * 45) + 1;
			set.add(num);
		}
		
		System.out.println(set);
		// For sort, set -> List and sort using Collections
		List list = new LinkedList(set); // LinkedList(Collection c)
		Collections.sort(list);  // Collections.sort(List list)
		System.out.println(list);
	}//main

}//class
