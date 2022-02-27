package com.naukri.pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.naukri.utils.BrowserWaits;

/**
 * Login page to maintain login page webelments and its methods
 * 
 * @author Chinna.Putha
 *
 */
public class NaukriLogin {

	@FindBy(xpath = "//input[@id='usernameField']")
	private WebElement username;

	@FindBy(css = "input#passwordField")
	private WebElement password;

	@FindBy(xpath = "//button[normalize-space()='Login']")
	private WebElement login;

	@FindBy(css = "div[class='updateProfile']")
	private WebElement updateProfile;
	
	public void loginNaukri(String user, String pwd,WebDriver driver) {
		username.sendKeys(user);
		password.sendKeys(pwd);
		login.click();


		// Explicit wait
		BrowserWaits.waitForElementToClick(driver, updateProfile);

		Assert.assertEquals(driver.getTitle(), "Home | Mynaukri", "Page title mismatching");
		System.out.println("Login successfull");
	}

}
