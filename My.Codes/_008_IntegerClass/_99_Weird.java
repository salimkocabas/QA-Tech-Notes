package _008_IntegerClass;

public class _99_Weird {

	public static void main(String[] args) {

		Integer a1 = 400;
		Integer a2 = 400;
		System.out.println(a1 == a2); // |false|

		Integer b1 = 20; 
		Integer b2 = 20;
		System.out.println(b1 == b2); // |true|Java cached the values between -128 / 127

		Integer c1 = new Integer(20);
		Integer c2 = new Integer(20);
		System.out.println(c1 == c2); // |false |we forced Java to create 2 different object
		System.out.println(c1.equals(c2));  // |true|

	}

}
