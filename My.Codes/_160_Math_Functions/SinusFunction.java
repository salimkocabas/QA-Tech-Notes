package _160_Math_Functions;

public class SinusFunction {

	public static void main(String[] args) {

		int step = 10;
		float y = 1F / step;

		int z;

		for (double i = 0; i <= 10; i = i + y) {
			;

			z = (int) (i * 10);

			System.out.println(z + " " + Math.sin(i));

		}

	}

}
