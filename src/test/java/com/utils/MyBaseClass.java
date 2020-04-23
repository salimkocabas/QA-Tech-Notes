package com.utils;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class MyBaseClass {

	public static WebDriver driver=null;;

	public static void setUp(String browser, String url) {

		ConfigsReader.readProperties(MyConstants.CREDENTIALS_FILEPATH);

		// Browser info comes from ConfigsReader
		//String browser=ConfigsReader.getProperty("browser").toLowerCase();

		// Browser info comes from System Variable, it can be set mvn like <mvn test -Dbrowser=chrome>
		//String browser=System.getProperty("browser").toLowerCase();

		
		switch (browser.toLowerCase()) {

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

		case "edge":
			if (MyConstants.OS_NAME.contains("Windows"))
				MyConstants.EDGE_DRIVER_PATH = MyConstants.EDGE_DRIVER_PATH + ".exe";

			System.setProperty("webdriver.edge.driver", MyConstants.EDGE_DRIVER_PATH);
			driver = new EdgeDriver();
			break;

		case "ie":
			if (MyConstants.OS_NAME.contains("Windows"))
				MyConstants.IE_DRIVER_PATH = MyConstants.IE_DRIVER_PATH + ".exe";

			System.setProperty("webdriver.ie.driver", MyConstants.IE_DRIVER_PATH);
			driver = new InternetExplorerDriver();
			break;

		default:
			System.err.println("Browser is not supported");
		}

		driver.manage().timeouts().pageLoadTimeout(MyConstants.PAGE_LOAD_TIME, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(MyConstants.IMPLICIT_LOAD_TIME, TimeUnit.SECONDS);
		//driver.manage().window().maximize();
		//driver.manage().deleteAllCookies();

		System.out.println("[Browser ] : " + browser);
		System.out.println("[URL     ] : " + url);
		System.out.println();
		driver.get(url);

		// driver.get(ConfigsReader.getProperty("url")); if we use one project we can
		// get url from config file
	}

	public static void tearDown() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		if (driver != null) {
			driver.quit();
		}
	}
}
