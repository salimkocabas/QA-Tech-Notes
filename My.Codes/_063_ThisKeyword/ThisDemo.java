package _063_ThisKeyword;

public class ThisDemo extends Parent {

	String str = "Class variable";
	static String str2;
	static double number;

	public void getData() {

		String str = "Method variable";
		
		//don't confuse with variable names as str, they can be different
		// if use str because of i want to show that  all "str" are different
		System.out.println("Method variable        {Local from Method }    : " + str);
		System.out.println("Class variable (this)  {Local from Class  }    : " + this.str);
		System.out.println("Parent variable (this) {Global from Parent}    : " + super.str);
	}

	public static String returnData() {
		str2 = "From another method";
		return str2;
	}

	public static void main(String[] args) {

		ThisDemo co = new ThisDemo();
		System.out.println(co.str); // Class variable
		// can not access methods variable if it declarated inside of method
		// you can write inside of method do something with variable
		// you can print etc.
		// create a method that have capable to give return value
		// that means you can access indirectly

		co.getData();

		System.out.println("Another method variable that returned            :" + returnData());

		Parent po = new Parent();
		System.out.println(po.str); // Parent variable can accessible
		

	}

}
