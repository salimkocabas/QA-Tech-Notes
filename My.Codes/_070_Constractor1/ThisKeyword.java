package _070_Constractor1;

class ThisKeyword {

	int a, b; // instance variable

	public ThisKeyword(int a, int b) {

		this.a = a * a; // this is keyword
		this.b = b * b;

	}

	public void print(int a, int b) {

		System.out.printf("a      = %s%nb      = %s%n", a, b);
		System.out.printf("this.a = %s%nthis.b = %s%n", this.a, this.b);
	}

	public static void main(String[] args) {

		int x = 2, y = 3;
		ThisKeyword obj = new ThisKeyword(x, y);
		obj.print(x, y);

	}
}
