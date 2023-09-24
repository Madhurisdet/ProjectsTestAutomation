package clients;

import methods.TargetSum;

public class TargetSumClient {
	
	public static void main(String[] args) {
		int[] numbers = {3,5,-4,8,11,1,-1,6};
	      int sum = 10;
	      int[] targetNum = TargetSum.targetSum(numbers, sum);
	      for (int i : targetNum) {
	        System.out.println(i);
	      }
	}

}
