package _020_Arrays;

public class _046_Print_Slowly_what_you_enter3_happy_coding {

	public static void main(String args[]) throws InterruptedException {

		int enigma[] = { 72, 97, 112, 112, 121, 32, 67, 111, 100, 105, 110, 103, 32, 69, 115, 114, 97, 32, 58, 41 };
		char letter;

		// burasi ekrana normal hizda yaziyor
		for (int i = 0; i < enigma.length - 3; i++) {
			letter = (char) enigma[i]; // sayi karaktere donusturuluyor
			System.out.print(letter);

		}

		System.out.println("\n Happy \n   Coding...."); // metnin icine yerlestirilmis (\n) new line komutudur,
														// yeni satir acar, cok kullanisli

		// burasi ayni seyleri yavas yavas yaziyor, speed ile hiz ayarlanir
		int speed = 200; // 50 ms bekliyor. (1 sn =1000 ms),

		for (int i = 0; i < enigma.length; i++) {
			letter = (char) enigma[i]; // sayi karaktere donusturuluyor
			System.out.print(letter);
			Thread.sleep(speed); // bekletme kismi burasi

		}

		/*
		 * evet yukaridaki sayilar sifre degil, bilgisayardaki herseyin sayisal
		 * karsiligi var. Karakterlerin de sayisal karisiliklari var.
		 */

		System.out.println("\r");
		char karakter = 65;
		System.out.println(karakter);
		// 65'n karsiligi ekrana A harfi cikti. (0-255) google amcaya sorunca soyler
		// `ascii table`

	}
}
