package _008_IntegerClass;

public class _02_IntegerClassBasics {

	public static void main(String[] args) {


		Integer a = new Integer(10);   
		Integer b = new Integer(10);  
		Integer c = new Integer(20);   
		
		System.out.println(a==b);  //false Those are Different Objects
		System.out.println(a>=b);  //true  10>=10
		System.out.println(b<=a);  //true  10>=10
		System.out.println(a.equals(b));  // true 10=10
		
		System.out.println(Integer.min(b, c));   // small number is 10
		System.out.println(Integer.max(b, c));   // big numbers is 20
		System.out.println(Integer.compare(b, c));   // -1     b is smaller than c
		System.out.println(Integer.compare(a, b));   //  0     a is equal b
		System.out.println(Integer.compare(c, a));   //  1     c is bigger than a

		
		
	}

}
