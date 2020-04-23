package _016_While_Do_Loop;

public class _004 {

	
	public static void main(String[] args) {
	    int i = 0;
	    while (i < 10) {
	      if (i == 4) {
	        i++;
	        System.out.println("FOUR");
	        continue;
	      }
	      System.out.println(i);
	      i++;
	    }  
	  }

}
