package _002_String_Class;

public class _006_contains_startWith_indexOf {

	public static void main(String[] args) {

		String myText = "Hello beatiful";
		System.out.println(myText);

		myText = myText.concat(" World!!!"); //add to another string to myText
		
		System.out.println(myText);
		
		System.out.println(myText.contains("W")); //true
		System.out.println(myText.contains("D")); //false  there is 'd', not 'D'
		
		System.out.println(myText.startsWith("Hello")); //true
		System.out.println(myText.startsWith("beatiful",6)); //true
		
		System.out.println(myText.indexOf("Hello")); //0
		System.out.println(myText.indexOf("World")); //15
		System.out.println(myText.indexOf('e')); //1  'e' is second cha
		System.out.println(myText.indexOf('e',5)); //7
		

	}

}
