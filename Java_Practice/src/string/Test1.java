package string;

public class Test1 {

	public static void main(String[] args) {
		
		String str ="$@thyaTecH@25YearS!";
		//1
		System.out.println("1 Answer"+"  "+str.length());
		//2
		System.out.println("2 Answer"+"  "+str.charAt(0));
		//3
		System.out.println("3 Answer"+"  "+str.charAt(str.length()-1));
		//4
		System.out.println("4 Answer"+"  "+str.charAt(0)+" "+ " "+str.charAt(str.length()-1));
		//5
		int a=str.charAt(0);
		System.out.println("5 Answer"+"  "+a);
		//6
		char ch = str.charAt(0);
			if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' || ch == 'a' || ch == 'e' || ch == 'i'
					|| ch == 'o' || ch == 'u')
			{
				System.out.println("5 Answer"+"  "+"Character is Vowel");
			}
			else{
				System.out.println("6 Answer"+"  "+"Character is Not Vowel");
			}
		//7
		char ch1 = str.charAt(str.length()-1);
		if(ch1>='A' && ch<='Z')
		{
			System.out.println("7 Answer"+"  "+"Its Alphabate");
		}

		if(ch1>='a' && ch<='z')
		{
			System.out.println("7 Answer"+"  "+"Its Alphabate");
		}
		
		else 
		{
			System.out.println("7 Answer"+"  "+"Its Not an Alphabate");	
		}
	
		//8
		int b = str.length()-1;
		
		if(b/2==0)
		{
			System.out.println("8 Answer"+"  "+"Its Even Number");	
		}
		else
		{
			System.out.println("8 Answer"+"  "+"Its Not Even Number");	
		}
		
		//9 Length is Prime number or not	
		int count=0;
		for(int i=2;i<b;i++)
		{
			if(b%i==0)
			{
				count++;
			}
				
		}
		if(count<2)
		{
			System.out.println("9 Answer"+"  "+"Its Prime Number");	
		}
		else 
		{
			System.out.println("9 Answer"+"  "+"Its Not Prime Number");	
		}
		
		}
	}


