package clients;

import methods.LongestSubStringWithoutRepeatingCharacters;

public class LongestSubStringWithoutRepeatingCharactersClient {

	public static void main(String[] args) {

		String s = "abcdabcdebb";

//		String lnrs = LongestSubStringWithoutRepeatingCharacters.longestSubStringWithoutRepeatingCharactersBrute(s);
//
//		System.out.println("The longest non repeating substring 1 is: " + lnrs);
		
//		LongestSubStringWithoutRepeatingCharacters.longestSubStringWithoutRepeatingCharacters(s);
		
//		System.out.println("The longest non repeating substring 2 is: " + lnrs1);
		
		LongestSubStringWithoutRepeatingCharacters.longestSubStringWithoutRepeatingCharactersFastest(s);

	}

}
