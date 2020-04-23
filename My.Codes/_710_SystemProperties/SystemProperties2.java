package _710_SystemProperties;

import java.io.FileInputStream;
import java.util.Properties;

public class SystemProperties2 {
	public static void main(String[] args) throws Exception {

		
		System.getProperties().list(System.out);
		
		
		
		// set up new properties object
		// from file "myProperties.txt"
		
		/*
		
		FileInputStream propFile = new FileInputStream("D:\\my.Codes\\Java\\Mr.Bee\\My.Codes\\_Xtras\\myProperties.txt");
		Properties p = new Properties(System.getProperties());
		p.load(propFile);

		// set the system properties
		System.setProperties(p);
		// display new properties
		System.getProperties().list(System.out);
		
		
		
		*/

	}
}