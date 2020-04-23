package _004_Sysout_to_File;

/*
 * @author 	bulent.geckin
 * @date 	2019 Dec
 */

import java.io.*;
import java.util.Date;

public class w2File {

	public static void main(String[] args) throws IOException {
		File myFile = new File("myfile.txt");  	// you can put full path 
												// if you don't put path, the file will be created in this project folder.
												// you can navigate file in file explorer and you can see in Eclipse after refresh (F5)
												// file path:
												// windows  : new File("d:/directory/myfile.txt") ya da
												// windows  : new File("d:\\directory\\myfile.txt")
												// mac		: new File("/users/{username}/myfile.txt") .txt mac'de gerekli mi bilmiyorum?
		
		PrintWriter w2File = new PrintWriter(new FileWriter(myFile));

		
		w2File.println("-------------------------");
		w2File.println("Hello World");
		w2File.println("-------------------------");
		
		w2File.printf("File name  : %s%n", myFile);  
		w2File.printf("Created at : %s%n", new Date());
		w2File.println("-------------------------");
	

		w2File.printf("%,25.3f %n", 12345678.4567);
		w2File.printf("%,25.3f %n", 456.798789798);
		w2File.printf("%,25.3f %n", 9999321.72);
		w2File.println("-------------------------");
		w2File.close();

//		If you want to open file after code finished the code calls notepad (for windows)
	String command = "notepad " + myFile;
	Runtime.getRuntime().exec(command);

	}
}
