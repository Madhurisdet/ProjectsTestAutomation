package methods;

public class PrintTheAlphabetsProvidedNumberOfTimes3 {

	public static void printTheAlphabetsProvidedNumberOfTimes3(String s) {

		int len = s.length();
		int asc = 48;

		for (int j = 0; j < len; j++) {

			char c = s.charAt(j);
			int nor = (int) s.charAt(++j) - 48;

			if (j + 1 >= len) {
				for (int i = 0; i < nor; i++)
					System.out.print(c);
				break;
			}

			if ((int) s.charAt(j + 1) - 48 > -1 && (int) s.charAt(j + 1) - 48 < 10) {
				nor = (nor * 10) + (int) s.charAt(++j) - 48;
			}

			for (int i = 0; i < nor; i++)
				System.out.print(c);

		}

	}

}
