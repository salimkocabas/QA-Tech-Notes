package com.practice.ud.basic;

import static com.utils.MyBaseClass.*;
import static com.utils.CommonMethods.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _011_FaceBook_Gender_Radio_Button {

	public static void main(String[] args) {

		String url = "https://www.facebook.com";
		String browser = "chrome";
		setUp(browser, url);

		WebElement female = driver.findElement(By.xpath("//label[text()='Female']"));
		WebElement male = driver.findElement(By.xpath("//label[text()='Male']"));
		WebElement custom = driver.findElement(By.xpath("//label[text()='Custom']"));

		female.click();		waitSec(1);
		male.click();		waitSec(1);
		custom.click();		waitSec(1);

		
		
		
		
		tearDown();

	}

}
