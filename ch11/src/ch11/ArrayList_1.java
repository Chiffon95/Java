package ch11;

import java.util.*;

public class ArrayList_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list1 = new ArrayList(10);
		//In ArrayList, object only
		//autoboxing
		//list1.add(5)
		list1.add(Integer.valueOf(5));
		list1.add(new Integer(4));
		list1.add(new Integer(2));
		list1.add(new Integer(0));
		list1.add(new Integer(1));
		list1.add(new Integer(3));
		
		ArrayList list2 = new ArrayList(list1.subList(1, 4));
		
		System.out.println("list1 : " + list1);
		System.out.println("list2 : " + list2);
		System.out.println();
		
		Collections.sort(list1);
		Collections.sort(list2);
		System.out.println("list1 : " + list1);
		System.out.println("list2 : " + list2);
		System.out.println();
		
		System.out.println("list1.containsAll(list2) : " +list1.containsAll(list2));
		System.out.println();
		
		list2.add("B");
		list2.add("C");
		System.out.println("list2 : " + list2);
		list2.add(3, "A"); //In index 3 -> "A" add
		System.out.println("list2 : " + list2);
		System.out.println();
		
		list2.set(3, "AA"); //index 3 -> "AA"
		System.out.println("list2 : " + list2);
		System.out.println();
		
		//int 1, "1" -> difference
		list1.add(0, "1");
		System.out.println("index = " + list1.indexOf("1"));
		System.out.println("index = " + list1.indexOf(1));
		System.out.println("list1 : " + list1);
		System.out.println();
		
		//remove()
		// list1.remove(1); //index 1 object remove
		list1.remove(new Integer(1));
		System.out.println("list1 : " + list1);
		System.out.println();
		
		//retainAll()
		System.out.println("list1 : " + list1);
		
		System.out.println("list1.retainAll(list2) :" + list1.retainAll(list2));
		System.out.println("list1 : " + list1);
		System.out.println("list2 : " + list2);
		System.out.println();
		
		//remove conatin()
//		for(int i = 0; i < list2.size(); i++){
//			if(list1.contains(list2.get(i)))
//				list2.remove(i);
//		} // Not removed clearly
		for(int i = list2.size() - 1; i >= 0; i--){
			if(list1.contains(list2.get(i)))
				list2.remove(i);
		}
		System.out.println("list1 : " + list1);
		System.out.println("list2 : " + list2);
		System.out.println();
	}

}
