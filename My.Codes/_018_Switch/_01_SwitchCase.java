package _018_Switch;

public class _01_SwitchCase {

	public static void main(String[] args) {

		int dayOfWeek = 9;
		String day;

		switch (dayOfWeek) {

		case 1:
			day = "Sunday";
			break;
		case 2:
			day = "Monday";
			break;
		case 3:
			day = "Tuesday";
			break;
		case 4:
			day = "Wednesday";
			break;
		case 5:
			day = "Thursday";
			break;
		case 6:
			day = "Friday";
			break;
		case 7:
			day = "Satuday";
			break;
		default:
			day = "Invalid entry";

		}

		System.out.println(day);
	}

}
