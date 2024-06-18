package arrays_Practice;

public class MultiDiaArray_Print {

	public static void main(String[] args) {
		
		String item[][] = {{"R","A","M"},{"D","E","V"},{"J","E","E"},{"S","I","R"}};
		
		
		String item2[]= {"R","A","M"};
		
		
		
		for(int a=0;a<item2.length;a++) {
			
			System.out.println(item2[a]);
		}
		
		for(int i = 0;i<item.length;i++) {
			
			for(int j=0;j<3;j++) {
				
				System.out.print(item[i][j]+" ");
			}
			
			System.out.println();
		}
	}

}
