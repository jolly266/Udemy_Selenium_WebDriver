package nested_Loop;

public class Decremental_Column {

	public static void main(String[] args) {

		for (int i = 1; i < 6; i++) {

			int k = 1;
			for (int j = 5; j >= i; j--) {

				System.out.print(k + " ");
				k++;
			}
			System.out.println();
		}

	}

}
