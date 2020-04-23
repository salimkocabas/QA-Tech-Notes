package _002_String_Class;

public class _021_Split_Method2 {

	public static void main(String[] args) {

		String str = "This is Sunday. What a beatiful Day that is sunny day. I'll got out.";
		System.out.println(str);
		String[] array = str.split("\\."); // . lara kadar cümleleri bölüyor, . lar uçuyor

		System.out.printf("There is %d sentecence in all string\r", array.length);

		for (String x : array)
			System.out.println(x.trim() + ".");
		// başında boşluk olduğu için onu trim ediyoruz
		// . lar uçtuğu için sonuna tekrar ekledim

	}

}
