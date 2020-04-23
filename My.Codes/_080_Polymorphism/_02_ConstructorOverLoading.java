package _080_Polymorphism;

class _02_ConstructorOverLoading {
	

	_02_ConstructorOverLoading() {
		System.out.println("non-argument constructor");
	}

	_02_ConstructorOverLoading(String str1) {
		System.out.println("with String parameter, parameter is:"+str1);
	}

	_02_ConstructorOverLoading(int int1) {
		System.out.println("with int parameter parameter is:"+int1);
	}


	public static void main(String[] args) {

		_02_ConstructorOverLoading obj= new _02_ConstructorOverLoading();
		_02_ConstructorOverLoading obj1= new _02_ConstructorOverLoading("any text");
		_02_ConstructorOverLoading obj3= new _02_ConstructorOverLoading(4);


	}
	

}
