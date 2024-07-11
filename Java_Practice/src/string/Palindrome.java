package string;

public class Palindrome {

	public static void main(String[] args) {
		
		String str = "Madam";
		String s = "";
		
		for(int i=str.length()-1;i>=0;i--)
		{
			s=s+str.charAt(i);
		}

		if(str.equalsIgnoreCase(s))
		{
			System.out.println("Its Palindrome");
		}
		else
		{
			System.out.println("Not Palindrome");
		}
	}

}
