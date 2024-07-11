package string_Function;

import java.util.Scanner;

public class CheakVowel {
	
	public static String containVowel(String str) {
	
		for(int i=0;i<str.length();i++)
		{
			char ch = str.charAt(i);
			
			if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')
			{
			 return "It Contains Vowel";
			}	
		}
		return "It Does Not Contains Vowel";
	}

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter String :- ");
	
	String str = sc.nextLine();
	System.out.println(containVowel(str));
	sc.close();	
	
		
		}
	}


