package methods;

public class PrintTheAlphabetsProvidedNumberOfTimes1 {

	public static void printTheAlphabetsProvidedNumberOfTimes1(String s) {

		int len = s.length();
		int asciiOfZero = 48;

		for (int k = 0; k < len; k++) {
			char c = s.charAt(k);
			int numberOfRep = (int) s.charAt(++k) - asciiOfZero;

			if ((int) s.charAt(k + 1) - asciiOfZero > -1 && (int) s.charAt(k + 1) - asciiOfZero < 10) {
				numberOfRep = (numberOfRep * 10) + (int) s.charAt(++k) - asciiOfZero;
			}

			for (int i = 0; i < numberOfRep; i++)
				System.out.print(c);
		}

	}

}
