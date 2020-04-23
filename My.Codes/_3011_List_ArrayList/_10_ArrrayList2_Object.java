package _3011_List_ArrayList;

import java.util.ArrayList;

public class _10_ArrrayList2_Object {

	public static void main(String[] args) {

		ArrayList<Object> myList = new ArrayList<>();
		myList.add("Hello");
		myList.add(10);
		myList.add(false);
		myList.add('B');

		System.out.printf("There is %s element in  array %n", myList.size());
		System.out.println();

		System.out.println(myList);
		
		for (Object x: myList) 
			System.out.println(x);

	}

}