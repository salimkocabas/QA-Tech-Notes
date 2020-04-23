package _063_ThisKeyword2;

public class MainThisConstructor {

	MainThisConstructor() {
		this(99);
		System.out.println("1");
	}

	MainThisConstructor(int x) {
		this(100, 200);
		System.out.println("2");
	}

	MainThisConstructor(int x, int y) {
		System.out.println("3");
	}

	@SuppressWarnings("unused")
	public static void main(String args[]) {

		MainThisConstructor obj = new MainThisConstructor();
	}

}
