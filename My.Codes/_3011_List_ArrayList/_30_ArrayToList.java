package _3011_List_ArrayList;

import java.util.Arrays;

public class _30_ArrayToList {

	public static void main(String[] args) {
		String name = "Bulent";
		short age = 50;
		int weight = 150;
		char gender = 'M';

		// Can hold different types inheriting from Object
		Object[] objects = new Object[] { name, gender, age, weight };

		System.out.printf("Objects in array : %s%n", objects.length);
		System.out.println(Arrays.toString(objects));

		System.out.println();
		for (int i = 0; i < objects.length; i++) {
			System.out.println("objects[" + i + "] = " + objects[i]+"   \t " +objects[i].getClass());

		}

	}
}