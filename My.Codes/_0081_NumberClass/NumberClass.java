package _0081_NumberClass;

public class NumberClass {

	public static void main(String[] args) {

		Number x;
		
		
		x=1; System.out.printf("%-20s : %s%n",x,x.getClass());
		x=1.1; System.out.printf("%-20s : %s%n",x,x.getClass());
		x=1000000000000000L; System.out.printf("%-20s : %s%n",x,x.getClass());
		x=1.00000000000009D; System.out.printf("%-20s : %s%n",x,x.getClass());
		x=1.00000000000009F; System.out.printf("%-20s : %s%n",x,x.getClass());
		
		
		//primitive data types
		System.out.println();
		x=(int)1; System.out.printf("%-20s : %s%n",x,x.getClass());
		x=(byte)1; System.out.printf("%-20s : %s%n",x,x.getClass());
		x=(short)10; System.out.printf("%-20s : %s%n",x,x.getClass());
		
		
	}

}
