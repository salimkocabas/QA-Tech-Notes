package _251_TryCatch;

public class _005 {

	
	public static void main(String[] args){
	    try {
	        test();
	    } catch (UnsupportedOperationException e) {
	        System.out.println(e);
	       // e.printStackTrace();
	    }
	}
	
	

	private static void test() {
	    throw new UnsupportedOperationException("Method is not yet implemented");
	}
	
	
	
}
