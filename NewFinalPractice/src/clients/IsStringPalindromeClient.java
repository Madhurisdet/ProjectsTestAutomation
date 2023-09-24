package clients;

import java.util.Scanner;

import methods.IsStringPalindrome;

public class IsStringPalindromeClient {
	
	public static void main(String[] args) {
		
//	String str = "Nayan";
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the Word -> ");
		String word = sc.next();
		sc.close();
	boolean isPalindrome = IsStringPalindrome.isStringPalindrome(word);
	
	System.out.println("The word "+word+" is plaindrome : "+ " "+isPalindrome);
	
	}

}
