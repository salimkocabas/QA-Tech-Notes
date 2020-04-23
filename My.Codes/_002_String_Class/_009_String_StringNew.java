package _002_String_Class;

public class _009_String_StringNew {

	public static void main(String[] args) {

		
		
		System.out.print("1- ");
		String a = "Java";
		String b = "Java";
		System.out.println(a == b);  // True
		
		System.out.println(a.hashCode()+","+b.hashCode());  //same hashCode

		// String class while creating new object checks (heap) memory, if it is exist , java uses same value.
		// when you compare it Java says they are same, case is TRUE for this situation
		
		
		System.out.print("2- ");
		String c = new String("Java");
		String d = new String("Java");
		System.out.println(c == d); // False

		
		
		//while creating new object as new String("value"), java  creates new object
		// c is new object, d is new object too, they are not same object
		//if you want to compare it use  equals()
		System.out.print("3- ");
		System.out.println(c.equals(d)); //true
		System.out.println(c.hashCode()+","+d.hashCode());  //same hashCode that means content are same
		
		
		
		
		System.out.print("4- ");
		String e = "JDK";
		String f = new String("JDK");
		System.out.println(e == f); // False

		System.out.print("5- ");
		System.out.println(e.equals(f)); //true
		System.out.println(e.hashCode()+","+f.hashCode());  //same hashCode that means content are same
		
		
		// Read more:
		// https://www.java67.com/2014/08/difference-between-string-literal-and-new-String-object-Java.html#ixzz6HCttHHy2

	}

}
