package _010_Access_Modifier.test;

import _010_Access_Modifier._01_Access_MofierTest_methods;

public class TryToAccessOutSideOffPackage_NewObject {

	public static void main(String[] args) {

		_01_Access_MofierTest_methods mm = new _01_Access_MofierTest_methods();

		// mm.mthDefault(); not accessible out of package methods are in another package
		mm.mthPublic();
		// mm.mthPrivate(); // Cannot accessible directly, only can access inside of where is exist
		mm.mthIndirectAccessToPrivateMethod();
		// mm.mthProtected(); // Cannot accessible directly, only can access inside of  class where is exist

	}

}
