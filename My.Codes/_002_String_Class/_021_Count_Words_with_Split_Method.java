package _002_String_Class;

public class _021_Count_Words_with_Split_Method {

	public static void main(String[] args) {

		String str = "Unthinking respect for authority is the greatest enemy of truth.";

		String[] arr = str.split(" ");
		System.out.println(arr.length + "words");

		int x = 0;

		for (String i : arr) {

			System.out.println(++x + " " + i);
		}
	}

}
