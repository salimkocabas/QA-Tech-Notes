package _3011_List_ArrayList;

import java.util.Arrays;
import java.util.List;

public class _40_Arrays_To_List {

	public static void main(String[] args) {

		String[] cars= {"Toyota","Honda","Mercedes"};
		
		
		System.out.println("Size of array       :"+cars.length);
		System.out.println("Elements of array   :"+Arrays.toString(cars));
		
		
		
		List<String> carList=Arrays.asList(cars);
		System.out.println("Element of List     :"+carList);
		
			
		
		
	}

}
