package _3011_List_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _05_ArrayToList {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {

		Integer[] ary1 = { 1, 2, 3 };
		Integer[] ary2 = { 10, 20, 30 };


		List<Integer> arrL1 = new ArrayList<>(Arrays.asList(ary1));  //formal
		List arrL2 = Arrays.asList(ary2);  //short
		
		
		System.out.println(arrL1);
		System.out.println(arrL2);

	}

}
