package com.naukri.pages;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.naukri.objectmap.NaukriLocators;
import com.naukri.utils.BrowserAction;
import com.naukri.utils.BrowserWaits;

public class NaukriUpdate_POM {

	WebDriver driver;

	public NaukriUpdate_POM(WebDriver driver) {
		this.driver = driver;
	}

	public void updateMyProfile() throws InterruptedException {

		//driver.findElement(By.cssSelector(NaukriLocators.NAUKRI_HOME_UPDATE_PROFILE_CSS)).click();
		
		BrowserAction bra = new BrowserAction(driver);
		bra.click_css(NaukriLocators.NAUKRI_HOME_UPDATE_PROFILE_CSS.toString());

		BrowserWaits.waitForElementToClick(driver,driver.findElement(By.xpath(NaukriLocators.NAUKRI_PROFILE_EDIT_XPATH)));
		//driver.findElement(By.xpath(NaukriLocators.NAUKRI_PROFILE_EDIT_XPATH)).click();
		
		bra.click_xpath(NaukriLocators.NAUKRI_PROFILE_EDIT_XPATH);

		BrowserWaits.waitForElementToClick(driver,driver.findElement(By.xpath(NaukriLocators.NAUKRI_PROFILE_EDIT_MOBILE_NUMBER_XPATH)));

		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();", driver.findElement(By.xpath(NaukriLocators.NAUKRI_PROFILE_EDIT_MOBILE_NUMBER_XPATH)));
		
		driver.findElement(By.xpath(NaukriLocators.NAUKRI_PROFILE_EDIT_MOBILE_NUMBER_XPATH)).sendKeys(RandomStringUtils.randomNumeric(10));
		Thread.sleep(4000);
		driver.findElement(By.xpath(NaukriLocators.NAUKRI_PROFILE_EDIT_SAVE_XPATH)).click();
		Thread.sleep(6000);// replace with explicit wait
		String status = driver.findElement(By.xpath(NaukriLocators.NAUKRI_HOME_STATUS_XPATH)).getText();
		System.out.println("status --->" + status);
		Assert.assertEquals(status, "today", "Profile not updated");
		System.out.println("profile updation success");

	}

}
