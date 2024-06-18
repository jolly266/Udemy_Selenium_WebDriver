package arrays_Practice;

public class Print_MinimumNumber {

	public static void main(String[] args) {

		int a[][] = { { 5, 4, 6 }, { 5, 7, 9 }, { 1, 11, 15 } };

	int min = a[0][0];	
		
		for (int i = 0; i < a.length; i++) {

			
			for (int j = 0; j < a.length; j++) {
				
				if(a[i][j]>min) {
					
					min=a[i][j];
				}
			}
		}
		
		System.out.println(min);
	}
}
