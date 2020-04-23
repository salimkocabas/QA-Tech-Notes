package _010_Access_Modifier;

import _010_Access_Modifier._01_Access_MofierTest_methods;

public class _01_Access_MofierTest_New {

	
	
	public static void main(String[] args) {

		_01_Access_MofierTest_methods mm=new _01_Access_MofierTest_methods();
		
		mm.mthDefault();
		mm.mthPublic();
		//mm.mthPrivate(); //Cannot accessible directly, only can access inside of class where is exist
		mm.mthIndirectAccessToPrivateMethod();
		mm.mthProtected();
	}

	
}
