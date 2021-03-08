package ch05;

public class Command_line {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Numer of Args : " + args.length);
		
		for (int i = 0; i < args.length; i++)
			System.out.println("args[" + i + "] = \"" + args[i] + "\"");
	}

}
