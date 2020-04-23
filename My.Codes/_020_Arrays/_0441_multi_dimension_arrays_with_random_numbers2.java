
package _020_Arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class _0441_multi_dimension_arrays_with_random_numbers2 {

	public static int createRandomNo() {
		Random random = new Random();
		int randomNo = random.nextInt(99);
		return randomNo;
	}

	public static void main(String[] args) throws InterruptedException {

		int arraySize = 10;

		ArrayList<Integer> myArray = new ArrayList<>();

		for (int i = 0; i < arraySize; i++) {
			myArray.add(createRandomNo());
		}
		
		System.out.printf("[MyArray         ] %s%n",myArray);
		Collections.sort(myArray);
		System.out.printf("[MyArray  sorted ] %s%n",myArray);
		
		System.out.printf("[MyArray  min    ] [%s]%n",myArray.get(0));
		System.out.printf("[MyArray  max    ] [%s]%n",myArray.get(arraySize-1));
		

	}
}
