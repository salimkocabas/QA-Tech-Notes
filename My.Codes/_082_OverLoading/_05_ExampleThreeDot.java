package _082_OverLoading;

public class _05_ExampleThreeDot {

	public static void test(String... str) {
		System.out.print(str.length + " ");
		
		for (String x : str)
			System.out.print(x);
		
		System.out.println();
	}

	public static void main(String[] args) {

		test("a");
		test("a", "b");
		test("a", "b", "c");
		
		String[] str= {"Life is short, ","time is fast..."};test(str);
		

	}

}
