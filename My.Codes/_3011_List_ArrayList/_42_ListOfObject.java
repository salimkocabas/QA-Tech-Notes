package _3011_List_ArrayList;

import java.util.ArrayList;

public class _42_ListOfObject {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {

		ArrayList list = new ArrayList(); // simple usage
		// ArrayList<Object> list = new ArrayList<Object>();

		list.add(10);
		list.add("Hello");
		list.add('A');
		list.add(10.3F);
		list.add(999D);
		list.add(99999L);
		System.out.println(list);

		for (Object x : list)
			System.out.printf("%-10s  Type: %s   %n",x,x.getClass());

		list.remove("Hello");  //remove "Hello"
		list.remove(999.0);  // it delete 999D it was  999.0
		//list.remove(10);  // java confuse, it's not going to delete value=10, java try to find 10th indexed element
		System.out.println(list);

		
	}

}
