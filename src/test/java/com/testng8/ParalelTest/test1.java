package com.testng8.ParalelTest;

import static com.utils.MyBaseClass.driver;
import static com.utils.MyBaseClass.setUp;

import java.util.List;

import static com.utils.CommonMethods.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.*;

public class test1 {

	@Parameters({ "URL", "browser" })
	@BeforeClass()
	public void gotoWebPage(String url, String browser) {
		System.out.printf("Open   [%s] with [%s] browser %n", url, browser);

		setUp(browser, url);
		waitSec(3);
	}
	
	@AfterClass()
	public void closeBrowser() {
		tearDown();
	}
	
	@Test()	
	public void faceBook() {
		
		List<WebElement> elements = driver.findElements(By.xpath(
				"//input[@data-type='text' and @name='firstname' or  @name='lastname' or @aria-label='Mobile number or email']"));

		System.out.println(elements.size());

		elements.get(0).sendKeys("FirstName");
		elements.get(1).sendKeys("LastName");
		elements.get(2).sendKeys("email@domain.com");

		driver.findElement(By.xpath("//input[@aria-label='Re-enter email']")).sendKeys("email@domain.com");
		driver.findElement(By.xpath("//input[@aria-label='New password']")).sendKeys("xxxxx");
		
	}
		
		
		

}
