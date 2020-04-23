package _150_HashCode;

public class j01_HashCodeInteger {

	public static void main(String[] args) {

		
		int num1=10;
		int num2=20;
		int num3=30;
		int num4=num1+num2;
		

		System.out.println(Integer.toString(num1).hashCode());   //there is no hashCode() for Integer and all primitive data types short, int, char etc.
		System.out.println(Integer.toString(num2).hashCode());
		System.out.println(Integer.toString(num3).hashCode());
		System.out.println(Integer.toString(num4).hashCode());

	}

}
