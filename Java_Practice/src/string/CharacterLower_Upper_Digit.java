package string;

import java.util.Scanner;

public class CharacterLower_Upper_Digit {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String to Check Upper & Lower or Number Digit ");
		
		String str = sc.nextLine();

		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			
			if(ch>='A' && ch<='Z')
			{
				System.out.println("String Contains Upper Letter");
			}
			
			else if(ch>='a' && ch<='z')
			{
				System.out.println("String Contains Lower Letter");
			}
			
			else if(ch>='0' && ch<='9')
			{
				System.out.println("String Contains Number Digit");
			}
		}
	sc.close();
	}

}
