package com.practice.ud.basic;

import static com.utils.CommonMethods.waitSec;
import static com.utils.MyBaseClass.driver;
import static com.utils.MyBaseClass.setUp;
import static com.utils.MyBaseClass.tearDown;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class _016_Calender {

	@Test
	public void test() {

		String url = "https://www.spicejet.com/";
		String browser = "chrome";
		setUp(browser, url);

		driver.manage().window().maximize();
		waitSec(1);


		
		// select departure
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();
		driver.findElement(By.xpath("//a[@value='HYD']")).click();

		waitSec(1);

		// select arrivial
		driver.findElement(By.xpath("(//a[@value='TIR'])[2]")).click();

		//select today
		WebElement toDay=driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active"));
		System.out.println("Day selected   :"+toDay.getText());
		
		String dateOfToday=new SimpleDateFormat("dd").format(new Date());
		
		Assert.assertEquals(toDay.getText(), dateOfToday);
		
		toDay.click();
				
		WebElement shownDate=driver.findElement(By.cssSelector("#view_fulldate_id_1"));
		System.out.println("Actual Date	   : "+shownDate.getText());
		
		
		System.out.println();
		
		
		tearDown();

	}

}
