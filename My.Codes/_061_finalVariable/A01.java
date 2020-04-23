package _061_finalVariable;

import java.util.Arrays;

public class A01 {

	public static void main(String[] args) {
		
		
		// option 1
		
		final String str = "xxx"; // str="yyy"; // CAN NOT NOT Change,compiler gives error...

		
		// final keyword with array
		final int DAYS_IN_WEEK = 7;
		final String DAY[] = { "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday" };
		System.out.println(Arrays.toString(DAY));

		
		final String Alphabet[] = { "a", "b", "c", "d", "e", "f", "g" };

		//DAY = Alphabet; // if DAY is Final it can not changable

		
		DAY[0]="PAZARTESI";
		System.out.println(DAYS_IN_WEEK);
		System.out.println(Arrays.toString(DAY));

		

		DAY[0] = "Samething"; // CAN CHANGE
		System.out.println(Arrays.toString(DAY));

		DAY[0] = "XSamething"; // CAN CHANGE
		System.out.println(Arrays.toString(DAY));

	}

}
