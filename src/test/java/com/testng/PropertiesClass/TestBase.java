package com.testng.PropertiesClass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import com.utils.MyConstants;

public class TestBase {

	public WebDriver driver = null;

	public void login() {

		Properties prop = new Properties();
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(
					"D:\\my.Codes\\my.World\\src\\test\\java\\com\\testng\\PropertiesClass\\dataDriven.properties");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		try {
			prop.load(fis);
		} catch (IOException e) {
			e.printStackTrace();
		}

		String browser = prop.getProperty("browser");
		String url = prop.getProperty("url");

		switch (browser) {

		case "chrome":
			if (MyConstants.OS_NAME.contains("Windows"))
				MyConstants.CHROME_DRIVER_PATH = MyConstants.CHROME_DRIVER_PATH + ".exe";
			System.setProperty("webdriver.chrome.driver", MyConstants.CHROME_DRIVER_PATH);

			ChromeOptions options = new ChromeOptions();
			System.setProperty("webdriver.chrome.args", "--disable-logging");
			System.setProperty("webdriver.chrome.silentOutput", "true");

			driver = new ChromeDriver(options);
			break;

		case "firefox":
			if (MyConstants.OS_NAME.contains("Windows"))
				MyConstants.GECKO_DRIVER_PATH = MyConstants.GECKO_DRIVER_PATH + ".exe";

			System.setProperty("webdriver.gecko.driver", MyConstants.GECKO_DRIVER_PATH);

			DesiredCapabilities capabilities = DesiredCapabilities.firefox();
			capabilities.setCapability("marionette", true);

			System.setProperty(FirefoxDriver.SystemProperty.DRIVER_USE_MARIONETTE, "true");
			System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE,
					MyConstants.USER_PATH + "/logs/fireFoxLog.txt");

			driver = new FirefoxDriver();
			break;

		}
		
		driver.get(url);
	}

}
