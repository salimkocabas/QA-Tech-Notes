package _002_String_Class;



public class _011_compareTo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		String str1 = "nemo";
		String str2 = "NEMO";
		String str3 = "nemofish";
		String str4 = "nemo";

		System.out.println(str1.compareTo(str2));//Positive value
		System.out.println(str1.compareTo(str3));//Negative value
		System.out.println(str1.compareTo(str4));//0
		
		
		
		
		}
		}