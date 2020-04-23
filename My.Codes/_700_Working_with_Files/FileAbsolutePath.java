package _700_Working_with_Files;

import java.io.File;

public class FileAbsolutePath {

	public static void main(String[] args) {

		
		//if the codes work different platform getAbsolutePath() gives right path
		
		File path=new File("_700_Working_with_Files");
		File file=new File(path,"testFile.txt");
		
		System.out.println(file.getAbsolutePath());		
		
		
				
		
		
		
		
	}

}
