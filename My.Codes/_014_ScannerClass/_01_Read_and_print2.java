package _014_ScannerClass;

import java.util.*;

public class _01_Read_and_print2 {

	public static Scanner read_value;

	@SuppressWarnings("unused")
	public static void main(String args[]) {

		
		System.out.println("hello\nwolrd");
		String str;
		read_value = new Scanner(System.in);
		str = read_value.nextLine();

		
		System.out.println(str);
	}

}


