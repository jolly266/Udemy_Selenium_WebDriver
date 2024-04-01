package java_Practice;

public class DevidedBy_2 {

	public static void main(String[] args) {
		
		// Print numbers from defined array which is divided by 2
		int[] num = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		for (int i = 0; i < num.length; i++) {

			if (num[i] % 2 == 0) {
				System.out.println(num[i]);
			}
		}

		//Check whether there is any number which is divided by 2 or not
		int[] num2 = { 11, 21, 32, 4, 5, 6, 7, 8, 9, 10 };
		for(int i=0;i<num2.length;i++)	
		{
			if(num2[i]%2==0)
			{
			System.out.println(num2[i]);
			break;
			}
			
		}
		
		for (int i = 1; i <= 100; i++) {
            // Check if the current number is even
            if (i % 2 == 0) {
                // Print the even number
                System.out.println(i);
		
	}
		}
	}
}
