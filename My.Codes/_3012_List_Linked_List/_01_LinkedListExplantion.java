package _3012_List_Linked_List;

import java.util.LinkedList;

/**
 * @author bulent.geckin
 * ArrayList	-Implemented with the concept of dynamic array.
 * LinkedList	-Implemented with the concept of doubly linked list.
 * 
 * Comparison between ArrayList and LinkedList:-

    1. Insertions are easy and fast in LinkedList as compared to ArrayList because there is no
    risk of resizing array and copying content to new array if array gets full which makes
    adding into ArrayList of O(n) in worst case, while adding is O(1) operation in LinkedList
    in Java. ArrayList also needs to be update its index if you insert something anywhere except
    at the end of array.
    
    2. Removal also better in LinkedList than ArrayList due to same reasons as insertion.
    
    3. LinkedList has more memory overhead than ArrayList because in ArrayList each index only
    holds actual object (data) but in case of LinkedList each node holds both data and address
    of next and previous node.
    
    4.Both LinkedList and ArrayList require O(n) time to find if an element is present or not. 
    However we can do Binary Search on ArrayList if it is sorted and therefore can search in O(Log n) time.

 * 
 * 
 */

public class _01_LinkedListExplantion {

	public static void main(String[] args) {

		LinkedList<String> animals = new LinkedList<String>();
		
		animals.add("Cat");		System.out.println(animals);
		animals.add("Dog");		System.out.println(animals);
		animals.add("Fish");	System.out.println(animals);
		animals.add(0,"Bird");	System.out.println(animals);
		animals.add("Cat");		System.out.println(animals);
		animals.add("Cat");		System.out.println(animals);
		animals.remove("Cat");	System.out.println(animals);
		animals.remove("Cat");	System.out.println(animals);
		animals.remove(1);	System.out.println(animals);
		
		
		
		

	}

}
