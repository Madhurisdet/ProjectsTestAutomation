package methods;

public class SumOfNumbersFromString {

//	Sum of all the numbers present in a string
//	Input – “a10bb10de11”
//	output - 31

	public static int sumOfNumbersFromString(String s) {

		int sum = 0;
		String num = "0";

		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (Character.isDigit(c)) {
//				num = num + String.valueOf(c);
				num = num + c;
			}
			if (Character.isAlphabetic(c)) {
				sum = sum + Integer.parseInt(num);
				num = "0";
			}
		}
		sum = sum + Integer.parseInt(num);
		return sum;
	}
}


