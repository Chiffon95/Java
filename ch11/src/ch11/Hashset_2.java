package ch11;

import java.util.*;

public class Hashset_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet set = new HashSet();
		
		set.add("abc");
		set.add("abcd");
		set.add(new Person("David", 10));
		set.add(new Person("Davd", 10));
		
		System.out.println(set);
	}

}

class Person{
	String name;
	int age;
	
	@Override
	public int hashCode() {
		//int hash(Object... values);
		return Objects.hash(name, age);
	}
	
	@Override
	public boolean equals (Object obj) {
		if(!(obj instanceof Person)) 
			return false;
		
		Person p = (Person)obj;
		//this.name, this.age compare p
		return this.name.equals(p.name) && this.age == p.age;
	}
	
	Person (String name, int age){
		this.name = name;
		this.age = age;
	}
	
	public String toString() {
		return name + " : " + age;
	}
}
