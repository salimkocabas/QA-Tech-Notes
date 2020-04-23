package com.practice.ud.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _006_rediff1_Sign_In {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "chromedriver");
		driver.get("http://rediff.com");

		
		// htlm: 
		//<p id="signin_info" xpath="1"> 
		//<a href="https://mail.rediff.com/cgi-bin/login.cgi" title="Already a user? Sign in" class="signin" xpath="1">Sign in</a>
		

		
		// ******************* CSS *****************
		// title="Already a user? Sign in"   title*='a user'
		WebElement signInButtonCSS = driver.findElement(By.cssSelector("a[title*='a user']"));  
		System.out.println(signInButtonCSS);
		System.out.println(signInButtonCSS.getAttribute("title").toString());
		
		
		// ******************* Link Text *****************
		WebElement signInButtonLinkText=driver.findElement(By.linkText("Sign in"));
		System.out.println(signInButtonLinkText);
		System.out.println(signInButtonLinkText.getAttribute("title").toString());
		
		
		// ******************* partial link text *****************
		WebElement signInButtonPartialLinkText=driver.findElement(By.partialLinkText("Sign"));
		System.out.println(signInButtonPartialLinkText);
		System.out.println(signInButtonPartialLinkText.getAttribute("title").toString());
		
		// ******************* xPath-1 *****************
		WebElement signInButtonXPath=driver.findElement(By.xpath("//a[@class='signin']"));
		System.out.println(signInButtonXPath);
		System.out.println(signInButtonXPath.getAttribute("title"));
		
		// ******************* xPath-2 *****************
		//<p id="signin_info" xpath="1"> 
		WebElement signInButtonXPath2=driver.findElement(By.xpath("//*[@id='signin_info']/a[1]"));
		System.out.println(signInButtonXPath2);
		System.out.println(signInButtonXPath2.getAttribute("title"));
		
		
		//signInButtonXPath.click();
		
	}

}
