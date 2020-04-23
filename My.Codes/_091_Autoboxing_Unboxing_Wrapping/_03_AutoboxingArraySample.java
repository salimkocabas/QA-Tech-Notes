package _091_Autoboxing_Unboxing_Wrapping;

import java.util.ArrayList;

public class _03_AutoboxingArraySample {

	public static void main(String[] args) {
		

		ArrayList<Integer> arrayList = new ArrayList<Integer>();

		// Autoboxing because ArrayList stores only objects int to Integer autoboxing
		arrayList.add(5);
		arrayList.add(15);

		// printing the values from object
		System.out.println(arrayList);
		
	}
	
	
}
