package _001_Basic;

public class _006_True_False_example_ {

	public static void main(String[] args) {

		boolean a = true;
		boolean b = !a;

		System.out.println(" a is 	 :" + a);
		System.out.println("!a is	 :" + !a);

		System.out.println("======================");

		System.out.println(" b=!a is :" + b);
		System.out.println("!b is	 :" + !b);

		System.out.println("======================");

		if (!a) { // a= false !a=true this line works
			System.out.println("!a " + !a);
		}

		if (a) {
			System.out.println("a " + a);
		}

	}

}
