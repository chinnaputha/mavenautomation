package com.naukri.pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.naukri.objectmap.NaukriLocators;
import com.naukri.utils.BrowserWaits;

/**
 * Login page to maintain login page webelments and its methods
 * 
 * @author Chinna.Putha
 *
 */
public class NaukriLogin_POM {

	WebDriver driver;
	
	
	public NaukriLogin_POM(WebDriver driver) {
		this.driver = driver;
	}


	public void loginNaukri(String username,String password) {
		driver.findElement(By.xpath(NaukriLocators.NAUKRI_LOGIN_USERNAME_XPATH)).sendKeys(username);
		driver.findElement(By.cssSelector(NaukriLocators.NAUKRI_LOGIN_PASSWORD_CSS)).sendKeys(password);
		driver.findElement(By.xpath(NaukriLocators.NAUKRI_LOGIN_BUTTON_XPATH)).click();
		
		WebElement updateProfile = driver.findElement(By.cssSelector(NaukriLocators.NAUKRI_HOME_UPDATE_PROFILE_CSS));
		
		// Explicit wait
		BrowserWaits.waitForElementToClick(driver, updateProfile);
		Assert.assertEquals(driver.getTitle(), "Home | Mynaukri", "Page title mismatching");
		System.out.println("Login successfull");
	}

}
