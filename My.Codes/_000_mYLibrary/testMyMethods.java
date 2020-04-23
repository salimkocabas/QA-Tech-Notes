package _000_mYLibrary;

public class testMyMethods extends myMethods {

	public static void main(String[] args) throws InterruptedException {

		Hello(); // Classic java "Hello World!" message

		newLine(); // new empty line
		Hello("Mr.Bee"); // print text message to console

		newLine(2); // 2 empty line

		Print("if you can dream it, you can do it.", 25, 1);
		Print("THE WAY GET STARTED IS TO QUIT TALKING AND BEGIN DOING....", 50, 3); // print message, wait xxx milisec, action type 3, look at
																// the method details


		newLine();
		System.out.println(quotos(1));
		
				
		newLine();
		Print(quotos(2),25,1);
		Print(quotos(2),25,2);
		Print(quotos(2),25,3);
		
		
		
		
	}
}
