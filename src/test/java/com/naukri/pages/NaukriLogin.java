package com.naukri.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Login page to maintain login page webelments and its methods
 * @author Chinna.Putha
 *
 */
public class NaukriLogin {
	
	
	@FindBy(xpath="//input[@id='usernameField']")
	private WebElement username;
	
	@FindBy(css ="input#passwordField")
	private WebElement password;
	
	
	@FindBy(xpath ="//button[normalize-space()='Login']")
	private WebElement login;
	
	
	
	public void loginNaukri(String user, String pwd) {
		username.sendKeys(user);
		password.sendKeys(pwd);
		login.click();
		
		try {
			Thread.sleep(6000);
		} catch (Throwable e) {
			e.printStackTrace();
		}
	}
	
	
	

}
