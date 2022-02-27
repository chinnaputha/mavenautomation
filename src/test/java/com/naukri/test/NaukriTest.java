package com.naukri.test;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.naukri.pages.NaukriLogin;
import com.naukri.pages.NaukriUpdate;
import com.naukri.utils.TestBase;

public class NaukriTest  extends TestBase{
	
	@Test(alwaysRun = true)
	public void lanuchNaukriApp() {
		openApplication("chrome", "https://www.naukri.com/nlogin/login");
	}
	
	@Test(dependsOnMethods = "lanuchNaukriApp")
	public void loginToNaukri() {
		NaukriLogin nl = PageFactory.initElements(driver, NaukriLogin.class);
		nl.loginNaukri("javacampus.selenium@gmail.com", "Testing@1234",driver);
	}
	
	/*
	 * @Test(dependsOnMethods = "loginToNaukri") public void updateProfile() throws
	 * InterruptedException { NaukriUpdate nu = PageFactory.initElements(driver,
	 * NaukriUpdate.class); nu.updateMyProfile(driver); }
	 */
	
	

}
