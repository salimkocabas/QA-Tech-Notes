package com.practice.ud.basic;

import static com.utils.CommonMethods.*;
import static com.utils.MyBaseClass.driver;
import static com.utils.MyBaseClass.setUp;
import static com.utils.MyBaseClass.tearDown;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class _018_e22_spiceJet {
	
	
	@Test
	public void SpiceJetE2E(){

		String url = "https://www.spicejet.com/";
		String browser = "chrome";
		setUp(browser, url);

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		waitSec(1);

		// make sure it's one way trip
		WebElement oneWayTripBtn = driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_0"));
		oneWayTripBtn.click();
		Assert.assertTrue(oneWayTripBtn.isSelected());

		// select Senior discount
		WebElement seniorBtn = driver.findElement(By.cssSelector("#ctl00_mainContent_chk_SeniorCitizenDiscount"));

		seniorBtn.click();
		Assert.assertTrue(seniorBtn.isSelected());

		// select departure
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();
		driver.findElement(By.xpath("//a[@value='HYD']")).click();
		String dept = driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']"))
				.getAttribute("selectedvalue");
		Assert.assertEquals(dept, "HYD");

		waitSec(1);

		// select arrivial
		driver.findElement(By.xpath("(//a[@value='TIR'])[2]")).click();
		String arrival = driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_destinationStation1_CTXT']"))
				.getAttribute("selectedvalue");
		Assert.assertEquals(arrival, "TIR");

		waitSec(1);

		// select today
		WebElement toDay = driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active"));
		System.out.println("Day selected   :" + toDay.getText());
		String dateOfToday = new SimpleDateFormat("dd").format(new Date());
		Assert.assertEquals(toDay.getText(), dateOfToday);
		toDay.click();

		// select 4 adult
		driver.findElement(By.cssSelector("#divpaxinfo")).click();
		WebElement adult = driver.findElement(By.cssSelector("#ctl00_mainContent_ddl_Adult"));
		Select selectAdult = new Select(adult);
		selectAdult.selectByIndex(3);

		String nuOfAdult = driver.findElement(By.cssSelector("#divpaxinfo")).getText();
		System.out.println(nuOfAdult);

		Assert.assertEquals(nuOfAdult, "4 Adult"); // if 4 Adult selected test OK

		// click search button
		driver.findElement(By.cssSelector("#ctl00_mainContent_btn_FindFlights")).click();

		takeScreenshot("spicesJet");

		tearDown();

	}

}
