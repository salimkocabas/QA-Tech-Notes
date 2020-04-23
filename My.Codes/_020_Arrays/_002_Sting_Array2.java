package _020_Arrays;

import java.util.Arrays;

public class _002_Sting_Array2 {

	public static void main(String[] args) {

		// there is 2 way to say arrays....
		
		
		String[] cars1 = new String[] { "Nissan", "Dodge", "KIA", "Subaru", "Honda" };
		String[] cars2 = { "Volvo", "BMW", "Ford", "Mazda", "Toyota" };

		System.out.println("Entered :"+Arrays.toString(cars1));
		Arrays.sort(cars1); 
		System.out.println("Sorted  :"+Arrays.toString(cars1)); //sorted and printed "cars1"
		System.out.println("\n"+Arrays.toString(cars2));


		

	}
}
