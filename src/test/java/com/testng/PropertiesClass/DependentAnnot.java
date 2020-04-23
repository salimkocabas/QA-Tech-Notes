package com.testng.PropertiesClass;

import org.testng.annotations.Test;

public class DependentAnnot extends TestBase{

	
	
	@Test
	public void OpeningBrowser() {
		
		login();
	}
	
	
	
}
