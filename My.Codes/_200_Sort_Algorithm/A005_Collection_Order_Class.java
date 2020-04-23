package _200_Sort_Algorithm;

import java.util.ArrayList;
import java.util.Collections;

public class A005_Collection_Order_Class {

	public static void main (String[] args) {
		
		
		ArrayList<String> myList = new ArrayList<>();
		myList.add("Toyota");
		myList.add("Honda");
		myList.add("BMW");
		myList.add("Mercedes");
		myList.add("Audi");

		System.out.printf("There is %s element in  array %n", myList.size());
		System.out.println();

		System.out.println("Original  :"+myList);
		
		//sort
		Collections.sort(myList);
		System.out.println("Sorted  < :"+myList);
		
		//reverse order sort
		Collections.reverse(myList);
		System.out.println("Sorted  > :"+myList);
		
		
	}
	
	
	
}
