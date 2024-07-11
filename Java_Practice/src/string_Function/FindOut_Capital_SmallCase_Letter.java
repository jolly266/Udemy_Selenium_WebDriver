package string_Function;

import java.util.Scanner;

public class FindOut_Capital_SmallCase_Letter {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String Value :");

		String str = sc.nextLine();

		int lowerCase = 0;
		int upperCase = 0;

		for (int i = 0; i < str.length(); i++) {

			char ch = str.charAt(i);

			if (ch >= 'A' && ch <= 'Z') {

				upperCase++;
			}

			if (ch >= 'a' && ch <= 'z') {

				lowerCase++;

			}
		}

		System.out.println("upperCase Count = " + upperCase + "  " + "lowerCase Count =" + " " + lowerCase);
	}

}
