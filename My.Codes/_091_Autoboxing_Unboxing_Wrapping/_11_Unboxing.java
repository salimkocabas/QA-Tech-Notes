package _091_Autoboxing_Unboxing_Wrapping;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * https://docs.oracle.com/javase/tutorial/java/data/autoboxing.html
 * 
 * @author bulent.geckin
 *
 */

public class _11_Unboxing {

	public static void main(String[] args) {
		Integer i = new Integer(-8);

		// 1. Unboxing through method invocation
		int absVal = absoluteValue(i);
		System.out.println("absolute value of " + i + " = " + absVal);

		List<Double> ld = new ArrayList<>();
		ld.add(3.1416); // pi is autoboxed through method invocation.

		// 2. Unboxing through assignment
		double pi = ld.get(0);
		System.out.println("pi = " + pi);
	}

	public static int absoluteValue(int i) {
		return (i < 0) ? -i : i;
	}
}