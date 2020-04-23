package com.utils;

import static com.utils.CommonMethods.takeAlertScreenshot;
import static com.utils.MyBaseClass.driver;
import static com.utils.MyBaseClass.setUp;

import java.awt.AWTException;
import java.awt.HeadlessException;
import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;



public class ManageAlertsScreenCaptureWithRobotClass {
	
 
	public static void main(String[] args) throws HeadlessException, AWTException, IOException, InterruptedException {
		
		setUp("chrome","https://skpatro.github.io/demo/alerts/");
		
		
		driver.findElement(By.name("commit")).click();
		
		Alert alert = driver.switchTo().alert();
		Thread.sleep(2000);
		
		takeAlertScreenshot("alert");
		
		
		// manual way to take screenshot
//		BufferedImage image = new Robot().createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));
//	    ImageIO.write(image, "jpg", new File("d:/alert.jpg"));
//	    
	    alert.accept();
		//driver.quit();
	}
}