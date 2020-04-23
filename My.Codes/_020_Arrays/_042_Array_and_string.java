package _020_Arrays;

public class _042_Array_and_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] months = { "January", "February", "March", "June" };

		int[] numbers = { 4, 1, 5, 47, 4 };

		for (String x : months) {
			System.out.print(x + ", ");
			// x yerine herhangi bir şey olabilir a,b,c x, y,z initialize etmemizi
			// beklemiyor
		}

		System.out.println("");

		for (int y : numbers) {
			System.out.print(y + ", ");
		}

	}

}
