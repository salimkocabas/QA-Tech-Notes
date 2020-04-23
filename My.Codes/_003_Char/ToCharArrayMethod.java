package _003_Char;

public class ToCharArrayMethod {

	public static void main(String[] args) {

		String str = "Hello World!";

		char[] array = str.toCharArray();

		for (char i : array) 
			System.out.print(i);
		
		
	}

}
