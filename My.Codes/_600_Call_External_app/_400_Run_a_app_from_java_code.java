package _600_Call_External_app;

import java.io.IOException;

public class _400_Run_a_app_from_java_code {

	public static void main(String[] args) throws IOException {
		Runtime app = Runtime.getRuntime();
		app.exec("calc");

		// OR
		Runtime.getRuntime().exec("notepad");
		System.out.println(app.totalMemory());
		System.out.println(app.freeMemory());
		
	}

}
