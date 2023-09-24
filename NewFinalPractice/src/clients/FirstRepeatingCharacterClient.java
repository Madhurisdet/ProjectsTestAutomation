package clients;

import java.util.Scanner;

import methods.FirstRepeatingCharacter;

public class FirstRepeatingCharacterClient {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Please enter the word -> ");

		String word = sc.next();

		char c = FirstRepeatingCharacter.firstRepeatingCharacter(word);

		System.out.println("The first Repeating Character is -> \"" + c + "\"");

	}

}
