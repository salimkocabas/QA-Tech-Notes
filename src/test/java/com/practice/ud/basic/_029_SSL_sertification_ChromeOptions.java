package com.practice.ud.basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class _029_SSL_sertification_ChromeOptions {

	public static void main(String[] args) {


		//SSL certification
		
		
		//Desired capabilities
		//general Chrome profile
		DesiredCapabilities ch=DesiredCapabilities.chrome();
		//some samples
		ch.acceptInsecureCerts();
		ch.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);  //now Chrome work insecure certificate
		ch.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);  //now Chrome accept SSL certs
		
		//Below to your local browser
		ChromeOptions c=new ChromeOptions();
		c.merge(ch);
	
		
		
		
		System.setProperty("webdriver.chrome.driver", "D:/my.Codes/my.World/Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();


		driver.get("http://www.google.com");
		
		driver.quit();

	}
		
		
		
		

}
