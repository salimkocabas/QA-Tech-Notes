package _150_HashCode;

public class j01_HashCodeString {

	public static void main(String[] args) {

		String str1 = "LISTEN";
		String str2 = "LISTEN";
		
		String str3 = "listen";
		String str4 = str1.toLowerCase();

		System.out.println(str1.toLowerCase().hashCode());
		System.out.println(str2.toLowerCase().hashCode());
		System.out.println(str3.toLowerCase().hashCode());
		System.out.println(str4.toLowerCase().hashCode());

	}

}
