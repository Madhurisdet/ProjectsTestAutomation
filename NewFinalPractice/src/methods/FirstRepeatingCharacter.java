package methods;

import java.util.HashMap;

public class FirstRepeatingCharacter {

	public static char firstRepeatingCharacter(String word) {

		char[] chars = word.toCharArray();
		char firstRepeatingCharacter = 0;

		HashMap<Character, Integer> charMap = new HashMap<Character, Integer>();

		for (int i = 0; i < word.length(); i++) {
			if (!charMap.containsKey(word.charAt(i))) {
				charMap.put(word.charAt(i), 1);
			} else {
				charMap.put(word.charAt(i), charMap.get(word.charAt(i)) + 1);
			}
		}
		
		System.out.println(charMap);

		for (char c : charMap.keySet()) {
			if (charMap.get(c) == 2) {
				firstRepeatingCharacter = c;
				break;
			}
		}
		return firstRepeatingCharacter;
	}

}
