package clients;

import methods.MostRepeatedCharacter;

public class MostRepeatedCharacterClient {
	
	public static void main(String[] args) {
		String word = "interview";
		
		int mostRepeatedCharacterCount = MostRepeatedCharacter.mostRepeatedCharacter(word);
		System.out.println("Most repeated charater count is : " + mostRepeatedCharacterCount);
	}

}
