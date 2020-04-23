package _082_OverLoading;

public class _01_ConstuctorOverloading {
	
	_01_ConstuctorOverloading(){
		System.out.println("default constructor");
		System.out.println("Hello");
	}
	
	
	
	_01_ConstuctorOverloading(String str){
		System.out.println("parametirized constructor");
		System.out.println("Hello " +str);
	}

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		_01_ConstuctorOverloading co1=new _01_ConstuctorOverloading();
		
		System.out.println();
		_01_ConstuctorOverloading co2=new _01_ConstuctorOverloading("Angel");
		
		
		
		
	}
}

