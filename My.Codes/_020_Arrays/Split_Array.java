package _020_Arrays;

import java.util.Arrays;

public class Split_Array {

	public static void main(String[] args) {

		int[] master = {1,2,1 };
		int len = master.length;

		System.out.println("Size of array :" + len);

		String[] str = new String[10];
		String[] strR = new String[10];

		str[0] = Arrays.toString(master);

		System.out.println("Master String         : " + str[0]);

		int[] masterR = new int[len];

		for (int i = 0; i < len; i++)
			masterR[len - 1 - i] = master[i];

		strR[0] = Arrays.toString(masterR);

		System.out.println("Reversed String       : " + strR[0]);

		if (str[0].equals(strR[0]))
			System.out.println("\nmirror");
		else
			System.out.println("not mirror");

	}

}