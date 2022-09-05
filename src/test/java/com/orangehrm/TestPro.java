package com.orangehrm;

import org.testng.annotations.Test;

import com.helpers.Conditions;
import com.helpers.ScreenShooter;
import com.pages.PageLogin;
import com.helpers.Helpers;

import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;

public class TestPro extends Conditions{

	@Test(description = "LOGIN for the testingyes_Page")
	public void testLogin() {
		new PageLogin(driver).login("test1@testingyes.com", "test12345");
		//ScreenShooter.takeScreenshot("Login", driver);
		//Helpers.scrollToElement(By.linkText("Newsletter Unsubscribe"), driver);
		Helpers.scrollToEnd(driver);
		Helpers.sleepSeconds(2);
	}

}
