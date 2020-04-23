package _004_Sysout_to_File;

import java.io.*;

public class WriteToFile2 {

	public static void main(String[] args) throws IOException {


		File myFile = new File("d:/links.txt");
		PrintWriter printToFile = new PrintWriter(new FileWriter(myFile));

		String myName = "Mr.Bee";
		String from = "Istanbul";

		printToFile.println("Hello World!!!!");
		printToFile.printf("Hello, I'm %s from %s", myName, from);
		printToFile.close();

		// Open files with notepad (works Windows)
		String command = "notepad " + myFile;
		Runtime.getRuntime().exec(command);

	}
}
