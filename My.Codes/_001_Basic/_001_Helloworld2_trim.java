package _001_Basic;

public class _001_Helloworld2_trim {

	public static void main(String[] args) {

		String my_text = "  Hello World!!!   ";

		System.out.println(my_text+my_text.length());
		my_text = my_text.trim();
		
		// deleted space beginning end ending of text...
		System.out.println(my_text+my_text.length());
		
		
		

	}
}
