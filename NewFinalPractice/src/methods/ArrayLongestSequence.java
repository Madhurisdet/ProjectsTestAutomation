package methods;

import java.util.HashSet;
import java.util.Set;

public class ArrayLongestSequence {

	public static int arrayLongestSequence(int[] nums) {

		int longestLength = 0;
		Set<Integer> numSet = new HashSet<>();

		for (int n : nums) {
			numSet.add(n);
		}

		for (int num : nums) {
			if (!numSet.contains(num - 1)) {
				int tempNum = num;
				int tempLength = 1;
				while (numSet.contains(tempNum + 1)) {
					tempLength++;
					tempNum++;
				}
				longestLength = Math.max(tempLength, longestLength);
			}
		}

		return longestLength;
	}

}
