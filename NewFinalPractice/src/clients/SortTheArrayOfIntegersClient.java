package clients;


import java.util.ArrayList;

import methods.SortTheArrayofIntegers;

public class SortTheArrayOfIntegersClient {

	public static void main(String[] args) {
		
		int[] nums = {5,3,9,11,44,10,22,-1,-6};
		
		ArrayList<Integer> n1 =  SortTheArrayofIntegers.sortTheArrayofIntegers(nums);
		
		for(int a : n1) {
			System.out.println(a);
		}

	}

}
