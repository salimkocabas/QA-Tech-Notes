package _015_For_Loop;

public class _062_for_loop {

	public static void main(String args[]) {

		String arr[] = { "apple", "orange", "lemon", "peach" };

		for (String i : arr) {
			System.out.println(i);

			if (i == "orange") {
				System.out.println("i like it...");
			}
		}
	}

}
