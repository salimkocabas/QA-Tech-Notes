package com.practice.ud.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


/*
 * 
 * driver.findElement(By.id(<parameter>))
 * driver.findElement(By.name(<parameter>))
 * driver.findElement(By.linkText(<parameter>))
 * 
 */




public class _002_Login_Facebook_byid_byname_bylinkText {


	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://facebook.com");

		/*
		 * codes from facebook.com
		 * 
		 * there are id or name exist, we can use which one what we want <input
		 * type="email" class="inputtext login_form_input_box" name="email" id="email"
		 * data-testid="royal_email"> <input type="password"
		 * class="inputtext login_form_input_box" name="pass" id="pass"
		 * data-testid="royal_pass">
		 *
		 */

		// By.id
		System.out.println(driver.findElement(By.id("email")).toString());
		driver.findElement(By.id("email")).sendKeys("mail_address@gmail.com");
		; // it's username field (Email or Phone)
		Thread.sleep(1000);

		// By.name
		System.out.println(driver.findElement(By.name("pass")).toString());
		driver.findElement(By.name("pass")).sendKeys("password");
		; // it's password field
		Thread.sleep(1000);

		// linText - there is no id and name, we try linkText because the forget account
		// has link
		driver.findElement(By.linkText("Forgot account?")).toString();
		driver.findElement(By.linkText("Forgot account?")).click();
		Thread.sleep(1000);

		// Thread.sleep(1000);
		// driver.quit();
	}

}
