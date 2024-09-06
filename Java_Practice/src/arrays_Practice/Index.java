package arrays_Practice;

public class Index {

	public static void main(String[] args) {

		int[] a = {1, 2, 3, 4};
        int[] result = new int[a.length];
        
        // Loop through each element in the array
        for (int i = 0; i < a.length; i++) {
            int product = 1;
            
            // Calculate the product of all elements except the current one
            for (int j = 0; j < a.length; j++) {
                if (i != j) {
                    product *= a[j];
                }
            }
            
            System.out.println(product);
            
            // Store the product in the result array
            result[i] = product;
        }
        
        // Print the result array
        for (int value : result) {
            System.out.print(value + " ");
        }
	}

}
