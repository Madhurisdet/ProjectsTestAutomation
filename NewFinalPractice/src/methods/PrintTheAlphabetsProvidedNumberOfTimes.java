package methods;

public class PrintTheAlphabetsProvidedNumberOfTimes {

	public static void printTheAlphabetsProvidedNumberOfTimes(String s) {

		int len = s.length();
		int asciiOfZero = 48;

		for (int k = 0; k < len; k++) {
			char c = s.charAt(k);
			int numOfRep = ((int) s.charAt(++k) - asciiOfZero);

			if (k + 1 >= len) {
				for (int i = 0; i < numOfRep; i++) 
					System.out.print(c);
					break;
				}
			

			if (((int) s.charAt(k+1) - asciiOfZero) > -1 && ((int) s.charAt(k+1) - asciiOfZero) < 10) {
				numOfRep = (numOfRep * 10) + ((int) s.charAt(++k) - asciiOfZero);
			}
			
			for (int i = 0; i < numOfRep; i++) {
				System.out.print(c);
			}

		}

	}

}
