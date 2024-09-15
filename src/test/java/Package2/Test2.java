package Package2;

import java.util.Arrays;

public class Test2 {

	public static void main(String[] args) {
		
		int [] arr1 = {1,10,9,5,6,7,4};
		int [] arr2 = {7,2,9,5,3,7,4};
		int[] arr3 = new int[] {10,5,7,3,12,21};
		Integer[] arr4 = new Integer[] {10,5,7,3,12,21};
	System.out.println(	Arrays.binarySearch(arr1, 7));
	System.out.println(Arrays.compare(arr1, 1, 3, arr2, 0,3));
		System.out.println(Arrays.toString(arr2));;
		System.out.println(Arrays.toString(arr3));
		System.out.println(Arrays.toString(arr4));
		System.out.println(arr4);
		String s = String.valueOf(2);
		System.out.println(s);
		
		Arrays.setAll(arr1, e-> e*5);
		System.out.println(Arrays.toString(arr1));
		
		int arr5[] = new int[5];
		System.out.println(Arrays.toString(arr5));

	}
	
	
}
