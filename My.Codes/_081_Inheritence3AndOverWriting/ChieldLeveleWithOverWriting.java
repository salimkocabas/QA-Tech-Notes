package _081_Inheritence3AndOverWriting;

/**
 * @author bulent.geckin
 *
 *         FUNCTION OVERWRITING
 * 
 *
 */

public class ChieldLeveleWithOverWriting extends ChildClass {

	// this method is already exist in Parent Class We are Over Riding it
	// try: change Method Name, only Parent Class methods available
	
	public void audioSystems() {
		System.out.println("audioSystems() method inside of Child Level Class | OVER RIDING|");
	}

	public static void main(String[] args) {

		ParentClassDemo pl = new ParentClassDemo();
		pl.audioSystems();

		ChieldLeveleWithOverWriting cl = new ChieldLeveleWithOverWriting();
		cl.audioSystems();

	}

}
