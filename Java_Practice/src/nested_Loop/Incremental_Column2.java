package nested_Loop;

public class Incremental_Column2 {

	public static void main(String[] args) {

		for (int i = 1; i < 6; i++) {

			for (int j = i; j >= 1; j--) {

				System.out.print(j + " ");
			}
			System.out.println();

		}
	}
}