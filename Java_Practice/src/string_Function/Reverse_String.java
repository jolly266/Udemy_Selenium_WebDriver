package string_Function;

import java.util.Scanner;

public class Reverse_String {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String Value :-");
		
		String str = sc.nextLine();
		
		for(int i=str.length()-1;i>=0;i--) {
			char ch = str.charAt(i);
			System.out.print(ch);
			
		}

	}

}
