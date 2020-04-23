package _091_Autoboxing_Unboxing_Wrapping;

import java.util.ArrayList;
import java.util.List;

public class _10_AutoBoxing {

	/**
	 * https://docs.oracle.com/javase/tutorial/java/data/autoboxing.html
	 */

	public static void main(String[] args) {

		// Autoboxing example
		Character ch = 'a';

		// we don't need to write like this Java automatically Autoboxing the value
		// Character x=new Character('x');

		// Autoboxing example
		List<Integer> li = new ArrayList<>();
		for (int i = 1; i < 50; i += 2)
			li.add(i); // java adds int values to Integer Array, there is no problem compiler do  Autoboxing process

		System.out.println(li);
		/**
		 * we don't need to write like that
		 * 
		 * List<Integer> li = new ArrayList<>(); 
		 * for (int i = 1; i < 50; i += 2)
		 * li.add(Integer.valueOf(i));
		 * 
		 */

	}

}
