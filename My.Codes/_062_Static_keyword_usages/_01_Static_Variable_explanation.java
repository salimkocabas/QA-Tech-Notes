package _062_Static_keyword_usages;

public class _01_Static_Variable_explanation {

	String str1 = "str1"; // class icinde veya class cagrilirsa erisilebilir
	static String str2 = "str2"; // tum kod icinden erisim imkani var "static" kelimesi bu ise yariyor

	void display() {

		System.out.println(str1);
		System.out.println(str2);
	}

	public static void main(String[] args) {

		// DURUM:1
		System.out.println("Durum 1:");
		// System.out.println(str1); //bu hata verir
		System.out.println("str1 cannot accessable");
		System.out.println(str2); // cagirdigimiz deger static, kod icinden erisilebilir. output : str2

		// DURUM:2
		System.out.printf("%nDurum 2:%n");
		_01_Static_Variable_explanation obj1 = new _01_Static_Variable_explanation(); // classtaki objelere ve metoda bu sekilde ulasilabilir

		obj1.display(); // method yardimi ile tum degerler print edildi

		// DURUM:3
		System.out.printf("%nDurum 3:%n");
		obj1.display(); // method yardimi ile tum degerler print edildi

		// DURUM:4
		System.out.printf("%nDurum 4:%n");
		obj1.str1 = "new str1"; // objeye yeni bir deger atandi
		obj1.str2 = "new str2";// objeye yeni bir deger atandi
		str2="new str2"; 		// yukaridaki islem ile ayni

		obj1.display(); // method yardimi ile tum degerler print edildi


	}

}
