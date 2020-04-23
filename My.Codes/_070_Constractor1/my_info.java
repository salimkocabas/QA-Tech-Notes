package _070_Constractor1;

import java.util.Calendar;

public class my_info {
	String myName = "Nemo";
	int bornYear = 2000;

	public static void main(String[] args) {

		int myAge;
		int thisYear = Calendar.getInstance().get(Calendar.YEAR);

		my_info myObj = new my_info();
		System.out.println("Name 	:"+myObj.myName);
		System.out.println("Age 	:"+myObj.bornYear);

		myAge = thisYear - myObj.bornYear;
		System.out.println("\rMy Age is " + myAge);

	}
}
