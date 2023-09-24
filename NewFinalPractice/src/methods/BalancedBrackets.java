package methods;

import java.util.Stack;

public class BalancedBrackets {

	public static void balancedBrackets(String s) {

		Stack<Character> charcters = new Stack<>();
		boolean isBalanced = true;

		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c == '(' || c == '{' || c == '[') {
				charcters.add(c);
			}
			if (c == ')' || c == '}' || c == ']') {
				if (charcters.isEmpty()) {
					isBalanced = false;
				} else {
					char pop = charcters.pop();
					if (c == '(' && pop != ')' || c == '{' && pop != '}' || c == '[' && pop != ']') {
						isBalanced = false;
					}
				}
			}
		}

		if (isBalanced && charcters.isEmpty()) {
			System.out.println("Is Balanced");
		} else {
			System.out.println("It is not Balanced");
		}

	}

}
