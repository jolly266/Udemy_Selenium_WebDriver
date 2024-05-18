package loops_Practice;

public class primeno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
	for(int i=0;i<=20;i++)
		
	{
		int count=0;		
		for(int j=2;j<=20;j++)
		{
		
		if(i%j==0)
		{
			//System.out.println(i);
			count++;
		}
		}
		
		if(count==1)
		{
			System.out.println(i);
	}
	}

	}

}
