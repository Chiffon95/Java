package ch09_java_lang;

public class Equals_class_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Value v1 = new Value(10);
		Value v2 = new Value(10);
		
		String str1 = new String("abcde");
		String str2 = new String("abcde");
		
		System.out.println("(str1 == str2) ? ->" + (str1 == str2) );
		System.out.println("str1.equals(str2) ? -> " + str1.equals(str2) );
		System.out.println("v1.equals(v2) ? -> " + v1.equals(v2) );
	}

}

class Value{
	int value;
	Value (int value){
		this.value = value;
	}
	//Overriding equals
	public boolean equals(Object obj) {
		if(obj instanceof Value)
			return value == ( (Value)obj).value;
		else
			return false;
	}
}
