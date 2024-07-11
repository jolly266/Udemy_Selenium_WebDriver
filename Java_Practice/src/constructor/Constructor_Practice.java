package constructor;

public class Constructor_Practice {

	public static void main(String[] args) {
	
		
		
		String s1= "India";
		String s2 = "India";
		
		String s3= new String("India");
		
		char[] s4= {'I','n','d','i','a'};
		
		System.out.println(s1.equals(s2));
		System.out.println(s1==s2);	 
		
		System.out.println(s1==s3);
		System.out.println(s1.equals(s3));
		
		
		System.out.println(s1.equals(s4));
		
		
		
	}

}
