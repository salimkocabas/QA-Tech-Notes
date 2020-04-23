package __Temp;

public class QuestionMarkOperator {

	public static void main(String[] args) {

		int i = -10;  //
		System.out.println((i < 0) ? -i : i);

		int a = 5;
		int b = 5;
		System.out.println((a == b) ? true : false);

		boolean result = true;
		System.out.println(result ? "true" : "false");

		
		int age=18;
		boolean  accessAllowed = age >= 18 ? true : false;
		System.out.println("you are allowed to drive :"+accessAllowed);
		
		
		
	}

}
