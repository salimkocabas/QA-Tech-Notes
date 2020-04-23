package _020_Arrays;

import java.util.Arrays;

public class _043_Array_Copy {

	public static void main(String[] args) {

		int[] my_array_10 = { 4144, 85, 23, 11, -833 };
		int[] my_array_11 = new int[my_array_10.length]; // ayni boyutta bos bir array create edildi
		int[] my_array_12 = new int[my_array_10.length]; // ayni boyutta bos bir array create edildi
		int[] my_array_13 = new int[my_array_10.length]; // ayni boyutta bos bir array create edildi

		// my_array_11=my_array_10; bu sekilde kopyalayinca sort edince ikisi de sort
		// oluyor, clone iliskisi devam ediyor

		my_array_12 = my_array_10; // array den kopya yapildi ama hafıza değerleri bu şekilde yapılırsa aynı kalır

		System.arraycopy(my_array_10, 0, my_array_11, 0, my_array_10.length); // bu sekilde bagimsiz clone cikartiyor
        
		my_array_13  = my_array_10.clone();   //bağımsız clone another way
        

		System.out.println(Arrays.toString(my_array_10));
		System.out.println(Arrays.toString(my_array_11));

		System.out.println(" ");

		Arrays.sort(my_array_10);
		System.out.println(Arrays.toString(my_array_10) + " : master array is sorted");
		System.out.println(Arrays.toString(my_array_12) + " : = ile kopyalanan otomatik sort oldu");
		System.out.println(Arrays.toString(my_array_11) + " : clone sort olmadi  System.arraycopy komutu ile create edilmisti");
		System.out.println(Arrays.toString(my_array_13) + " : clone sort olmadi  .clone() komutu ile create edilmisti�ştı");

	}
}