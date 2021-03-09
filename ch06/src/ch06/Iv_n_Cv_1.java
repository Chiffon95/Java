package ch06;

public class Iv_n_Cv_1 {
	static {
		System.out.println("static {}");
	}
	
	{
		System.out.println("{ }");
	}
	
	public Iv_n_Cv_1() {
		System.out.println("Create");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Iv & Cv bt = new Iv & Cv(); ");
		Iv_n_Cv_1 bt = new Iv_n_Cv_1();
		
		System.out.println("Iv & Cv bt2 = new Iv &Cv(); ");
		Iv_n_Cv_1 bt2 = new Iv_n_Cv_1();
	}
}
