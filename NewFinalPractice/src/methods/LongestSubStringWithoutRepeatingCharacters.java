package methods;

import java.util.HashMap;

//Longest Substring Without Repeating Characters
//Input: s = "abcdabcbb"
//Output: 4
//Explanation: The answer is "abcd", with the length of 4.
public class LongestSubStringWithoutRepeatingCharacters {

	public static String longestSubStringWithoutRepeatingCharactersBrute(String s) {

		int maxLen = 0;
		StringBuilder returnString = new StringBuilder();

		for (int i = 0; i < s.length(); i++) {
			for (int j = i; j < s.length(); j++) {
				if (returnString.indexOf(String.valueOf(s.charAt(j))) != -1) {
					break;
				}
				returnString.append(s.charAt(j));
				if (maxLen < returnString.length()) {
					maxLen = returnString.length();
				}
			}
		}

		System.out.println("The length of the longest substring is: " + maxLen);

		return returnString.toString();
	}

	public static void longestSubStringWithoutRepeatingCharacters(String s) {

		int right = 0;
		int left = 0;
		int maxLen = 0;
		HashMap<Character, Integer> visitedCharacters = new HashMap<Character, Integer>();
//		StringBuilder returnString = new StringBuilder();

		for (int rp = 0, lp = 0; rp < s.length(); rp++) {
			char c = s.charAt(rp);
			if (visitedCharacters.containsKey(c) && visitedCharacters.get(c) >= lp) {
				lp = visitedCharacters.get(c) + 1;
			}

//			maxLen = Math.max(maxLen, rp - lp + 1);

			if (maxLen < rp - lp + 1) {
				maxLen = rp - lp + 1;
				right = rp;
				left = lp;
			}

			visitedCharacters.put(c, rp);

		}

		for (int i = left; i <= right; i++) {
			System.out.print(s.charAt(i));
		}
//		maxLen = right - left + 1;
		System.out.println("The length of the longest substring is: " + maxLen);

//		return returnString.toString();
	}

	public static void longestSubStringWithoutRepeatingCharactersFastest(String s) {

		int finalRight = 0;
		int finalLeft = 0;
		int maxLen = 0;

		for (int left = 0, right = 0; right < s.length(); right++) {
			int indexOfFirstAppearanceInString = s.indexOf(s.charAt(right), left);

			if (indexOfFirstAppearanceInString != right) {
				left = indexOfFirstAppearanceInString + 1;
			}

			if (maxLen < right - left + 1) {
				maxLen = right - left + 1;
				finalLeft = left;
				finalRight = right;
			}
		}

		for (int i = finalLeft; i <= finalRight; i++) {
			System.out.print(s.charAt(i));
		}
		System.out.println();
		System.out.println("The max Len is : " + maxLen);

	}

}
