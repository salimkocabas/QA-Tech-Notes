package _001_Basic;

import java.text.*;

public class _009_DecimalFormat {

	static void myFormat(String pattern, double value) {
		DecimalFormat myFormatter = new DecimalFormat(pattern);
		String output = myFormatter.format(value);
		System.out.println(value + "  " + pattern + "  " + output);
	}

	static public void main(String[] args) {

		double x = 123456.789;
		myFormat("\t###,###.###", x);
		myFormat("\t#######.##", x);
		myFormat("\t00000000.000", x);
		myFormat("\t$ ###,###.###", x);
	}
}
