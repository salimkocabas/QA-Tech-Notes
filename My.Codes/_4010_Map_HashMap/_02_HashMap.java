package _4010_Map_HashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class _02_HashMap {

	public static void main(String[] args) {
		HashMap<String, Integer> phonePrefix = new HashMap<>();
		phonePrefix.put("USA", 1);
		phonePrefix.put("UK", 44);
		phonePrefix.put("Italy", 39);
		phonePrefix.put("Mexico", 52);
		phonePrefix.put("Belgium", 32);
		System.out.println("Object in array :" + phonePrefix.size());
		System.out.println(phonePrefix);
		
		Iterator<Entry<String,Integer>> it = phonePrefix.entrySet().iterator();
		
		while (it.hasNext()) {
			Map.Entry<String,Integer> mm=it.next();
			System.out.printf("%-15s : %s%n", mm.getKey(),mm.getValue());
		}
		
	}
}
