package _004_Sysout_to_File;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteToFile {

	public static void main(String[] args) throws IOException {

		final String newFile = "d:/links.txt";

		File myFile = new File(newFile);
		myFile.createNewFile();
		FileOutputStream fileOut = new FileOutputStream(myFile);

		String text = "Hello ";
		fileOut.write(text.getBytes());

		text = "Hello World!!!!";
		fileOut.write(text.getBytes());

		fileOut.flush();
		fileOut.close();

		System.out.println("File successfulyy saved.");

		String command = "notepad " + myFile;
		Runtime.getRuntime().exec(command);

	}
}
