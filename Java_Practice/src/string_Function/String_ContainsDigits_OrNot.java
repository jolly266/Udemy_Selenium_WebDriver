package string_Function;

import java.util.Scanner;

public class String_ContainsDigits_OrNot {

	public static String cheakDigit(String str)
	{
		
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)>='0' && str.charAt(i)<='9')
			{
				return "Resultant Given String Contains Digits";
			}
		}
	return "Resultant Given String not Contains Digits ";
	}
	
	
	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter String : - ");
	
	String str = sc.nextLine();
	
	System.out.println(cheakDigit(str));
	sc.close();

	}

}
