package _004_Sysout_to_File;

import java.io.*;
import java.util.*;

/*
 * @author 	bulent.geckin
 * @date 	2019 Dec
 */

public class w2Console {

	public static void main(String args[]) throws IOException {

		String myFile = "output.txt"; // if there is a file exist with same name will be overritten
		PrintStream file = new PrintStream(new FileOutputStream(myFile));

		System.out.println("Hello NJ Study team :)");
		PrintStream console = System.out; // output destination olarak console seciliyor, yani ekrana yazilacak

		System.setOut(file); // output olarak file seciliyor bundan sonra aksi belirtilene kadar dosyaya
								// yazilacak
		System.out.println("0001: This text will be written to the file");

		System.setOut(console);
		System.out.println("0002 : this text appear on console");
		System.err.println("0002 : this text appear on console with RED");

		System.setOut(file);
		System.out.println("0003: This text will be written to the file");
		String name = "Angel";
		for (int i = 1; i <= 5; System.out.printf("[%s] : Hello %s, how are you today?%n", i++, name))
			;

		System.out.println(new Date()); // dosyaya tarih yazdiriliyor

		// open the file (for windows only)
		String command = "notepad " + myFile;
		Runtime.getRuntime().exec(command);

	}
}
