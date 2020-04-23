package _4000_Maps;

import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

import org.apache.commons.lang3.ArrayUtils;

public class ArrayToMap {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {

		String[][] countriesAndCapitals = { 
				{ "Washington DC", "USA" }, 
				{ "Paris", "France" }, 
				{ "London", "UK" } 
				};

		System.out.println(Arrays.deepToString(countriesAndCapitals));

		System.out.println("\nwith org.apache.commons.lang3.ArrayUtils");
		Map mapCC = ArrayUtils.toMap(countriesAndCapitals);
		System.out.println(mapCC);

		System.out.println("\nwith For Loop");
		Map<String, String> mapX = new TreeMap<>();  //sorted Map

		for (int i = 0; i < countriesAndCapitals.length; i++) 
			mapX.put(countriesAndCapitals[i][0], countriesAndCapitals[i][1]);

		
		System.out.println(mapX);

	}

}
