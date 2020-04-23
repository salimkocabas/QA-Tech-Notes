package com.practice.ud.basic;

import static com.utils.MyBaseClass.*;
import static com.utils.CommonMethods.*;


import org.openqa.selenium.By;

public class _013_Dynamic_DropDown {

	public static void main(String[] args) {

		String url = "https://www.spicejet.com/";
		String browser = "chrome";
		setUp(browser, url);

		driver.manage().window().maximize();
		waitSec(1);

		//select departure
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();
		driver.findElement(By.xpath("//a[@value='HYD']")).click();

		waitSec(1);
		
		//select destination
		driver.findElement(By.xpath("(//a[@value='TIR'])[2]")).click();  
		// index value is not proper all time, look next lines to see more propar way
		
		
		
		
		
		//re-open the page
		driver.navigate().to("https://www.spicejet.com/");
		
		waitSec(5);
		
		
		// Another way
		
		
		//select departure
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();
		driver.findElement(By.xpath("//a[@value='HBX']")).click();

		waitSec(1);
		
		//select destination
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='PAT']")).click();
		

		tearDown();

	}

}
