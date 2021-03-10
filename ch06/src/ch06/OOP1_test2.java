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

	String info2() {		
		return "Name : " + name + ", Ban : " + ban + ", Num : " + num +
				"\nKor score : " + kor + ", Eng score : " + eng + ", Math score : " + math
				+ "\nSum : " + getTotal2()
				+ ", Average : " + getAverage2();
	}
	
	int getTotal2() {		
		return (this.kor + this.eng + this.math);
	}
	float getAverage2() {
		return Math.round(getTotal2() / 3f * 10) /10f;
		//OR return (int)(getTotal2() / 3f * 10 + 0.5) / 10f;
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
		System.out.println("Total Sum : " + s.getTotal2());
		System.out.println("Average : " + s.getAverage2());
		System.out.println(s.info2());
	}

}
