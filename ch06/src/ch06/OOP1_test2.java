package ch06;

class Student2{
	String name;
	int ban;
	int num;
	int kor;
	int eng;
	int math;
	
	Student2() {}
	Student2(String name, int ban, int num, int kor, int eng, int math) {
		this.name = name;
		this.ban = ban;
		this.num = num;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	String info() {
		String totalInfo;
		
		totalInfo = "Name : " + name + ", Ban : " + ban + ", Num : " + num +
				"\nKor score : " + kor + ", Eng score : " + eng + ", Math score : " + math;
		
		return totalInfo;
	}
	
	int getTotal() {		
		return kor + eng + math;
	}
	float getAverage() {
		return (float)Math.round((float)getTotal()/3 * 10) /10;
	}
}
public class OOP1_test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student2 s = new Student2();
		s.name = "Honggildong";
		s.ban = 1;
		s.num = 1;
		s.kor = 100;
		s.eng = 60;
		s.math = 76;
		
		System.out.println("Name : " + s.name);
		System.out.println("Total Sum : " + s.getTotal());
		System.out.println("Average : " + s.getAverage());
	}

}
