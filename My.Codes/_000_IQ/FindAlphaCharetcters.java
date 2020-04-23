package _000_IQ;

public class FindAlphaCharetcters {

	public static void main(String[] args) {

		
		//keep alpha character and space
		String given = "Al00be##@rt Ei^%^$%nst8858e&%^&%in";
		String replaced = given.replaceAll("[^A-Za-z\" \"]", "");
		System.out.println(replaced);

		
	}

}
