package _070_Constractor1;

public class ThisExample {

	 String name;
	 int age;
	 float weight;

	// without using this keywords
	public void getDetailsWithoutThisKeyword(String name, int age, float weight) {
		name = name;
		age = age;
		weight = weight;
	}

	// using this keywords
	public void getDetailsWithThisKeyword(String name, int age, float weight) {
		this.name = name;
		this.age = age;
		this.weight = weight;
	}

	public void putDetails() {
		System.out.println("Name   : " + name);
		System.out.println("Age    : " + age);
		System.out.println("Weight : " + weight);
	}

	public static void main(String args[]) {
		// Object creation

		ThisExample objExThis = new ThisExample();

		objExThis.getDetailsWithoutThisKeyword("Mr. Bee", 50, 78.5f);
		System.out.println("Values after get details using getDetailsWithoutThis():");
		objExThis.putDetails();

		System.out.println();
		
		objExThis.getDetailsWithThisKeyword("Mr. Bee", 50, 78.5f);
		System.out.println("Values after get details using getDetailsWithThis():");
		objExThis.putDetails();
	}
}
