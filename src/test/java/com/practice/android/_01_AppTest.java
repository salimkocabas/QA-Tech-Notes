package com.practice.android;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class _01_AppTest {

	public static void main(String[] args) throws MalformedURLException {

		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Basic");
		cap.setCapability(MobileCapabilityType.APP,
				"D:/my.Codes/my.World/src/test/java/com/practice/android/ApiDemos-debug.apk");

		String appiumURL = "http://127.0.0.1:4723/wd/hub";
		AndroidDriver<AndroidElement> driver = new AndroidDriver<>(new URL(appiumURL), cap);
		
		

	}

}



