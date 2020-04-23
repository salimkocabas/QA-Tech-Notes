package _020_Arrays;

public class _045_Print_A_to_Z_slowly {

	public static void main(String[] args) throws InterruptedException {

		for (char ch = 'a'; ch <= 'z'; ++ch) {
			System.out.print(ch);
			Thread.sleep(50); // wait 50 milisecond (1 sn = 1000 ms)

		}

		System.out.println("");
		for (char ch = 'A'; ch <= 'Z'; ++ch) {
			Thread.sleep(50);
			System.out.print(ch);
		}

	}

}
