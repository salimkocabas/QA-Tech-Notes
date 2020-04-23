package _060_Method;

import _000_mYLibrary.myMethods;

public class CallHelloWorld {

	public static void main(String[] args) throws InterruptedException {

		myMethods x = new myMethods(); // my special class

		String text = "MerHaba";

		x.Hello(); // it calls "Hello World" message from message class

		x.newLine(); // newline from my Method

		x.Print(text, 100, 0); // print orginal string
		x.Print(text, 100, 1); // parameter 1 mean All UPPERCASE
		x.Print(text, 100, 2); // parameter 2 mean All lowercase
		x.Print(text, 100, 3); // parameter 2 mean first char big others small Lowercase

	}

}
