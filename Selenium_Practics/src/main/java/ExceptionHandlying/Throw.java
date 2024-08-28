package ExceptionHandlying;

public class Throw {

	public static void main(String[] args) {
		
		String str = "Selenium";
		String str1 = "Manual";
		
		if(str.equalsIgnoreCase(str1))
			
		{
		System.out.println("String are Equals");	
		}
		
		else
			
			try{
		{
			
		throw new Error("String are not Equals");	
		}
			} catch (Exception e) {
			System.out.println(e.getMessage());	
			}
}
}