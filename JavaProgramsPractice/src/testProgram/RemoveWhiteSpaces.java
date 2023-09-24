package testProgram;

public class RemoveWhiteSpaces {

	public static void main(String[] args)
	{
			String str = " Hello to the Java World ";
			str = str.replaceAll("\\s", "");
			System.out.println(str);

    }

	}


