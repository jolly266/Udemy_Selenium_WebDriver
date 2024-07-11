package string;

import java.util.Scanner;

public class Convert_FirstLetter_UpperCase {

	public static void main(String[] args) {

		String str= "satya";
		
	/*	for(int i=0;i<str.length();i++)
		{
			char ch = str.charAt(i);
			if(ch>='a' && ch<='z')
			{
				ch=(char) (ch-32);
				System.out.println(ch);
				break;
			}	
	}*/
		
		Scanner sc = new Scanner(System.in);		
		System.out.println("Enter Index Value");
		
		String str1="";
		int index = sc.nextInt();
		
		char [] ch = str.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			if(i==index)
			{
				str1=str1+(char)(ch[i]-32);
			}
			else
			{
				str1=str1+ch[i];
			}
		}
	System.out.println(str1);
}
}