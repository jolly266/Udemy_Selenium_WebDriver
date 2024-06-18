package nested_Loop;

public class Pyramid_Print {

	public static void main(String[] args) {
		
		int a=1;
		
		for(int i=0;i<4;i++) {
			
			
			for(int j=0; j<4-i;j++) {
				System.out.print(a);
				System.out.print(" ");
				a++;			
			}
			System.out.println();
		}
		
	}

}
