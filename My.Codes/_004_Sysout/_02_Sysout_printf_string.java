package _004_Sysout;

public class _02_Sysout_printf_string {

	public static void main(String args[]) {

		String name1 = "Mr Nemo";
		String name2 = "Me Bee";
		int num1 = 100;
		int num2 = 99;
		System.out.format("%-20s   %4d%n", name1, num1);
		System.out.format("%-20s   %4d%n", name2, num2);

		
		
		System.out.format("%-10s   %,14d%n", "Ahmet", 154545);   //  %,  1000 lik basamaklara ayirir
		System.out.format("%-10s   %,14d%n", "Mehmet", 45465456);
		System.out.format("%-10s   %,18.3f%n", "Ali", 45465456.321321);
		System.out.format("%-10s   %,18.3f%n", "Veli", 122.331231221);
		
		
		
	}

}

//http://www.javawithus.com/tutorial/displaying-text-using-printf-method
//https://www.baeldung.com/java-printstream-printf