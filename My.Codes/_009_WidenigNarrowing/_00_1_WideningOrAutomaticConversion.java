package _009_WidenigNarrowing;




public class _00_1_WideningOrAutomaticConversion {

	
	public static void main(String[] args) {
	
		
		/**
		 * Widening or Automatic Conversions
		 * Byte --> short --> int --> long --> float --> double
		 */
		
		byte byte_a=10;  // byte range -128 to 127
		short short_a= byte_a;  // it's OK, we are widening
		int int_a = short_a;  
		long long_a=int_a;
		float float_a=long_a;
		double  double_a=float_a;
		
		
		
		System.out.println(byte_a);
		System.out.println(short_a);
		System.out.println(int_a);
		System.out.println(long_a);
		System.out.println(float_a);
		System.out.println(double_a);
		
		double result=byte_a+short_a+int_a+long_a+float_a+double_a;
		System.out.println(result);
		
		
		
	}
	
}
