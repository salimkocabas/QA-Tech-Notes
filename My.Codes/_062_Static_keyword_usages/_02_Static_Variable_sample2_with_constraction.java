package _062_Static_keyword_usages;

class Student {
	final static String School_name = "Code Academy"; // degistirilemez, kod hata verecektir.
	static String School_year = "2018-2019"; // static denilse de aslinda dinamik ama kod icinde degistirilebilir
												// static denmesi her bir kisi icin dynamic degil, bir kere yazili n
												// kere kullanilabilir
	int Student_ID;
	String Student_Name;
	double GPA;

	// constraction
	Student(int id, String name, double gpa) {
		Student_ID = id;
		Student_Name = name;
		GPA = gpa;
	}

	// ekrana yazdirmak icin
	void DisplayStudent() {
		System.out.printf("Student ID	: %s \tStudent Name	: %s\t GPA :%s%n", Student_ID, Student_Name, GPA);
	} 
}

public class _02_Static_Variable_sample2_with_constraction {

	public static void main(String[] args) {

		System.out.println(Student.School_name + " : " + Student.School_year);

		// tek tek obje yerine bir cirpida kayit create ediliyor...
		Student st1 = new Student(10, "John Smith", 3.6); st1.DisplayStudent();

		Student st2 = new Student(11, "Angela Lee", 3.9);st2.DisplayStudent();

		System.out.println();

		// okul yili degistirildi
		Student.School_year = "2019-2020";

		// ama okul adi final verildigi icin degisemez  
		// Student.School_name="New Code Academy"; 
		// ^^^^^ ******** Java izin vermiyor *********
		
		System.out.println(Student.School_name + " : " + Student.School_year);

		Student st3 = new Student(10, "John Smith", 4.0); st3.DisplayStudent();
		Student st4 = new Student(11, "Angela Lee", 4.5); st4.DisplayStudent();

	}
}