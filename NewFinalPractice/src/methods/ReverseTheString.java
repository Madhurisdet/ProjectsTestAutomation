package methods;

public class ReverseTheString {
	
	public static String reverseTheString (String str) {
		int len = str.length();
		int left =0;
		int right = len -1;
		int middle = len/2;
		
		char[] chars = str.toCharArray();
		while (left<=middle) {
			char tempChar = chars[right];
			chars[right] = chars[left];
			chars[left] = tempChar;
			left++;
			right--;
		}
		return String.valueOf(chars);
	}

}
