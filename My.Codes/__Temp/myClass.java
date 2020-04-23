package __Temp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class myClass {

	public static int createRndNum(Integer howBig) {
		Random random = new Random();
		int rndNum = random.nextInt(howBig);
		return rndNum;
	}

	public static void main(String[] args) {

		int arraySize = 20;
		int howBig = 10;
		ArrayList<Integer> myArray = new ArrayList<>();

		for (int i = 0; i < arraySize; i++) {
			myArray.add(createRndNum(howBig));
		}

		System.out.println("My Array         :" + myArray);

//		Collections.sort(myArray);
//		System.out.println("My Array sorted  :" + myArray);
//		System.out.println("My Array min :" + myArray.get(0));
//		System.out.println("My Array max:" + myArray.get(arraySize - 1));

		// manually find min,2nd min,max,2nd max

		int min = myArray.get(0);
		int min2nd = myArray.get(0);
		int max = myArray.get(0);
		int max2nd = myArray.get(0);

		// 4 3 0 3 5 7 9 8 7
		// System.out.println(Integer.min(1, 2));

		for (int i = 1; i < arraySize; i++) {

			if (myArray.get(i) < min) {
				min = myArray.get(i);
			}

			if (myArray.get(i) < min2nd) {

				min2nd=myArray.get(i);
				
			}

		}

		System.out.println(min + " " + min2nd);
		Collections.sort(myArray);
		System.out.println("My Array sorted  :" + myArray);

	}

}