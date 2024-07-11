package string_Function;

import java.util.Scanner;

public class Palindrome3 {


	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String TO check Palindrome: ");
		String str = sc.nextLine();
		
		String s="";
		
		for(int i=str.length()-1;i>=0;i--)
		{
			s=s+str.charAt(i);			
		}
		
		if(s.equals(str))
		{
			System.out.println("String is Palindorome");
		}
		else
		{
			System.out.println("Not...");
		}
				
	}
}
