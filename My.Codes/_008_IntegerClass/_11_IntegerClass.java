package _008_IntegerClass;

public class _11_IntegerClass {

	public static void main(String[] args) {

		int a = 10;
		Integer aO1 = 10;
		Integer aO2 = new Integer(a);
		Integer aO3 = new Integer(10);
		

		if (a == 10 & aO1 == 10 & aO2 == 10 & aO3 == 10)
			System.out.println("1:true");
		else
			System.out.println("1:false");

		if (a == aO1)
			System.out.println("2:true");
		else
			System.out.println("2:false");

		if (a == aO2)
			System.out.println("3:true");
		else
			System.out.println("3:false");

		if (aO1 == aO2)
			System.out.println("4:true");
		else
			System.out.println("4:false");

		if (aO2 == aO3)
			System.out.println("5:true");
		else
			System.out.println("5:false");


		if (aO1.equals(aO2))
			System.out.println("6:true");
		else
			System.out.println("6:false");

		if (aO2.equals(aO3))
			System.out.println("7:true");
		else
			System.out.println("7:false");
		
		
	}
}
