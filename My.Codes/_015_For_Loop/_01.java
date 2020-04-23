package _015_For_Loop;

public class _01 {

	public static void main(String[] args) {

		
		//different usages -1 / without bracket
		System.out.println("***** 1 ******");
		for (int i = 0; i < 3; i++)   // if it's only one line we dont need {}
			System.out.println(i);

		//different usages -2 / i++ is outside
		System.out.println("***** 2 ******");

		for (int i = 0; i < 3;) 
			System.out.println(i++);

		
		//different usages -3 / sysout is inside
		System.out.println("***** 3 ******");

				for (int i = 0; i < 3;System.out.println(i++)) ;
		
		
		
	}

}
