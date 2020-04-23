package _4010_Map_HashMap;

import java.util.HashMap;

/**
 * @author bulent.geckin
 * 
 * Map<K,V>
 * KEY, VALUE
 * 
 *
 */

public class _01_HashMapExplanation {

	public static void main(String[] args) {
		HashMap<String, String> capitalCities = new HashMap<>();
		capitalCities.put("USA", "Washington DC");
		capitalCities.put("England", "London");
		capitalCities.put("France", "Paris");
		capitalCities.put("Italy", "Rome");
		capitalCities.put("UK", "Londan");
		
		
		System.out.println("Object in array :"+capitalCities.size());
		System.out.println(capitalCities);
		
		System.out.println();
		System.out.println(capitalCities.get("USA"));
		
		System.out.println(capitalCities);
		
	}
}
