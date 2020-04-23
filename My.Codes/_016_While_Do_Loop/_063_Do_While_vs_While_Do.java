package _016_While_Do_Loop;

public class _063_Do_While_vs_While_Do {

	public static void main(String args[]) {

		for (int i = 1; i <= 14; i++) {

			if (i % 2 == 0) {

				System.out.println(i + "  is cift  sayi");
				continue; // if condition is correct jump up to for next line doesn't run

			}
			if (i == 7) {

				System.out.println(i + "  is cift  sayi");
				break; // 7 olunca for dongusu sonlanir devam etmez

			}

			System.out.println(i + "  is tek  sayi");
		}

	}
}
