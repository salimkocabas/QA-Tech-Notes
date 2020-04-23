package _062_Static_keyword_usages;

public class _02_Static_Variable_sample {

	// **************** static variable ornek *********************

	static String School_name = "Science Academy";
	static String School_year = "2018-2019"; // bu surekli degisen bir veri degil ve herkes icin ayni; memory'de bir
												// blok isgal edecek defalarca kullanilsa bile
												// ancak istenildigi zaman degistirilebilir, JAVA buna izin verir

	// bu degiskenler kisiye gore degisecek
	int Student_ID;
	String Student_Name;
	double GPA;

	void Display() {

		System.out.printf("Student ID	: %s \tStudent Name	: %s\t GPA :%s%n", Student_ID, Student_Name, GPA);

	}

	public static void main(String[] args) {

		System.out.println(School_name+" :"+School_year);

		_02_Static_Variable_sample Student1 = new _02_Static_Variable_sample();

		Student1.Student_ID = 10;
		Student1.Student_Name = "John Smith";
		Student1.GPA = 3.5;
		Student1.Display();

		_02_Static_Variable_sample Student2 = new _02_Static_Variable_sample();
		Student2.Student_ID = 11;
		Student2.Student_Name = "Mike Right";
		Student2.GPA = 3.9;
		Student2.Display();

		// okul ismi sabit birakilip okul yili degistiriliyor
		
		School_year = "2019-2020";
		System.out.println();
		System.out.println(School_name+" :"+School_year);

		// ogrencilerin GPAleri guncelleniyor

		Student1.GPA = 3.9;
		Student1.Display();

		Student2.GPA = 4.0;
		Student2.Display();
		
		
		// yeni bir ogrenci ekleniyor

		_02_Static_Variable_sample Student3 = new _02_Static_Variable_sample();
		Student2.Student_ID = 13;
		Student2.Student_Name = "Julia Sun";
		Student2.GPA = 4.5;
		Student2.Display();
		
		
	}

}
