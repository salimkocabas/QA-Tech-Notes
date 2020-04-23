package _004_Sysout;

public class _12_sysout_usage3_format_output {

	public static void main(String args[]) {

		double dblTotal = 21312.932131239331212321;
		int intValue = 21;
		String stringVal = "Hello World!!!";

		System.out.printf("Total is: $%,.2f%n", dblTotal);
		System.out.printf("Total: %-10.2f: ", dblTotal);
		System.out.printf("% 4d", intValue);
		System.out.printf("%20.12s\n", stringVal);
		String s = "Hello World";
		System.out.printf("The String object %s is at hash code %h%n", s, s);

		
		
		
		System.out.printf("'%s' %n", stringVal);  //'Hello World!!!' 
		System.out.printf("'%S' %n", stringVal);  //'HELLO WORLD!!!' 
		System.out.printf("'%20s' %n", stringVal);  //              'Hello World!!!' 
	}

}

/*

s – formats strings
d – formats decimal integers
f – formats the floating-point numbers
t– formats date/time values

*/