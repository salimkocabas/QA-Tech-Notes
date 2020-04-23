package com.practice.silentWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

/**
 * @author bulent.geckin
 * 
 *         Basit olarak Chrome ve FireFox browserlarinin nasil ekranda
 *         gorunmeden (headless veya silent olarak adlandiriliyor)
 *         calistirilacagini anlatan kucuk bir kod
 * 
 *         Faydasi olmasi umidiyle
 * 
 * 
 *
 */

public class SilentChrome {

	static WebDriver driver = null;;

	// lokalinizdeki driverlarin yerlerini dogru yazdiginizdan emin olunuz,
	// Malumunuz Mac kullanicilari icin .exe uzantisi gerekli degil, Windows
	// bilgisayarlar icin gerekli
	static String path = System.getProperty("user.dir");
	static String chromeDriverPath = path + "/drivers/chromedriver.exe";
	static String geckoDriverPath = path + "/drivers/geckodriver.exe";

	public static void silentChrome() {

		System.setProperty("webdriver.chrome.driver", chromeDriverPath);

		// ekranda bilgi kalabaligini azaltmak icin bu paremetreler konulabilir
		System.setProperty("webdriver.chrome.args", "--disable-logging");
		System.setProperty("webdriver.chrome.silentOutput", "true");

		// silient yapmak icin bu yeterli
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--headless");
		driver = new ChromeDriver(options);

		System.out.println("Chrome is running....");

	}

	public static void silentFirefox() {

		System.setProperty("webdriver.gecko.driver", geckoDriverPath);
		
		// firefox loglarini ekranda kalabalik etmesin diye bir
		// log dosyasina kayit ediyorum
		System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, path + "/logs/fireFoxLog.txt");

		FirefoxBinary firefoxBinary = new FirefoxBinary();
		firefoxBinary.addCommandLineOptions("--headless");

		FirefoxOptions firefoxOptions = new FirefoxOptions();
		firefoxOptions.setBinary(firefoxBinary);
		driver = new FirefoxDriver(firefoxOptions);

		System.out.println("Firefox is running....");

	}

	public static void main(String[] args) {

		silentChrome();
		driver.get("https://www.google.com");
		
		System.out.println("Current URL     : "+driver.getCurrentUrl());
		System.out.println("Title           : "+driver.getTitle());
		System.out.println("WebDriver Class : "+driver.getClass());

		silentFirefox();
		driver.get("https://www.mozilla.org");
		System.out.println("Current URL     : "+driver.getCurrentUrl());
		System.out.println("Title           : "+driver.getTitle());
		System.out.println("WebDriver Class : "+driver.getClass());
		driver.quit();

	}

}
