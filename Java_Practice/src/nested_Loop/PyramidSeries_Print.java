package nested_Loop;

public class PyramidSeries_Print {

	public static void main(String[] args) {
		
		for(int i=0;i<4;i++) {
			int a=1;
			for(int j=0;j<=i;j++) {	
				
				System.out.print(a);
				System.out.print(" ");
				a++;
			}
			System.out.println();
		}	
	}
}
