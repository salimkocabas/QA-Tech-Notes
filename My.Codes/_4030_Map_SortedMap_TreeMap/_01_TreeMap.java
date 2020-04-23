package _4030_Map_SortedMap_TreeMap;

import java.util.TreeMap;


/**
 *  Key Keys Sorted in the Collections
 *  
 */




public class _01_TreeMap {

	public static void main(String[] args) {
		TreeMap<String, Integer> phonePrefix = new TreeMap<>();   //SortedMap<String, Integer> phonePrefix = new TreeMap<>();
		phonePrefix.put("USA", 1);
		phonePrefix.put("UK", 44);
		phonePrefix.put("Zambia", 260);
		phonePrefix.put("France", 33);
		phonePrefix.put("Italy", 39);
		phonePrefix.put("Canada", 1);
		phonePrefix.put("Mexico", 52);
		phonePrefix.put("Australia", 61);
		phonePrefix.put("Belgium", 32);
		
		System.out.println("Object in array :"+phonePrefix.size());
		System.out.println(phonePrefix);
		
	}
}
