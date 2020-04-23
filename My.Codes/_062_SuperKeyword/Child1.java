package _062_SuperKeyword;

public class Child1 extends Parent {

	String name = "Child1";

	public void getStringData() {

		System.out.println(name); // child class variable
		// System.out.println(this.name); // same

		System.out.println(super.name); // parent class variable
		// System.out.println(((Parent) this).name); // same

		System.out.println(((GrandParent) this).name); // GrandParent class variable

	}
}
