package ch11;

import java.util.*;

public class Stack_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack st = new Stack();
//		String expression = "(3 + 5) * 8 - 2";
//		String expression = "((3 + 5) * 8 - 2"; //else
		String expression = "((3 + 5) * 8 - 2))"; //exception
		
		System.out.println("expression : " + expression);
		
		try {
			for(int i = 0; i < expression.length(); i++) {
				char ch = expression.charAt(i);
				
				if (ch == '(')
					st.push(ch + "");
				else if (ch == ')')
					st.pop();
			}
			
			if(st.isEmpty())
				System.out.println("Braket - equal!");
			else
				System.out.println("Braket - not equal!");
		}catch (EmptyStackException e) {
			System.out.println("Braket - not equal! (exception)");
		}
	}

}
