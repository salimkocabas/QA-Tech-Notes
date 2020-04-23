package _000_mYLibrary;

public class myMethods {

	public static void newLine() {
		System.out.println();
	}

	public static void newLine(int count) {
		for (int i = 0; i < count; i++)
			System.out.println();
	}

	public static void Hello() {
		System.out.println("Hello World!");
	}

	/**
	 * This method with switch to the frame
	 * 
	 * @param message
	 */
	public static void Hello(String message) {
		System.out.println(message);
	}

	/**
	 * This method with switch to the frame
	 * 
	 * @param str    String
	 * @param millis the length of time to sleep in milliseconds
	 * @param action 1 toUpperca 2 toLoweCase 3 first charecter upper case, others
	 *               lower case
	 * 
	 */

	public static void Print(String str, int speed, int action) throws InterruptedException {

		switch (action) {

		case 1:
			str = str.toUpperCase();
			break;

		case 2:
			str = str.toLowerCase();
			break;

		case 3:
			str = str.substring(0, 1).toUpperCase() + str.substring(1, str.length()).toLowerCase();
			break;

		default:
			// do not nothing except 1,2,3
		}

		for (int i = 0; i < str.length(); i++) {
			Thread.sleep(speed);
			System.out.print(str.charAt(i));
		}
		System.out.println();

	}

	// Einstein quotos

	public static String quotos(int x) {
		String[] str = { "You never fail until you stop trying.", "Once we accept our limits, we go beyond them.",
				"Doing the same thing over and over again and expecting different results.",
				"Imagination is more important than knowledge.",
				"Learn from yesterday, live for today, hope for tomorrow.",
				"Any fool can know. The point is to understand. Albert Einstein",
				"If you can't explain it simply, you don't understand it well enough.",
				"Look deep into nature, and then you will understand everything better.",
				"A question that sometimes drives me hazy — am I or are the others crazy?",
				"I have no special talent. I am only passionately curious.",
				"Weak people revenge. Strong people forgive. Intelligent people ignore."

		};

		String result = str[x];
		//String result = str[x % str.length];
		return result;
	}
	// ******************************************************************

}
