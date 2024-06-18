package nested_Loop;

public class PyramidReverse_Print {

	public static void main(String[] args) {
		
		
		int a=11;
		for(int i=0;i<4;i++) {
			
			for(int j=0;j<=i;j++) {
				System.out.print(a);
				System.out.print(" ");
				a++;
			}
			System.out.println();
		}
	}

}
