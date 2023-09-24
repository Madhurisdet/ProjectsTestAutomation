package clients;

import methods.ContiguousArrayLargestSum;

public class ContiguousArrayLargestSumClient {

	public static void main(String[] args) {

		int numbers[] = { -2, -1, 6, -1, -2, 1, 9, -2, 5, -3, 11 };
		int largestSum = ContiguousArrayLargestSum.calculateLargestSum(numbers);
		System.out.println(largestSum);

	}

}
