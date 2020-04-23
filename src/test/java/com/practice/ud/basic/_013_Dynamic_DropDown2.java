package com.practice.ud.basic;

import static com.utils.MyBaseClass.*;
import static com.utils.CommonMethods.*;


import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class _013_Dynamic_DropDown2 {

	@Test
	public void test() {
		

		String url = "https://www.spicejet.com/";
		String browser = "chrome";
		setUp(browser, url);

		driver.manage().window().maximize();
		waitSec(1);

		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();
		driver.findElement(By.xpath("//a[@value='HYD']")).click();

		waitSec(1);
		driver.findElement(By.xpath("(//a[@value='TIR'])[2]")).click();

		tearDown();

	}

}
