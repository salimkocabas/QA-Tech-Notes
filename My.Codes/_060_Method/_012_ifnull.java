package _060_Method;

public class _012_ifnull {

	static int length(String s) {
		if (s == null) {
			return -1;
		}
		return s.length();
	}
	
	
	public static void main (String[] args) {
		
		System.out.println(length("Hello"));
				
		
	}

}
