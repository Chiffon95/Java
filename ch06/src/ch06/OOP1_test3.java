package ch06;

public class OOP1_test3 {

	static int[] shuffle(int[] arr){
		int rNum = (int)(Math.random() * arr.length);
		for (int i = 0; i < arr.length; i++) {
			int temp = arr[i];
			arr[i] = arr[rNum];
			arr[rNum] = temp;
		}
		return arr;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] original = {1,2,3,4,5,6,7,8,9};
		System.out.println(java.util.Arrays.toString(original));
		
		int[] result = shuffle(original);
		System.out.println(java.util.Arrays.toString(result));
		
	}

}
