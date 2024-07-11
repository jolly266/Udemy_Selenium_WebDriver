package string_Function;

import java.util.Scanner;

public class Palindrome2 {


	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String TO check Palindrome: ");
		String str = sc.nextLine();
		
		int j = str.length() - 1;
		for (int i = 0; i < str.length(); i++) {
			
			if (str.charAt(i) != str.charAt(j)) {
				
				System.out.println("Its Not a Palindrome");
			}
			
			j--;
		}
		System.out.println("Its a Palindrome");
		sc.close();
	}
}
