package methods;

import java.util.HashMap;

public class MostRepeatedWord1 {

	public static String mostRepeatedWord1(String line) {

		String[] words = line.split(" ");
		HashMap<String, Integer> wordCount = new HashMap<>();
		
		for(int i=0;i<words.length;i++) {
			if(!wordCount.containsKey(words[i])) {
				wordCount.put(words[i], 1);
			}else {
				wordCount.put(words[i], wordCount.get(words[i])+1);
			}
		}
		
		String mostRepeatedWord = "";
		int mostRepeatedWordCount = 0;
		
		for(String word : wordCount.keySet()) {
			 int tempmostRepeatedWordCount = wordCount.get(word);
			 if(mostRepeatedWordCount<=tempmostRepeatedWordCount) {
				 mostRepeatedWordCount = tempmostRepeatedWordCount;
				 mostRepeatedWord = word;
			 }
		}
	System.out.println("mostRepeatedWordCount is : "+mostRepeatedWordCount);
	
	return mostRepeatedWord;
	}

}
