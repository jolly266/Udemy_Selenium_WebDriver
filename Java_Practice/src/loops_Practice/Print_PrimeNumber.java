package loops_Practice;

public class Print_PrimeNumber {

	public static void main(String[] args) {
		
		int num = 100;
		
		for(int i=2;i<=num;i++)
		{
			int count = 0;
			for(int j=2; j<=i;j++)
			{
				if(i%j==0)
				{
					count++;
				}
			}
			if(count<2)
			{
				System.out.println(i);
			}
		}
	
	}

}
