package _015_For_Loop;

public class _062_for_loop1 {

	public static void main(String[] args) {

		int a = 3, b = 5;

		for (int x = 1; x <= a; ++x) {
			System.out.format("%d :", x);

			for (int y = 1; y <= b; ++y) {
				System.out.format(" %d", y);
			}

			System.out.println();
		}

	}

}
