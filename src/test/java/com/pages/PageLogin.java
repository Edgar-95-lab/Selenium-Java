package com.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class PageLogin {
	private WebDriver driver;
	
	@FindBy(linkText = "Log In")
	private WebElement loginLink;
	
	@FindBy(name = "email_address")
	private WebElement emailField;
	
	@FindBy(name = "password")
	private WebElement passwordField;
	
	@FindBy(css = "input.cssButton.submit_button.button.button_login")
	private WebElement loginButton;
	
	@FindBy(css = "h2.greeting")
	private WebElement uservalidateText;
	
	public PageLogin(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void login(String email, String password) {
		loginLink.click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		emailField.sendKeys(email);
		passwordField.sendKeys(password);
		loginButton.click();
		
		WebDriverWait wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("h2.greeting")));
		String userName = email.substring(1, email.indexOf("@"));
		System.out.println("Hi T" + userName);
		Assert.assertTrue(uservalidateText.getText().contains("Hello T" + userName));
	}
}
