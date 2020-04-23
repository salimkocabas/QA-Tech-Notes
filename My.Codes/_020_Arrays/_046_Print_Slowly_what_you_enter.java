package _020_Arrays;

import java.util.concurrent.TimeUnit;

public class _046_Print_Slowly_what_you_enter {

	public static void main(String args[]) throws InterruptedException {
		String text = "Hello World!!!";

		// option 1: Thread.sleep(miliseconds)

		System.out.println("speed 100 ms");
		for (int i = 0; i < text.length(); ++i) {
			Thread.sleep(100);
			System.out.print(text.charAt(i));
		}

		// option 2: TimeUnit.SECONDS.sleep(saniye) fonksiyonu ile

		System.out.println("\n\nspeed 1 sn");
		for (int i = 0; i < text.length(); ++i) {
			TimeUnit.SECONDS.sleep(1);
			System.out.print(text.charAt(i));

		}

		System.out.println();

	}
}
