package _081_Inheritence;

public class Son extends Dad {

	public static void main(String[] args) {

		Son son = new Son();

		// System.out.println(son.firstName); firstName is Dad class is private, because
		// owner is dad
		System.out.println(son.lastName);  //Brown

		son.lastName = "White"; //  son can change his lastname but dad lastname is still Brown
		System.out.println(son.lastName); //White

		Dad dad = new Dad();

		System.out.println(dad.returnInfo()); // return gives information

	}

	
	
	
	
}
