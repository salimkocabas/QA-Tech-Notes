package com.practice.android;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class _01_AppTest2x {

	public static void main(String[] arg) throws MalformedURLException {
		
		capabilities();
	}
	
	public static AndroidDriver<AndroidElement> capabilities() throws MalformedURLException {

		AndroidDriver<AndroidElement> driver;

		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Basic");
		capabilities.setCapability(MobileCapabilityType.APP,
				"D:/my.Codes/my.World/src/test/java/com/practice/android/ApiDemos-debug.apk");
		driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		return driver;
	}

}
