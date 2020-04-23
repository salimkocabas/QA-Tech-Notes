package _060_Method;

import _000_mYLibrary.myMethods;

public class _010_Call_Method_Print_Slowly {

	public static void main(String[] args) throws InterruptedException {

		myMethods x = new myMethods(); // my special class

		
		String text = "Hello World!!!";

		int printSpeed = 100;

		x.Print(text, printSpeed, 0); // print orginal string
		x.Print(text, printSpeed, 1); // parameter 1 mean All UPPERCASE
		x.Print(text, printSpeed, 2); // parameter 2 mean All lowercase
		x.Print(text, printSpeed, 3); // parameter 2 mean first char big others small Lowercase
	
	
	
	
	
	}

}
