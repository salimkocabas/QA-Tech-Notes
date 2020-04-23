package _015_For_Loop;

public class _062_for_loop5_nested_loop_with_string_shrink {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		String star = "*";
		String text = star;
		int number_of_star = 5;

		// option-1

//		for (int x = 1; x <= number_of_star; ++x) {
//			text += star;
//			System.out.println(text);
//		}
//
//		for (int x = 1; x <= number_of_star; ++x) {
//			System.out.println(text.substring(0, text.length() - x - 1));
//		}

		// option-2
		for (int x = 1; x < number_of_star; ++x) {
			text += star;
		}

		for (int i = text.length(); i > 0; i--) {
			System.out.println(text.substring(i - 1));
		}

		for (int i = text.length() - 1; i > 0; i--) {
			System.out.println(text.substring(0, i));
		}

	}
}