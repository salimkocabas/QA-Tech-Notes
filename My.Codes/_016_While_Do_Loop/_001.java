package _016_While_Do_Loop;

public class _001 {

	public static void main(String[] args) {

		int i;

		// ****************** WHILE ***********************
		// 1. Evaluate/check the Condition 2. If True= |Do it| If Else=|Pass the next lines|

		i = 0;
		System.out.println("while");

		while (i < 10) {
			i++;
			System.out.print(i);
		}

		// ****************** DO WHILE ***********************
		// 1. Run the codes between in {} block 2. Evaluate/check the Condition 2. If True= |goto
		// begging if Block{}| If Else=|Pass the next lines|
		i = 0;
		System.out.println("\n\n" + "do while");
		do {
			i++;
			System.out.print(i);

		} while (i < 10);

		System.out.println("\n***************************");
		Boolean condition = false;
		while (condition) {
			System.out.println("While block");
		}

		do {
			System.out.println("Do block");
		} while (condition);

		System.out.println("\n***************************");
		condition = true;
		while (condition) {  
			System.out.println("While block");
			condition=false; //never stop if we don't write it down this line
		}

		condition = true;
		do {
			System.out.println("Do block"); 
			condition=false; //never stop if we don't write it down this line
			
		} while (condition);  //never stop

	}
}
