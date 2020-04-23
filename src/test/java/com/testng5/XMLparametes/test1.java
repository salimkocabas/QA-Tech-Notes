package com.testng5.XMLparametes;

import org.testng.annotations.*;

/* Learn:   @Parameters  | Check the XML |   name="tag"  value="value"
 * 			only for that method
*			
*/

public class test1 {

	@Parameters({ "URL", "browser" }) // be careful this test class can only work XML, it doesn't work stand alone.
										// Because URL parameters come from XML
	@Test(priority = 1)
	public void gotoWebPage(String URL, String browser) {
		System.out.printf("Open   [%s] with [%s] browser %n", URL, browser);
	}

}
