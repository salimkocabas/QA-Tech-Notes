package _004_Sysout;

public class _10_sysout_usage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i = 461012;
		System.out.format("The value of i is: %d%n", i);

		String myStrings[] = { "Apple", "Orange", "Lemon" };

		System.out.println("");

		for (int count = 0; count <= 2; count++) {
			System.out.format("(%d)", count);
			System.out.println(myStrings[count] + "n");
		}

	}

}
