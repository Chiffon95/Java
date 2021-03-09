package ch06;

public class Iv_n_Cv_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product p1 = new Product();
		Product p2 = new Product();
		Product p3 = new Product();
		
		System.out.println(p1.serialNum);
		System.out.println(p2.serialNum);
		System.out.println(p3.serialNum);
		System.out.println("count = " + Product.count);

		Product2 p2_1 = new Product2();
		Product2 p2_2 = new Product2();
		Product2 p2_3 = new Product2();
		
		System.out.println(p2_1.serialNum);
		System.out.println(p2_2.serialNum);
		System.out.println(p2_3.serialNum);
		System.out.println("count = " + p2_3.count);
	}

}

class Product{
	static int count;
	int serialNum;
	{
		++count;
		serialNum = count;
	}
	Product() {}
}
class Product2{
	int count;
	int serialNum;
	{
		++count;
		serialNum = count;
	}
	Product2() {}
}