package _160_Math_Functions;

import java.text.DecimalFormat;

import org.apache.poi.ss.util.NumberToTextConverter;

public class NumbersToString {

	public static void main(String[] args) {

		System.out.println(NumberToTextConverter.toText(-10));
		System.out.println(NumberToTextConverter.toText(0));
		System.out.println(NumberToTextConverter.toText(10));
		System.out.println(NumberToTextConverter.toText(0.25565));
		System.out.println(NumberToTextConverter.toText(5.1213F));
		System.out.println(NumberToTextConverter.toText(113213.132D));
		System.out.println(NumberToTextConverter.toText(113248979879879713L));

		System.out.println();
		System.out.println(String.valueOf(99.99F));

		System.out.println();
		System.out.println(Integer.toString(123));
		System.out.println(Double.toString(123.456));

		System.out.println();
		
		System.out.println(new Integer(10).toString());
		System.out.println();

	}

}
