package _063_ThisKeyword2;

public class MainThisMethod {

	String str = "Have a beatiful day";

	void greeting() {
		System.out.println("Welcome");
	}

	void byebye() {
		System.out.println("Good bye");
		System.out.println(this.str);   //this.<variable in class>
	}

	void show() {
		this.greeting();
		this.byebye();
	}

	void show(String str) {
		this.greeting();
		System.out.println("Hello " + str);
		this.byebye();
	}

	public static void main(String args[]) {

		MainThisMethod t1 = new MainThisMethod();
		t1.show();

		System.out.println();
		MainThisMethod t2 = new MainThisMethod();
		t2.show("Angel");

	}

}
