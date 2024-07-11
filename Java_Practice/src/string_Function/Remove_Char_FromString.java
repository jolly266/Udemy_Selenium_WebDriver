package string_Function;

import java.util.Scanner;

public class Remove_Char_FromString {

	
	public static String removeChar(String str,char ch)
	{
		String result = " ";
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)!=ch)
			{
			result += str.charAt(i);	
			}
		}
	return result;
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String Value :- ");
		
		String str = sc.nextLine();
		System.out.println("Enter char to Remove :- ");
		char ch = sc.next().charAt(0);
		
		System.out.println(removeChar(str, ch));
		sc.close();

	}

}
