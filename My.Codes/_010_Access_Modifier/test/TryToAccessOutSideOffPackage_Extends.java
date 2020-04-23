package _010_Access_Modifier.test;

import _010_Access_Modifier._01_Access_MofierTest_methodsStatic;

public class TryToAccessOutSideOffPackage_Extends extends _01_Access_MofierTest_methodsStatic  {

	public static void main(String[] args) {


		//mthDefault(); // not accessible out of package methods are in another package
		mthPublic();
		//mthPrivate(); // Cannot accessible directly, only can access inside of where is exist
		mthIndirectAccessToPrivateMethod();
		mthProtected(); // Cannot accessible directly, only can access inside of  class where is exist

	}

}
