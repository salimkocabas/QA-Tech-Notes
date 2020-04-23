package _061_FinalClass;

//final public class Parent {  | if it is final class its not accessible

public class Parent {

	public String prntStr1 = "text from  Parent";
	public String prntStr2;
	public String prntStr3;

	// if you declare variables as public in here chield class can access it
	// if you dont cant see it

	// constructor
	public Parent() {
		System.out.println("Parent Constructor");

		 prntStr2 = "text from  Parent/Constructor";
		 // String prntStr2 = "text from  Parent/Constructor";  if you do like that Constructor creates new variable and it cannot be accessible  from Child

	}

	// method
	public void getData() {
		System.out.println("Parent getData() method");

		prntStr3 = "text from  Parent/getData() method";
		//String prntStr3 = "text from  Parent/getData() method"; //  if you do like that Constructor creates new variable and it cannot be accessible  from Child
		
		
		

	}

}
