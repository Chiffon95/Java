package ch11;

import java.util.*;

public class HashMap_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("myId", "1234");
		map.put("asdf", "1111");
		map.put("asdf", "1234");
		
		Scanner s = new Scanner(System.in); //input
		
		while(true) {
			System.out.println("Enter Id & Password!");
			System.out.print("Id : ");
			String id = s.nextLine().trim();
			
			System.out.print("Password : ");
			String password = s.nextLine().trim();
			
			if(!map.containsKey(id)) {
				System.out.println("Wrong Id!!! - Try again!!!");
				continue;
			}
			
			if(!(map.get(id)).equals(password)) {
				System.out.println("Wrong Password!!! - Try again!!!");
			} else {
				System.out.println("Correct Id & Password!");
				break;
			}
		} //while
	} //main

}
