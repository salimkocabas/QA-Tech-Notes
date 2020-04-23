package _020_Arrays;

public class _046_Print_Slowly_what_you_enter2_ {

	public static void main(String args[]) throws InterruptedException {
		String myText = "Hello Wolrd!\n"; // "\n" bitince new line yapiyor
		int speed = 50;

		// normal mesaj yaziliyor
		for (int i = 0; i < myText.length(); ++i) {
			Thread.sleep(speed); // ekrana yazarken her harf için x ms bekliyor
			System.out.print(myText.charAt(i));
		}

		// string icindeki tüm karakterler kucuk harf yapildi
		myText = myText.toLowerCase();
		for (int i = 0; i < myText.length(); ++i) {
			Thread.sleep(speed);
			System.out.print(myText.charAt(i));
		}

		// string icindeki tüm karakterler BUYUK harf yapildi

		myText = myText.toUpperCase();
		for (int i = 0; i < myText.length(); ++i) {
			Thread.sleep(speed);
			System.out.print(myText.charAt(i));
		}

		// tersten yaziliyor
		for (int i = myText.length(); i > 0; --i) {
			Thread.sleep(speed);
			System.out.print(myText.charAt(i - 1));
		}

	}
}
