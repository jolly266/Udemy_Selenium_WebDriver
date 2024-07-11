package string;

import java.util.Scanner;

public class VowelOr_Not {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String to Check Vowel or Not: -");

		String str = sc.nextLine();
		int vowelCount = 0;

		for (int i = 0; i <= str.length() - 1; i++) {
			char ch = str.charAt(i);

			if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' || ch == 'a' || ch == 'e' || ch == 'i'
					|| ch == 'o' || ch == 'u') {
				vowelCount++;
			}
		}

		if (vowelCount == 1) {
			System.out.println("Contain vowel");
		} else {
			System.out.println("String Not Containing Vowel");
		}
		System.out.println(vowelCount);
		sc.close();
	}

}
