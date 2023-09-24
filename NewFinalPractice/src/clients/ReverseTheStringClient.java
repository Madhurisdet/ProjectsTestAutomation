package clients;

import java.util.Scanner;

import methods.ReverseTheString;

public class ReverseTheStringClient {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Plese enter the word -> ");
		String str = sc.next();
		
		String restr = ReverseTheString.reverseTheString(str);
		System.out.println(restr);
		
	}

}
