package _001_Basic;

public class _003_Math_modules {
	public static void main(String args[]) {

		int a = 3;
		int b = 4;
		int c = b/a; 
		double d = (double)b/(double)a;

		System.out.println(+a + " modulus " + b + " is: " + (a % b));
		System.out.println(c);  // output 1
		System.out.println(d);  // output 1.333333333

	}

}
