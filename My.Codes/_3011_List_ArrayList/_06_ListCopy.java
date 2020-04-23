package _3011_List_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _06_ListCopy {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {

		Integer[] ary1 = { 1, 2, 3 };

		List arrL1 = Arrays.asList(ary1);  //short
		System.out.println(arrL1);
		
		List arrL2= new ArrayList<>();
		arrL2.addAll(arrL1);  //copy all elements to another list
		System.out.println(arrL2);
		
		

	}

}
