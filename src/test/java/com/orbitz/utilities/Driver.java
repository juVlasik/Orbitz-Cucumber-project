package com.orbitz.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Driver {
	
	private static WebDriver driver;
	
	
	private Driver() {};
	
	
	public static WebDriver getDriver(String browser) {
		
		if(driver == null ) {
			
			if(browser == null) {
				browser=ConfigReader.getProperty("browser");
			}
			
			switch(browser) {
			
			
			case "chrome":

				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
				break;
				
			case "firefox":
				WebDriverManager.firefoxdriver().setup();
				driver = new FirefoxDriver();
				break;
				
				
			case "edge":
				WebDriverManager.edgedriver().setup();
				driver = new EdgeDriver();
				break;
				
			case "opera":
				WebDriverManager.operadriver().setup();
				driver = new OperaDriver();
				break;
			
			case "ie":
				WebDriverManager.iedriver().setup();
				driver = new InternetExplorerDriver();
				break;
			case "headlessChrome":
				ChromeOptions options = new ChromeOptions();
				options.addArguments("--headless");
				options.addArguments("--disable-gpu"); // -> extra setting required for Windows machines
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver(options);
				break;
				
			case "headlessFirefox":
				FirefoxOptions foptions = new FirefoxOptions();
				foptions.addArguments("--headless");
				WebDriverManager.firefoxdriver().setup();
				driver = new FirefoxDriver(foptions);
				break;
			case "phantomJS":	
				WebDriverManager.phantomjs().setup();
				driver 	= new PhantomJSDriver();
				break;
			case "htmlUnit":	
				driver 	= new HtmlUnitDriver(true); //-> true enables JavaScript
				break;

								
			}
			
			
			
			
			
		}
		
		return driver;
		
				
		
	}
	
	public static WebDriver getDriver() {
		return getDriver(null);
	}

	
	public static void quit() {
		if(driver != null) {
			driver.quit();
			driver = null;
		}
		
	}
	
	
	
	
	
	

}
