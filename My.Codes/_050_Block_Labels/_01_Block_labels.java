package _050_Block_Labels;

public class _01_Block_labels {

	public static void main(String args[]) {

		Boolean x = false;

		Task: if (!x) {

			System.out.println("1");
			break Task;
		}

		System.out.println("2");

	}
}
