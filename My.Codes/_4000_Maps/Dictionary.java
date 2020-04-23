package _4000_Maps;

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

public class Dictionary {

	public static void main(String[] args) {

		Map<String, String> tr2eng = new HashMap<>();

		tr2eng.put("merhaba", "hello");
		tr2eng.put("hoscakal", "good-by");
		tr2eng.put("su", "water");

		System.out.println(tr2eng.get("merhaba"));

		System.out.println();
		System.out.println("Keys of Map:");

		// all keys are String
		System.out.println();
		Set<String> keys = tr2eng.keySet();
		System.out.println("Print values with Iterator");
		Iterator<String> it = keys.iterator();
		while (it.hasNext()) {
			String key = it.next();
			String value = tr2eng.get(key);
			System.out.println(key + "= " + value);
		}

		System.out.println();
		System.out.println("Print values with Alternative Iterator");
		Iterator<Entry<String, String>> it2 = tr2eng.entrySet().iterator();
		while (it2.hasNext()) {
			Map.Entry<String, String> mm = it2.next();
			System.out.println(mm.getKey() + "=" + mm.getValue());

		}

	}

}
