package basicpatterns;

public class Pattern16_StarPattern {

	public static void main(String[] args) {

		for (int i = 1; i <= 5; i++) {

			for (int k = 1; k <= i; k++) {

				System.out.print(" ");

			}

			for (int j = 5; j >= i; j--) {

				System.out.print(i);

			}

			System.out.println();

		}

	}

}
