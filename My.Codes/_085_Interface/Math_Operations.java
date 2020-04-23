package _085_Interface;
import java.util.Random;

interface Outputs {
	public void Display(String result);
}

interface Interfaces extends Outputs {
	String add(int x, int y);
	String subtract(int x, int y);
	String multiply(int x, int y);
	String divide(int x, int y);
}

public class Math_Operations implements Interfaces {

	@Override
	public void Display(String result) {
		System.out.println(result);
	}

	@Override
	public String add(int x, int y) {
		String result = x + " + " + y + " = " + (x + y);
		return result;
	}

	@Override
	public String subtract(int x, int y) {
		String result = x + " - " + y + " = " + (x - y);
		return result;
	}

	@Override
	public String multiply(int x, int y) {
		String result = x + " * " + y + " = " + (x * y);
		return result;
	}

	@Override
	public String divide(int x, int y) {
		String result = x + " / " + y + " = " + String.format("%.4f",((double) x / (double) y));
		return result;
	}

	public static void main(String[] args) {

		Random randomNum = new Random();
		int num1, num2;

		do {
			num1 = randomNum.nextInt(10);
			num2 = randomNum.nextInt(10);
		} while (num1 == 0 | num1==0);

		String result;

		System.out.printf("Number 1 : %s%n", num1);
		System.out.printf("Number 2 : %s%n", num2);
		System.out.println();

		Math_Operations fn = new Math_Operations();

		result = fn.add(num1, num2);
		fn.Display(result);

		result = fn.subtract(num1, num2);
		fn.Display(result);

		result = fn.multiply(num1, num2);
		fn.Display(result);

		result = fn.divide(num1, num2);
		fn.Display(result);
	}

}