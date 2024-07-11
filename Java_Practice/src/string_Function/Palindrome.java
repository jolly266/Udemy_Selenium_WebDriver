package string_Function;

import java.util.Scanner;

public class Palindrome {

	public static String checkPalindrome(String str) {
		int j = str.length() - 1;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) != str.charAt(j)) {
				return "It's not Palindrome";
			}
			j--;
		}
		return "It's Palindrome";
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string to check Palindrome: ");
		String str = sc.nextLine();
		
		
		
		System.out.println(checkPalindrome(str));
		sc.close();

	}

}
