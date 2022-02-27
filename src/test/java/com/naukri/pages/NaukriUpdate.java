package com.naukri.pages;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import com.naukri.utils.BrowserWaits;

public class NaukriUpdate {

	@FindBy(css = "div[class='updateProfile']")
	private WebElement updateProfile;

	@FindBy(xpath = "//em[@class='icon edit']")
	private WebElement profileEdit;

	@FindBy(xpath = "//input[@id='mob_number']")
	private WebElement mobileNumber;

	@FindBy(xpath = "//button[@id='saveBasicDetailsBtn']")
	private WebElement saveBtn;

	@FindBy(xpath = "//span[text()='Profile Last updated']/following-sibling::span")
	private WebElement updateStatus;

	public void updateMyProfile(WebDriver driver) throws InterruptedException {
		updateProfile.click();
		BrowserWaits.waitForElementToClick(driver, profileEdit);
		profileEdit.click();
		BrowserWaits.waitForElementToClick(driver, mobileNumber);
		mobileNumber.sendKeys(RandomStringUtils.randomNumeric(10));
		saveBtn.click();
		Thread.sleep(6000);//replace with explicit wait
		String staus = updateStatus.getText();
		System.out.println("status --->" + staus);
		Assert.assertEquals(updateStatus.getText(), "today2", "Profile not updated");
		System.out.println("profile updation success");

	}

}
