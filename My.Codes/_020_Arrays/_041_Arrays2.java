package _020_Arrays;

public class _041_Arrays2 {

	public static void main(String[] args) {
		String[] months = { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

		// display only one of array member
		System.out.println(months[7]);

		// print all arrays values w/FOR command

		for (String x : months) {
			System.out.print(x + ", ");
		}

		// value can be change any time

		months[0] = "January";

		System.out.println(" ");
		System.out.println(" ");
		System.out.println("#1 value is changed Jan to January");

		for (String x : months) {
			System.out.print(x + ", ");
		}

		// alternative usage FOR command

		System.out.println(" ");
		System.out.println(" ");

		int size = months.length;

		System.out.println(size);

		for (int i = 0; i < size; i++) {
			System.out.print(months[i] + "..");
		}

	}
}
