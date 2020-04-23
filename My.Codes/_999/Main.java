package _999;

public class Main {

	public static void main(String[] args) {
		Printer printer = new Printer();
		printer.print();
	}
}






class Message {
	
	void print() {
		System.out.println("Hello World!!!!");
	}
}

class Printer {
	// the "delegator"
	Message obj = new Message();

	// create the delegate
	void print() {
		obj.print(); // delegation
		obj.print(); // delegation
	}
}
