package clients;

import methods.MergeSortedArray;

public class MergeSortedArrayClient {

	public static void main(String[] args) {

		int[] a1 = { 1, 2, 3, 7, 76, 85, 99 };
		int[] a2 = { 4, 5, 6, 8, 9, 15, 55, 100 };

//		int[] s = MergeSortedArray.mergeSortedArray(a1, a2);
//
//		for (int a : s) {
//			System.out.println(a);
//		}
		
//		int[] s = MergeSortedArray.mergeSortedArray1(a1, a2);
//
//		for (int a : s) {
//			System.out.println(a);
//		}
		
		int[] s = MergeSortedArray.mergeSortedArray2(a1, a2);

		for (int a : s) {
			System.out.println(a);
		}

	}

}
