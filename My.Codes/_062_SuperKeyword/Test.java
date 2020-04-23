package _062_SuperKeyword;

public class Test extends Child1 {

	String name = "Test class (this class)";

	// override methods
	public void getStringData() {

		System.out.println(name);

		System.out.println(super.name); // parent class variable
		// System.out.println(((Parent) this).name); // same

		System.out.println(((GrandParent) this).name); // Grand parent class variable

	}

	public static void main(String[] args) {

		System.out.println("Call Child1 Class:");
		Child1 co1 = new Child1();
		co1.getStringData();

		System.out.println();
		System.out.println("Call Child2 Class:");
		Child2 co2 = new Child2();
		co2.getStringData();

		System.out.println();
		System.out.println("Call overrided method in this Class:");
		Test to = new Test();
		to.getStringData();

	}

}
