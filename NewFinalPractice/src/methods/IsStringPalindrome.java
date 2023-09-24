package methods;

public class IsStringPalindrome {

	public static boolean isStringPalindrome(String orLine) {
		boolean isPalindrome = true;
		String line = orLine.toLowerCase();
		int len = line.length();
		int left = 0;
		int right = len - 1;
		int middle = len / 2;
		
		System.out.println(middle);
		while (left <= middle) {
			if (line.charAt(left) == line.charAt(right)) {
				left++;
				right--;
			} else {
				isPalindrome = false;
				break;
			}
		}
		return isPalindrome;
	}

}
