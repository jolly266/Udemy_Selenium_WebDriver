package nested_Loop;

import java.util.Scanner;

public class Incremental_Row_Pattern {

	public static void main(String[] args) {

		//int k=1;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Value for a :");
		int k= sc.nextInt();
		
		for (int a = 1; a <= 5; a++) {

			for (int b = 1; b < 6; b++) {

				System.out.print(k + " ");
			}
			k++;
			System.out.println();
		}
	}
}
