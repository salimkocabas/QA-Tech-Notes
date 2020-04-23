package _700_Working_with_Files;

import java.io.FileInputStream;
import java.io.IOException;

public class _502_working_with_files_read_file {

	public static void main(String args[]) throws IOException {
		
		final String fileName = "d:/text.txt";

		FileInputStream inFile = new FileInputStream(fileName);
		
		
        int fileLength =(int)fileName.length();
        
        System.out.println(fileLength);
        
        byte Bytes[]=new byte[fileLength];
             
        System.out.println("File size is: " + inFile.read(Bytes));
             
        String file1 = new String(Bytes);
        System.out.println("File content is:\n" + file1);
     
        //close file
        inFile.close();

		
		
	}
}
