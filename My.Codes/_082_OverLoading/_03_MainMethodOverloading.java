package _082_OverLoading;

public class _03_MainMethodOverloading {

	public static void main(String[] args) {
		main("Hello");// if comment this lines nothing will get executed
		main(3);
	}

	public static void main(String str) {
		System.out.println(str);
	}

	public static void main(int x) {
		System.out.println(x);
	}

}
