package _4030_Map_SortedMap_TreeMap;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class _02_TreeMap {

	public static void main(String[] args) {
		TreeMap<String, Integer> phonePrefix = new TreeMap<>();
		phonePrefix.put("USA", 1);
		phonePrefix.put("UK", 44);
		phonePrefix.put("France", 33);
		phonePrefix.put("Italy", 39);
		phonePrefix.put("Canada", 1);
		phonePrefix.put("Mexico", 52);
		phonePrefix.put("Mexico", 52);  //ONLY one KEY Java will discards it

		System.out.println("Object in array :" + phonePrefix.size());
		System.out.println(phonePrefix);

		// Set<Entry<String, Integer>> set = phonePrefix.entrySet(); //
		// Iterator<Entry<String, Integer>> it = set.iterator();

		Iterator<Entry<String, Integer>> it = phonePrefix.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry<String, Integer> me = it.next();
			System.out.printf("+%-5s  : %s%n", me.getValue(), me.getKey());
		}

		System.out.print("\nOnly Keys   : ");
		Iterator<String> itX = phonePrefix.keySet().iterator();
		while (itX.hasNext()) {
			System.out.print(itX.next() + " ");
		}

		System.out.print("\nOnly Values : ");
		Iterator<Integer> itY = phonePrefix.values().iterator();
		while (itY.hasNext()) {
			System.out.print(itY.next() + " ");
		}

	}
}
