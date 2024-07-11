package nested_Loop;

public class Decremental_Row_Pattern {

	public static void main(String[] args) {

		int k = 5;
		for (int i = 1; i < 6; i++) {

			for (int j = 1; j < 6; j++) {

				System.out.print(k+" ");
				
			}
			k--;
			System.out.println();
		}

	}

}
