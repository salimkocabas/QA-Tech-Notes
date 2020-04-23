package com.practice.ud.basic;

import static com.utils.CommonMethods.*;

import org.openqa.selenium.By;

public class _008_following_siblings {

	public static void main(String[] args) {

		String url = "https://www.spicejet.com/";
		String browser = "chrome";
		setUp(browser, url);

		driver.findElement(By.xpath("//select[@id='ctl00_mainContent_ddl_originStation1']/child::option[15]")).click();
		waitSec(2);

		driver.findElement(By.xpath("//select[@id='ctl00_mainContent_ddl_originStation1']/option[@value='MAA']"))
				.click();

		tearDown();

	}

}
