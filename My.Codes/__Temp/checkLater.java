package __Temp;

import java.util.HashMap;
import java.util.Map;

/**
 * 
 * What is Object...
 *
 */


public class checkLater {

	public static Map<String, Object> asMap(Object... args) {
	    Map<String, Object> argMap = new HashMap<String, Object>();
	    for (int i = 0; i < args.length; i += 2) {
	      String key;
	      try {
	        key = (String) args[i];
	      } catch (ClassCastException cce) {
	        System.err.println(cce.getMessage());
	        System.err.println("args[" + i + "] " + args[i].toString());
	        throw cce;
	      }
	      if (i + 1 < args.length) {
	        Object value = args[i + 1];
	        argMap.put(key, value);
	      }
	    }
	    return argMap;
	  }
	
	
	
	
	
	
}
