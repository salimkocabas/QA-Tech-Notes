package _080_Polymorphism;
public class _01_Addition {

	static class Addition {

		public void add(int int1, int int2) {
			System.out.println(int1 + int2);
		}

		public void add(int int1, int int2, int int3) {
			System.out.println(int1 + int2 + int3);
		}

		public void add(int int1, double dob1) {
			System.out.println(int1 + dob1);
		}

		public void add(String str1, String str2) {
			System.out.println(str1 + str2);
		}

		public static void main(String[] args) {

			Addition obj = new Addition();
			obj.add(2, 3);
			obj.add(2, 3, 4);
			obj.add(2, 3.1);
			obj.add("Hello", "World...!");

		}

	}

}
