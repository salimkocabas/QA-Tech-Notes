package _083_OverRiding;


public class Dog extends Animals {

	
	 //Overriding method | Parent class behavior is changing here
	public  void eat() {
		System.out.println("		Dogs are meat-eating   {Child}");
	}
	
	
	public  void protect() {
		System.out.println("		Dogs protect people    {Child}");
	}
	
	public  void run() {
		System.out.println("		Dogs can run very fast {Child}");
	}

	
	public static void main(String[] args) {
		
		System.out.println(" 1:Calling CHILD class overriding method");
		//This will call the child class version of eat()
		Dog myDog=new Dog();
		myDog.breathe();
		myDog.eat();
		myDog.protect();
		myDog.run();
		System.out.println();
		
		
		/* When Parent class reference refers to the parent class object
		 * then in this case overridden method (the method of parent class)
		 *  is called.
		 */
		System.out.println("\n 2:Only PARENT Class methods are running");
		Animals myAnimal = new Animals();
		myAnimal.breathe();
		myAnimal.eat();
		myAnimal.run();// there is not display anything because of it's empty method
		//animal2.protect()  not exist on Parent !!!!

		/* When parent class reference refers to the child class object
		 * then the overriding method (method of child class) is called.
		 * This is called dynamic method dispatch or runtime Polymorphism
		 */
		System.out.println("\n 3:Dynamic method dispatch or runtime Polymorphism");
		Animals myDog2 = new Dog();
		myDog2.breathe();
		myDog2.eat();
		myDog2.run();
		
		//animal3.protect();  //not exist on Animal
		//we can say here is common behavior can be usable
		
		
		
		
	}
	
	
}
