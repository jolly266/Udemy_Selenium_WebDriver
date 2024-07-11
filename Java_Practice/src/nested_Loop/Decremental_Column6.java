package nested_Loop;

public class Decremental_Column6 {

	public static void main(String[] args) {
		

		for (int i = 1; i < 6; i++) {

			int k = 5;
			for (int j = 1; j<=6-i; j++) {

				System.out.print(k + " ");
				k--;
			}
			System.out.println();

		}

	}

}
