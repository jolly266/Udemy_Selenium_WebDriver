package java_Practice;

public class Simple_Array {

	public static void main(String[] args) {
		// Traditional way of declaring and assigning of Array
		int[] arr = new int[5];
		arr[0] = 1;
		arr[1] = 3;
		arr[2] = 5;
		arr[3] = 7;
		arr[4] = 9;

		System.out.println(arr[3]);
		System.out.println("*********************************");

		// Assigning and declaring in single line
		int[] arr2 = { 2, 4, 6, 8, 10 };
		System.out.println(arr2[3]);
		System.out.println("*********************************");

		String[] name = { "Jwala", "Prakash", "Devi", "Patil" };
		System.out.println(name[2]);
		System.out.println("*********************************");

		// Print all items from array
		String[] name2 = { "Devi", "Devika", "Devsena", "Devdutt" };
		for (int i = 0; i < name2.length; i++) {
			System.out.println(name[i]);
		}
		System.out.println("*********************************");

		// Enhanced for loop
		String[] roll = { "Srch", "High", "School" };
		for (String s : roll) {
			System.out.println(s);
		}
		System.out.println("*********************************");

	}

}
