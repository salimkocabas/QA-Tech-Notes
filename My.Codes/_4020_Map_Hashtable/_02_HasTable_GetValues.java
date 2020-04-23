package _4020_Map_Hashtable;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class _02_HasTable_GetValues {

	public static void main(String[] args) {

		
		Hashtable<String, String> myhashtable = new Hashtable<>();
		myhashtable.put("USA", "1");
		myhashtable.put("UK", "44");
		myhashtable.put("France", "33");
		
		
		
		System.out.println(myhashtable);
		
		Iterator<Entry<String, String>> it = myhashtable.entrySet().iterator();

		while (it.hasNext()) {
			
			Map.Entry<String,String> me=it.next();
			System.out.printf("%-10s : %s%n",me.getKey(),me.getValue());
			
		}
	}

}
