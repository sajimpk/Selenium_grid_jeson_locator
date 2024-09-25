package com.compass.testbase;

import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;
import java.time.Duration;
import java.util.Properties;
import java.util.Random;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
/*import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;*/
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {

	public WebDriver driver;
	protected static final Logger logger = LogManager.getLogger(TestBase.class);
	public static Properties prop;

	public WebDriver initializeDriver() throws IOException {
		prop = new Properties();
		try {
			FileInputStream ip = new FileInputStream("src/main/resources/config/global.properties");
			prop.load(ip);
//			String browserName = prop.getProperty("browser");

			String[] drivers = {
					prop.getProperty("ip1"),
					prop.getProperty("ip2")
			};

//			String[] drivers = {"http://localhost:4444/wd/hub","http://172.25.1.150:4444/wd/hub","http://172.25.1.156:4444/wd/hub","http://172.25.1.89:4444/wd/hub"};

			Random random = new Random();

			int randomIndex = random.nextInt(drivers.length);

			String selectedDriver = drivers[randomIndex];
//////////////////////////////
			String[] browsers = {
					prop.getProperty("browser"),
					prop.getProperty("browser1")
			};

			int randomBrowser = random.nextInt(browsers.length);

			String browserName = browsers[randomBrowser];

///////////////////////////
			// Print the randomly selected driver
			System.out.println("Selected Driver: " + selectedDriver);

			if (browserName.equalsIgnoreCase("chrome")) {
				ChromeOptions options = new ChromeOptions();
				options.addArguments("--remote-allow-origins=*");
				driver = new RemoteWebDriver(new URL(selectedDriver),options);
			}
			else if (browserName.equalsIgnoreCase("firefox")) {
				FirefoxOptions options = new FirefoxOptions();
				driver = new RemoteWebDriver(new URL(selectedDriver), options);
			}

		} catch (IOException e) {
			logger.error("Failed to load prop file", e);
		}
		return driver;
	}


	public void navigateToUrl() {
		String url = prop.getProperty("url");
		if (url != null && !url.isEmpty()) {
			driver.get(url);
			System.out.println(url);
		} else {
			logger.error("URL is not provided in the properties file.");
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
	}
	////////
	public String getUsername(){
		return prop.getProperty("Username");
	}
	public String getPassword(){
		return prop.getProperty("Password");
	}
	///////

	public void CloseDriver() {
		if (driver != null) {
			driver.quit();
		}
	}
}