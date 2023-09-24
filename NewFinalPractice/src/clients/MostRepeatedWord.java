package clients;

import methods.MostRepeatedWord1;

public class MostRepeatedWord {

	public static void main(String[] args) {
		String line = "Infosys interview details in Sunnyvale: 15 interview questions and 11 interview reviews posted anonymously by Infosys interview candidates.";
		
//		String str = methods.MostRepeatedWord.mostRepeatedWord(line);
		String str = MostRepeatedWord1.mostRepeatedWord1(line);
		System.out.println("Most repeated word is : " + str);
	}

}
