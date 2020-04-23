package _3001_Iterator;
import java.util.*;



/*initialize	: Iterator<String> iterator = variableNames.iterator();
 * xxx.hasNext() boolean, if there is element in array list			
 * xxx.next() next object
 * xxx.remove() remove tha current object
 */
public class IteratorExp {

	public static void main(String[] args) {

		ArrayList<String> numbers = new ArrayList<>();
		numbers.add("one");
		numbers.add("two");
		numbers.add("three");
		numbers.add("four");

		// 0
		System.out.println(numbers);

		Iterator<String> it = numbers.iterator();
		
		for (int i=0;i<numbers.size();i++)
		System.out.println(i+" "+it.next());
		
		
		while (it.hasNext()) {
			if (it.next().endsWith("e"))
				it.remove();
		}
		System.out.println(numbers);
		
		
	}
	
}
