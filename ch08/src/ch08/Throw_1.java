package ch08;

public class Throw_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Exception e = new Exception();
			//new Exception("Throw Exception"); Saved String at message
			//If call getMessage(), print Throw Exception"
			throw e; //Exception appear
			//throw new Exception();
		}catch (Exception e) {
			System.out.println("Error message : " + e.getMessage());
			e.printStackTrace();
		}
		System.out.println("System end complete");
	}

}
