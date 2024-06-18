package arrays_Practice;

public class MultiDia_Array {

	public static void main(String[] args) {
		
		int a[][] = new int[4][3];
		a[0][0] = 2;
		a[0][1] = 4;
		a[0][2] = 6;
		a[1][0] = 8;
		a[1][1] = 10;
		a[1][2] = 12;
		a[2][0] = 14;
		a[2][1] = 16;
		a[2][2] = 18;
		a[3][0] = 20;
		a[3][1] = 22;
		a[3][2] = 24;
		
		System.out.println(a[3][2]);
		
		// 12 15 18
		// 21 24 27
		// 30 33 36	
		// 39 42 45
	int	b[][]= {{12, 15, 18},{21, 24, 27},{30, 33, 36},{39, 42, 45}};
	
	System.out.println(b[3][2]);
		
	}

}
