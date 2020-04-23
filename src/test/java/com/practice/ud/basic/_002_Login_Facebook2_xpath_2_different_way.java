package com.practice.ud.basic;

import static com.utils.MyBaseClass.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 * 
 * driver.findElement(By.xpath(<parameter>))
 * 
 * 
 */

public class _002_Login_Facebook2_xpath_2_different_way {

	static WebDriver driver = new ChromeDriver();

	public static void main(String[] args) throws InterruptedException {

		String url = "http://facebook.com";
		String browser = "chrome";
		setUp(browser, url);


		// xPath click "Forget account?" link
		WebElement forget_link = driver.findElement(By.xpath("//*[@id='login_form']/table/tbody/tr[3]/td[2]/div/a"));

		System.out.println(forget_link.toString());
		forget_link.click();

		driver.navigate().back();

		Thread.sleep(1000);

		// other way same result

		// xPath click "Forget account?" link
		WebElement forget_link2 = driver.findElement(By.xpath("//a[contains(text(),'Forgot account?')]"));
		System.out.println(forget_link2.toString());
		forget_link2.click();

	}

}
