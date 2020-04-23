package _3011_List_ArrayList;

import java.util.ArrayList;

public class _20_ArrrayList3_2D {

	public static void main(String[] args) {

		ArrayList<ArrayList<Object>> myList = new ArrayList<ArrayList<Object>>();

		myList.add(new ArrayList<Object>());

		myList.get(0).add("Toyota");
		myList.get(0).add("Honda");
		myList.get(0).add("Merceds");

		myList.add(new ArrayList<Object>());
		myList.get(1).add("Blue");
		myList.get(1).add("Green");
		myList.get(1).add("Yellow");
		myList.get(1).add("Black");

		myList.add(new ArrayList<Object>());
		myList.get(2).add(2018);
		myList.get(2).add(2019);
		myList.get(2).add(2020);

		System.out.printf("There is/are %s element(s) in  array %n", myList.size());
		System.out.println();

		System.out.println(myList);

		System.out.println();
		System.out.println("for...loop");
		for (ArrayList<Object> x : myList)
			System.out.println(x);

	}

}