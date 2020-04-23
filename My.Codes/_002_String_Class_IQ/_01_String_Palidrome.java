package _002_String_Class_IQ;

public class _01_String_Palidrome {

	public static void main(String[] args) {

		String s1 = "Madam";
		String s2 = "";

		for (int i = s1.length() - 1; i >= 0; i--) {
			s2 = s2 + s1.charAt(i);
		}

		System.out.print(s1 + " " + s2);

		if (s1.equalsIgnoreCase(s2))
			System.out.println(" :palidrome");

		else
			System.out.println(" :not palidrome");
	}

}
