package methods;

import java.util.ArrayList;
import java.util.Collections;

public class SortTheArrayofIntegers {

	public static ArrayList<Integer> sortTheArrayofIntegers(int[] numbers) {

		ArrayList<Integer> nums = new ArrayList<>();
		
		for(int n : numbers) {
			nums.add(n);
		}
		
		Collections.sort(nums, Collections.reverseOrder());
		
		return nums;
		
	}

}
