package _004_Sysout;

public class _11_sysout_usage2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(" This is \n a test");

		String myStrings[] = { "Apple", "Orange", "Lemon" };

		for (int count = 0; count <= 2; count++) {
			System.out.print(myStrings[count]);
		}

		System.out.println("");

		for (int count = 0; count <= 2; count++) {
			System.out.print(myStrings[count] + "\n");
		}

	}

}
