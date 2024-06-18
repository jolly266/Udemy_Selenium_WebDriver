package nested_Loop;

public class Sequence_Print {

	public static void main(String[] args) {
		
		for(int i=1;i<6;i++) {
			
			
			for(int j=1;j<7;j++) {
				System.out.print(j%2+" ");
			
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println();
		
		int k=3;
		
		for(int a=1;a<4;a++) {
			
			for(int b=1;b<=a;b++) {
				System.out.print(k+" ");
				k=k+3;		
			}
			System.out.println();
		}
	}

}
