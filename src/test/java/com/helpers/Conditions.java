package com.helpers;

import java.awt.print.PrinterIOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Conditions {
	protected WebDriver driver;
	
	@BeforeMethod
	public void beforeMethod() {
		
		String DriverByBrowser = "drivers/chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", DriverByBrowser);
		//ChromeOptions chromeOptions = new ChromeOptions();
		//chromeOptions.addArguments("--allowed-192.168.0.50");
		//driver = new ChromeDriver(chromeOptions);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.testingyes.com/demo/");
		
	}

	@AfterMethod
	public void afterMethod(ITestResult iTestResult) {
		System.out.println("Test " + iTestResult.getMethod().getDescription() + ", by status " + iTestResult.getStatus());
		if(!iTestResult.isSuccess()) {
			ScreenShooter.takeScreenshot("Error", driver);
		}
		driver.close();
		driver.quit();
	}
}
