package clients;

import java.util.Scanner;

import methods.PrintTheAlphabetsProvidedNumberOfTimes;
import methods.PrintTheAlphabetsProvidedNumberOfTimes1;
import methods.PrintTheAlphabetsProvidedNumberOfTimes3;

public class PrintTheAlphabetsProvidedNumberOfTimesClient {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Please provide the String -> ");
		
		String s = sc.next();
//		String s1 = "a5b10c9d10";
//		String s1 = "a5b7c9d8";
//		String s1 = "a5b10c9d8";
		
//		PrintTheAlphabetsProvidedNumberOfTimes.printTheAlphabetsProvidedNumberOfTimes(s);
//		PrintTheAlphabetsProvidedNumberOfTimes.printTheAlphabetsProvidedNumberOfTimes(s1);
		
//		PrintTheAlphabetsProvidedNumberOfTimes1.printTheAlphabetsProvidedNumberOfTimes1(s);
		
		PrintTheAlphabetsProvidedNumberOfTimes3.printTheAlphabetsProvidedNumberOfTimes3(s);
	}

}
