package _018_Switch;

public class _02_Sample {

	public static void main(String[] args) {

		System.out.println(getDaysOfMonth(1));
		System.out.println(getDaysOfMonth(2));
		System.out.println(getDaysOfMonth(12));

	}

	public static int getDaysOfMonth(int month) {

		switch (month) {
		case 2:
			return 28;
		case 4:
		case 6:
		case 9:
		case 11:
			return 30;
		default:
			return 31;
		}
	}

}
