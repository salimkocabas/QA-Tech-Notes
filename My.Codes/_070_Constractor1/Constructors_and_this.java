package _070_Constractor1;

public class Constructors_and_this {

	Constructors_and_this() {
		this(99);  // goto  other Constructor which has 1 parameter than back to next  line
		System.out.println("1: Construtor -no parameter"); //print thirdly this line. print "1"
	}

	
	Constructors_and_this(int x) {
		this(100, 200); // goto other Constructor which has2 parameters than back to next line
		System.out.println("2: Construtor with 1 parameter");  //print secondly "2" than back to line 7
	}

	Constructors_and_this(int x, int y) {
		System.out.println("3: Construtor with 2 parameter");  //do it, then back to who sent you here
	}

	public static void main(String args[]) {

		Constructors_and_this obj = new Constructors_and_this();

		System.out.println("\nAre you confused??!!");

	}

}
