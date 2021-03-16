package ch11;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Comparator_n_Comparable_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = {1, 26, 17, 25, 99, 44, 303};
		int[] arr2 = {1, 26, 17, 25, 99, 44, 303};
		
		Integer[] arr3 = Arrays.stream(arr2).boxed().toArray(Integer[]::new);
		
		Arrays.sort(arr1); // Ascending order
		// Reverse order
//		Arrays.sort(arr3, Collections.reverseOrder()); // 1.Use Collections method
//		Arrays.sort(arr3, (i1, i2) -> i2 - i1); // 2 Use Lambda-style
		Arrays.sort(arr3, new Comparator<Integer>() { // 3. Use compare()
			@Override
			public int compare(Integer i1, Integer i2) {
				return (i1 - i2) * -1;
			}
		});
		//Integer[] -> int[]
		arr2 = Arrays.stream(arr3).mapToInt(Integer::intValue).toArray();
		
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		System.out.println(Arrays.toString(arr3));
	} // main()

}
