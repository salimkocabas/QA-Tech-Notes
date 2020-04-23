package _016_While_Do_Loop;

public class _002 {

	public static void main(String[] args) {

		System.out.println("Start counting...");

		int startAt = 1;
		int stopAt = 10;
		boolean stop = false;
		
		do {
			System.out.println(startAt);
			startAt++;
			if (startAt > stopAt)
				stop = true;

		} while (!stop);

	}

}
