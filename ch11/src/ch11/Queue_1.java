package ch11;

import java.util.*;

public class Queue_1 {
	
	static Queue q = new LinkedList();
	//Queue = interface -> LinkedList Object need
	static final int MAX_SIZE = 5;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter \"help\" -> Help");
		
		while(true) {
			System.out.println(">>");
			try {
				//line entered
				Scanner s = new Scanner(System.in);
				String input = s.nextLine().trim();
				//blanket remove
				
				if("".equals(input)) continue;
				
				if(input.equalsIgnoreCase("q"))
					System.exit(0);
				else if (input.equalsIgnoreCase("help")) {
					System.out.println("help -> Help");
					System.out.println("q or Q -> Progam End");
					System.out.println("history -> Recent Command " + MAX_SIZE);
				} else if (input.equalsIgnoreCase("history")){
					//Queue have few method - LinkedList Object -> LinkedList
					//use get() -> show LinkedList
					LinkedList list = (LinkedList)q;
					
					final int SIZE = list.size();
					for (int i = 0; i < SIZE; i++) 
						System.out.println((i + 1) + "." + list.get(i));
				}else {
					save(input);
					System.out.println(input);
				}
			}catch(Exception e){
				System.out.println("Enter Error!!!");
			}
		}
	}
	
	public static void save (String input) {
		//save at queue
		if (!"".equals(input))
			q.offer(input);
		
		//if MAX_SIZE, remove first thing
		if(q.size() > MAX_SIZE) //size -> Collection interface (defined)
			q.poll();
	}
}
