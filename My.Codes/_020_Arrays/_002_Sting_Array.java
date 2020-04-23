package _020_Arrays;

import java.util.Arrays;

public class _002_Sting_Array {

	public static void main(String[] args) {
		String[] cars = { "Volvo", "BMW", "Ford", "Mazda", "Toyota" };

		
		
		System.out.println(cars[0]);
		System.out.println(cars[1]);
		System.out.println(cars[2]);

		System.out.println();
		System.out.println("print one bye one /w for loop");
		for (String x : cars) 
			System.out.print(x +" ");

		System.out.println();
		System.out.println();
		System.out.println("print one bye one /w for loop");

		for (int i=0;i<cars.length;i++)
			System.out.println(cars[i]);
		
		
		System.out.println();
		System.out.println("--------------");
		System.out.println("Arrays.toString");
		System.out.println(Arrays.toString(cars));
		
	}
}
