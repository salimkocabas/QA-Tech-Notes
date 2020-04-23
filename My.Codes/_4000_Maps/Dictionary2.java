package _4000_Maps;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

/**
 * keys are unique, if you put same key then value change insertion order is not
 * maintained for entries HashMap keeps value put order TreeMap keeps
 * alphabetical order
 * 
 *
 */

public class Dictionary2 {

	public static void main(String[] args) {

		Map<String, String> tr2eng = new HashMap<>();

		tr2eng.put("merhaba", "hello");
		tr2eng.put("selam", "hello");
		tr2eng.put("hoscakal", "good-by");
		tr2eng.put("su", "water");

		System.out.println(tr2eng.get("merhaba"));

		System.out.println();
		System.out.println("Keys of Map:");

		// all keys are String
		Set<String> keys = tr2eng.keySet();
		System.out.println(keys);

		System.out.println();
		System.out.println("Print KEY & VALUES with Iterator");
		Iterator<String> it = keys.iterator();
		while (it.hasNext()) {
			String key = it.next();
			String value = tr2eng.get(key);
			System.out.println(key + "= " + value);
		}

		
		System.out.println("\n *********** VALUES *****************");
		// Values
		Collection<String> valueColl = tr2eng.values();
		System.out.println(valueColl);
		
		for (String val:valueColl)
			System.out.println(val);
		
		
		// A Map is a Set of Entries!!!!
		System.out.println("\n *********** entrySet() *****************");
		Set<Entry<String,String>> entries = tr2eng.entrySet();
		System.out.println(" All Entries");
		System.out.println(entries);
		
		System.out.println("\nPrint one by one");
		System.out.println("--------------------");
		for (Entry<String,String> x: entries) {
			//System.out.println(x);
			String key=x.getKey();
			String value=x.getValue();
			System.out.println(key+" "+value);
			
		}
		
	}

}
