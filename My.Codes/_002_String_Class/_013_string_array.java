package _002_String_Class;

public class _013_string_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String myStrings[] = { "Apple", "Orange", "Lemon" };

		System.out.println(myStrings[0]);
		System.out.println(myStrings[1]);
		System.out.println(myStrings[2]);

		String[] newArray = new String[10]; // (0 to 9) I can add 10 array value

		System.out.println("\n");

		newArray[0] = "Zero";
		newArray[1] = "One";
		newArray[2] = "Two";
		newArray[3] = "Three";

		System.out.println(newArray[0]);
		System.out.println(newArray[1]);
		System.out.println(newArray[2]);
		System.out.println(newArray[3]);

	}

}
