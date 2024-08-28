package ExceptionHandlying;

public class TryCatch {

	public static void main(String[] args) {
	
		try {
		int a = 456;
		int b = 0;
		int c =a/b;
		
		System.out.println(c);
		}catch(Exception t)
		{
			System.out.println(t.getMessage());
			t.printStackTrace();
		}

	}

}
