package _004_Sysout;

import java.text.DecimalFormat;

public class DecimalFormatUsage {

	public static void main(String[] args) {

		
		double a=123456789.13456789;
		double b=897.54;
		
		DecimalFormat df = new DecimalFormat("#,###.##");
		System.out.println(df.format(a));
		System.out.println(df.format(b));
		
		
		

	}

}
