package loops_Practice;

public class NestedLoop_ForLoop {

	public static void main(String[] args) {

		
		for (int i=1; i<4; i++)
		{
			System.out.println("Outer Loop Started");

			for (int j=1; j<4; j++)// To Finish 1 Outer loop 4 inner loop will run 
			{
				System.out.println("Inner Loop");
			}
			
			System.out.println("Outer Loop Finished");
		}

	}

}
