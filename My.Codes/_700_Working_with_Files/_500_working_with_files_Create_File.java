package _700_Working_with_Files;

import java.io.File;
import java.io.FileOutputStream;

public class _500_working_with_files_Create_File {

	public static void main(String args[]) {
		final String fileName = "d:/my_file.txt";

		try {
			File objFile = new File(fileName);
			if (objFile.createNewFile()) {
				System.out.println("File created successfully.");
			} else {
				System.out.println("File creation failed!!!");
			}

			// writting data into file

			String text = "Hello World!!!\n";

			// object of FileOutputStream

			FileOutputStream fileOut = new FileOutputStream(objFile);

			// convert text into Byte and write into file
			for (int i = 0; i <= 10; ++i) {

				fileOut.write(text.getBytes());
			}

			fileOut.flush();
			fileOut.close();
			System.out.println("File saved.");
		}

		catch (Exception Ex) {
			System.out.println("Exception : " + Ex.toString());
		}

	}
}
