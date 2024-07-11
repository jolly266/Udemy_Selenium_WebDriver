package arrays_Practice;

import java.util.Scanner;

public class Print_UniqueNumber {

	public static void main(String[] args) {
		
		//Print Unique Number and How many times repeated
/*
		int m [] = {4,5,2,4,6,4,7,3,8,4,7,5,1,2,4,0};
				
		int x= 2;
		int y=3;
		String z = "Satya";
		
		String w = x+y+z;
		
		System.out.println(x+y+z);
		System.out.println(7/9+2/8+3%4+4%3);
		
		System.out.println((7>9)&&(5<=9));
		
		System.out.println("X=" + x + " Y="+y);
		*/		
		
		Scanner scanner = new Scanner(System.in);
		 
        System.out.print("Enter value for a: ");
        
        int a = scanner.nextInt();
        
        System.out.print("Enter value for b: ");
        int b = scanner.nextInt();
        
        System.out.println("a=" + a + ",b=" + b);
        
        scanner.close();
		
	}

}
