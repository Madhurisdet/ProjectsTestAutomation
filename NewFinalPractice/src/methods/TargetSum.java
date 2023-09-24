package methods;

import java.util.HashMap;
import java.util.Map;

public class TargetSum {
	
	public static int[] targetSum(int[] numbers, int sum) {
		
		int[] nums = new int[2];
		Map<Integer, Integer> complements = new HashMap<>();
		
		for(int i=0;i<numbers.length;i++) {
			Integer complementIndex = complements.get(numbers[i]);
			if(complementIndex != null) {
				nums[0] = numbers[complementIndex];
				nums[1] = numbers[i];
			}else {
				complements.put(sum - numbers[i], i);
			}
		}
		
		return nums;
	} 

}
