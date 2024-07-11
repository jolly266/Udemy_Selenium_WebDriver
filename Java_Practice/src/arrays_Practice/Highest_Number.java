package arrays_Practice;

import java.util.Scanner;

public class Highest_Number {

	public static int secondHighest(int[] arr, int n) {
		for (int i = 0; i < n - 1; i++) {
			for (int j = i + 1; j < n; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		return arr[n - 2];
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array: ");
		
		int size = sc.nextInt();
		int[] arr = new int[size];
		
		System.out.println("Enter Element: ");
		
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(secondHighest(arr, size));
		sc.close();

	}
}
