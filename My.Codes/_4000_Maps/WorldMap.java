package _4000_Maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class WorldMap {

	public static void main(String[] args) {

		Map<String, String> europeMap = new HashMap<>();
		europeMap.put("France", "Paris");
		europeMap.put("Italy", "Rome");
		europeMap.put("Germany", "Berlin");
		System.out.println(europeMap);

		Map<String, String> asianMap = new HashMap<>();
		asianMap.put("China", "Pekin");
		asianMap.put("India", "New Delhi");
		asianMap.put("Nepal", "Kathmandu");
		System.out.println(asianMap);

		Map<String, String> africaMap = new HashMap<>();
		africaMap.put("Somali", "Pretoria");
		africaMap.put("Nigeria", "Niger");
		africaMap.put("South Africa", "Mogadishu");
		System.out.println(africaMap);

		System.out.println("\n Add all Map into new List");
		List<Map<String, String>> worldList = new ArrayList<Map<String, String>>(); // its empty list
		worldList.add(europeMap); 		System.out.println(worldList);// one list in the list
		worldList.add(asianMap);		System.out.println(worldList);// two list in the list
		worldList.add(africaMap);		System.out.println(worldList);// three list in the list

		System.out.println("\nIterara worldList");
		for (Map<String, String> continent : worldList) {
			System.out.println(continent);
		}

		System.out.println("\nAdd all Map into new Map");
		Map<String, Map<String, String>> worldMap = new HashMap<String, Map<String, String>>();
		worldMap.put("africa", africaMap); 		worldMap.put("europe", europeMap); 		worldMap.put("asia", asianMap);
		System.out.println(worldMap);

		System.out.println("\nentrySet()");
		Set<Entry<String, Map<String, String>>> worldSet = worldMap.entrySet();
		for (Entry<String, Map<String, String>> x : worldSet) {
			//System.out.println(x);
			System.out.printf(x.getKey()+ " :");
			Map<String,String>continentMap= x.getValue();
			System.out.println(continentMap);
		}

	}

}
