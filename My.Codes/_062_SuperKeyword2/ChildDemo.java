package _062_SuperKeyword2;

public class ChildDemo extends ParentDemo {

	String name = "Name variable from Child";

	// Constructor
	public ChildDemo() {
		System.out.println("----------------------------------------------------");
		System.out.println("    Child Class Constuctor (implicitly called)");
		System.out.println("-------------------------------------------------------");
		System.out.println();
	}

	//Method
	public void getStringData() {
		System.out.println("1 "+name);      // Get name variable this class
		System.out.println("2 "+this.name); // same Get name variable this class
		System.out.println("3 "+super.name); // Get name variable from Parent Class | super.<variable> = Parent Class variable |

		System.out.println();
		System.out.println("4 "+super.month); // variable comes from Super Class = Parent Class
		System.out.println("5 "+month); // here is no month variable in this class, 
									// | Java atomically gets data from  Parent Class |
		
		System.out.println("6 "+this.month); // here is no month variable in this class, | Java atomically gets data from
										// Parent Class |
		System.out.println("----------------");
	}


	public static void main(String[] args) {

		ChildDemo cd = new ChildDemo();
		cd.getStringData();
		
		
	}

}
