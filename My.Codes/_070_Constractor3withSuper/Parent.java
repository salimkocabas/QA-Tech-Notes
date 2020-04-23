package _070_Constractor3withSuper;

public class Parent {

	/**
	 * this constructor calls implicitly you get runtime compiling error Implicit
	 * super constructor Parent() is undefined. Must explicitly invoke another
	 * constructor
	 */
	 public Parent() { }

	public Parent(String str) {
		System.out.println("1: Welcome " + str);
	}

}
