package methods;

import java.util.HashMap;

public class DuplicateWordOccurrence {
	
	public static void duplicateWordOccurrence (String line) {
		
		HashMap<String, Integer> wMap = new HashMap<String, Integer>();
		
		String[] words = line.split(" ");
		
		for(int i=0;i<words.length;i++) {
			if(!wMap.containsKey(words[i])) {
				wMap.put(words[i], 1);
			}else {
				wMap.put(words[i], wMap.get(words[i])+1);
			}
		}
		
		for(String s : wMap.keySet()) {
			int count = wMap.get(s);
			if(count>1) {
				System.out.println("Word:"+s+" Count:"+wMap.get(s));
			}
		}
		
	}

}
