package _008_IntegerClass;

public class IntegerParseInt {

	public static void main(String[] args) {

		
		//option 1: 
		String strA="2";
		String strB="8";
		int intA = Integer.parseInt(strA);
		int intB = Integer.parseInt(strB);

		System.out.println(intA*intB);
		
		// if there is some spaces
		String strC="5   ";
		int intC=Integer.parseInt(strC.trim());  //deletes spaces
		System.out.println(intA*intB*intC);
		

		//option2:
		int intA2=Integer.valueOf(strA);
		System.out.println(intA2*2);
		
		
		//double
		String strD="12.444   ";
		Double dobD=Double.parseDouble(strD.trim());  //deletes spaces and then convert double
		System.out.println(2*dobD);
		
		
		
		
		//integer to string
		int a=10;
		String b=Integer.toString(a);
		System.out.println(a+a);
		System.out.println(b+b);
		
		
		
	}

}
