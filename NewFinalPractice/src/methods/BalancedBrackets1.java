package methods;

import java.util.Stack;

public class BalancedBrackets1 {

	public static void balancedBrackets1(String s) {

		Stack<Character> chars = new Stack<>();
		boolean isBalanced = true;

		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c == '(' || c == '{' || c == '[') {
				chars.add(c);
			}
			if (c == ')' || c == ']' || c == '}') {
				if (chars.isEmpty()) {
					isBalanced = false;
				} else {
					char pop = chars.pop();
					if (c == '(' && pop != ')' || c == '{' && pop != '}' || c == '[' && pop != ']') {
						isBalanced = false;
					}
				}
			}
		}

		if (isBalanced && chars.isEmpty()) {
			System.out.println("It is balanced");
		}else {
			System.out.println("It is not balanced");
		}
		

	}

}
