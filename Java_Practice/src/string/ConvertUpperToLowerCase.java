package string;

import java.util.Scanner;

public class ConvertUpperToLowerCase {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter String :- ");
		
		String str = sc.nextLine();
		String s = "";
		
		for(int i=0;i<str.length();i++)
		{
			char ch = str.charAt(i);
			ch=(char)(ch+32);
			s=s+ch;
				
		}
		System.out.println(s);
	}

}
