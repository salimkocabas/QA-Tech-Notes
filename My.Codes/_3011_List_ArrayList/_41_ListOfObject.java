package _3011_List_ArrayList;

import java.util.*;

class _41_ListOfObject {
	public static List<Object> person() {
		String name = "Bulent";
		String lastName = "Geckin";
		String eMail = "bulentgeckin@gmail.com";
		byte age = 50;
		short weight = 150;
		char gender = 'M';

		return Arrays.asList(name, lastName, eMail, age, weight,gender);
		
	}

	public static void main(String[] args) {
		List<Object> person = person();

		System.out.println("Object in Array : " + person.size());
		System.out.println("1 : "+person);
		System.out.println("2 : "+person.toString()); // same output

		System.out.print("3 : "); 
		
		for (Object i : person)
			System.out.printf(" "+ i);
	}
}