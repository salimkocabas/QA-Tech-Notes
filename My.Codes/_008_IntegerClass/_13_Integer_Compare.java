package _008_IntegerClass;

public class _13_Integer_Compare {

	public static void main(String[] args) {

		System.out.println("Maximum Integer number : "+Integer.MAX_VALUE);   //maximum value of integer  : 2147483647
		System.out.println("Minimum Integer number :"+Integer.MIN_VALUE);   //minimum value of integer  :-2147483648
		
		System.out.println(Integer.TYPE);  // is int
		System.out.println("--------------");
		
		System.out.println(Integer.compare(20, 20));   // equal 	result 0
		System.out.println(Integer.compare(20, 10));   // a >  b 	result 1
		System.out.println(Integer.compare(10, 20));   // a <  b 	result -1

	
		
		System.out.println();
		System.out.println("x.comparareTo(y)");
		System.out.println("------------------------");
		Integer a=10,b=10;   
		System.out.println(a.compareTo(b));  // | a=b  0  |  a<b  -1 |  a>b  1|
		
	
		// Integer.valuOf(str)
		System.out.println("Integer.valuOf(str)");
		System.out.println("----------------------------");
		System.out.println(Integer.valueOf("123456789"));           
		System.out.println(Integer.valueOf("123456789  ".trim()));           
		
		System.out.println();

		
		// Integer.toSring()
		System.out.println("Integer.toString()");
		System.out.println("--------------");
		int c=10;
		String d=Integer.toString(c);
		System.out.println(c+c);
		System.out.println(d+d);
		
		
		
	}

}
