package methods;

import java.util.HashMap;
import java.util.Map;

public class MostRepeatedWord {

	public static String mostRepeatedWord(String line) {

		Map<String, Integer> wordMap = new HashMap<>();
		String[] words = line.split(" ");

		for (int i = 0; i < words.length; i++) {
			if (!wordMap.containsKey(words[i])) {
				wordMap.put(words[i], 1);
			} else {
				wordMap.put(words[i], wordMap.get(words[i]) + 1);
			}
		}

		int maxCount = 0;
		String mostRepeatedWord = "";

		for (String word : wordMap.keySet()) {
			int tempCount = wordMap.get(word);
			if (maxCount <= tempCount) {
				maxCount = tempCount;
				mostRepeatedWord = word;
			}
		}
		System.out.println("Most repeated count is : " + maxCount);
		return mostRepeatedWord;
	}

}
