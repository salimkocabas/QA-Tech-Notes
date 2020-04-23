package _085_InterFace3;

public class AustarlianTraffice implements CentralTraffice, ContinentalTraffic {

	public static void main(String[] args) {

		CentralTraffice obj = new AustarlianTraffice();
		obj.redStop();
		obj.greenGo();
		obj.flashYellow();
		System.out.println(CentralTraffice.year);

		AustarlianTraffice objLocal = new AustarlianTraffice();
		objLocal.walking();

	}

	// local method for specific this class
	public void walking() {
		System.out.println("walking local method");
	}

	// implemented methods from Interface
	@Override
	public void greenGo() {
		System.out.println("greenGo() implementation");

	}
	@Override
	public void redStop() {
		System.out.println("redStop()p implementation");
	}
	@Override
	public void flashYellow() {
		System.out.println("flashYellow() implementation");

	}

	@Override
	public void TraingSymbol() {
		System.out.println("TraingSymbol() implementation from other Class");

	}

}
