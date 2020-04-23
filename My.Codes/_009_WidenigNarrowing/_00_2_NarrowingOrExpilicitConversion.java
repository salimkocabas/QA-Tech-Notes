package _009_WidenigNarrowing;

public class _00_2_NarrowingOrExpilicitConversion {

	public static void main(String[] args) {

		/**
		 * Narrowing or Explicit Conversions double --> float --> long --> int --> short  --> byte
		 */

		double double_a = 10;
		float float_a = (float) double_a;
		long long_a = (long) float_a;
		int int_a = (int) long_a;
		short short_a = (short) int_a;
		byte byte_a = (byte) short_a;

		System.out.println(byte_a);
		System.out.println(short_a);
		System.out.println(int_a);
		System.out.println(long_a);
		System.out.println(float_a);
		System.out.println(double_a);

		byte result = (byte) (byte_a + short_a + int_a + long_a + float_a + double_a);
		System.out.println(result);

	}

}
