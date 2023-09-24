package clients;

import methods.SumOfNumbersFromString;

public class SumOfNumbersFromStringClient {

	public static void main(String[] args) {

		String s = "a10bb10de11";

		int sum = SumOfNumbersFromString.sumOfNumbersFromString(s);

		System.out.println("The Sum of number in string is: " + sum);

	}

}
