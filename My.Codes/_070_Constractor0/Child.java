package _070_Constractor0;

public class Child extends ConstructorDemo{

	

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		System.out.println("Default Constructor");
		Child co1= new Child();
		//Child co5= new Child("Name");  // problem happening when i try to call other Constructors instead of default
		
		

		ConstructorDemo cd1=new ConstructorDemo();
		ConstructorDemo cd2=new ConstructorDemo("Angela");
		ConstructorDemo cd3=new ConstructorDemo(Math.PI);
		
	
		
		

	}

}
