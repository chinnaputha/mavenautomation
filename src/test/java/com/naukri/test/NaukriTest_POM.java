package com.naukri.test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.naukri.pages.NaukriLogin_POM;
import com.naukri.pages.NaukriUpdate_POM;
import com.naukri.utils.TestBase;

public class NaukriTest_POM extends TestBase {

	@Test(alwaysRun = true)
	public void lanuchNaukriApp() {
		openApplication("chrome", "https://www.naukri.com/nlogin/login");
	}

	@Test(dependsOnMethods = "lanuchNaukriApp")
	@Parameters({"username","password"})
	public void loginToNaukri(String username,String password) {
		NaukriLogin_POM nlp = new NaukriLogin_POM(driver);
		nlp.loginNaukri(username, password);
	}

	@Test(dependsOnMethods = "loginToNaukri")
	public void updateProfile() throws InterruptedException {
		NaukriUpdate_POM nu = new NaukriUpdate_POM(driver);
		nu.updateMyProfile();
	}

}
