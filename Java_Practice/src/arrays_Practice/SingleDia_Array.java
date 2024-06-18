package arrays_Practice;

public class SingleDia_Array {

	public static void main(String[] args) {

		int a[] = new int[5];
		a[0] = 1;
		a[1] = 2;
		a[2] = 3;
		a[3] = 4;
		a[4] = 5;
		
		String item[]=new String[4];
		item[0]="Ram";
		
		System.out.println(a[0]);
		System.out.println(item[0]);
		System.out.println(a[1]);

		for (int i = 0; i<= a.length-1; i++) {
			System.out.println(a[i]);
		}	
		
		String item2[]= {"Shyam","Singha","Roy"};
		for(int j=0;j<=item2.length-1;j++) {
			System.out.println(item2[j]);
			
		}
		
		
	}

}
