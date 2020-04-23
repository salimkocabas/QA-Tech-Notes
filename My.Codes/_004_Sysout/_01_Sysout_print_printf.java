package _004_Sysout;

public class _01_Sysout_print_printf {

	public static void main(String[] args) {

		String text1 = "Life is short!";
		String text2 = "Time is fast!";

		System.out.println("My message  :" + text1);

		
		System.out.printf("My second message is \"%s\"  I always say that...", text2);

		System.out.printf("%n%n%S%n\t%S", text1, text2);

	}

}
