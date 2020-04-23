package _081_Inheritence2AndOverloading;

public class ChildClass extends ParentClassDemo {

	public void engine() {
		System.out.println("new engine() method inside of Child Class");
	}

	public void color() {
		System.out.println(color); // color variable comes from parent Class
	}

	public static void main(String[] args) {

		ChildClass cd=new ChildClass();
		cd.color();
		cd.audioSystems();
		
		
		
		
	}

}
