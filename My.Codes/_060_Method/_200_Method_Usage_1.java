package _060_Method;

import java.util.*;

public class _200_Method_Usage_1 {

	static float area(int x) {
		return (float) (Math.PI * x * x);
	}

	static float perimeter(int x) {
		return (float) (2 * Math.PI * x);
	}

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter value ");
		System.out.print("\nr         : ");
		int r = sc.nextInt();

		System.out.println("area 	  :" + area(r));
		System.out.println("perimeter : " + perimeter(r));

	}
}
