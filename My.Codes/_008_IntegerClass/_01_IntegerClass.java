package _008_IntegerClass;

public class _01_IntegerClass {

	/*
	 * 
	 * Integer class is a wrapper class for the primitive type int which contains
	 * several methods to effectively deal with a int value like converting it to a
	 * string representation, and vice-versa. An object of Integer class can hold a
	 * single int value.
	 * 
	 */

	public static void main(String[] args) {

		Integer a = new Integer(10); // it creates new Integer Object
		Integer b = new Integer(10); // it creates new Integer Object

		System.out.println(a);
		System.out.println(b);

		System.out.println(a == b); // Object memory reference are not same
		System.out.println(a.equals(b)); // Object values are same

	}

}
