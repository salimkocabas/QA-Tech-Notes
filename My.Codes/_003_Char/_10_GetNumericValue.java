package _003_Char;

public class _10_GetNumericValue {

	public static void main(String[] args) {
		
		
		System.out.println(Character.getNumericValue('0'));
		System.out.println(Character.getNumericValue('1'));
		System.out.println(Character.getNumericValue('2'));
		System.out.println(Character.getNumericValue('3'));
		System.out.println(Character.getNumericValue('4'));
		System.out.println(Character.getNumericValue('5'));
		System.out.println(Character.getNumericValue('6'));
		System.out.println(Character.getNumericValue('7'));
		System.out.println(Character.getNumericValue('8'));
		System.out.println(Character.getNumericValue('9'));
		System.out.println(Character.getNumericValue('a'));
		System.out.println(Character.getNumericValue('b'));
		System.out.println(Character.getNumericValue('z'));
		System.out.println(Character.getNumericValue('!'));  //it is not in a alphabet
		System.out.println(Character.getNumericValue('?'));
		System.out.println("------------------------------");
		System.out.println(Character.getNumericValue('A'));  // a and A same numeric value  0-9 A-Z (letter alphabetic order)
		System.out.println(Character.getNumericValue('B'));

		
		
		
	}

}
