package methods;

import java.util.HashMap;
import java.util.Map;

public class MostRepeatedCharacter {

	public static int mostRepeatedCharacter(String word) {

		char[] chars = word.toCharArray();
		char mostRepeatedCharacter = ' ';
		int mostRepeatedCharacterCount = 0;

		Map<Character, Integer> charMap = new HashMap<>();

		for (int i = 0; i < chars.length; i++) {
			if (!charMap.containsKey(chars[i])) {
				charMap.put(chars[i], 1);
			} else {
				charMap.put(chars[i], charMap.get(chars[i]) + 1);
			}
		}
		
		for (char c : charMap.keySet()) {
			int tempCharCount = charMap.get(c);
				if(mostRepeatedCharacterCount<tempCharCount) {
					mostRepeatedCharacterCount = tempCharCount;
					mostRepeatedCharacter = c;
				}
		}
			System.out.println("Most Repeated Character is : "+ mostRepeatedCharacter);
			return mostRepeatedCharacterCount;
	}

}
