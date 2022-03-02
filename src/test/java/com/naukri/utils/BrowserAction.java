package com.naukri.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BrowserAction {

	WebDriver driver;

	public BrowserAction(WebDriver driver) {
		this.driver = driver;
	}

	public void click_css(String locator) {
		driver.findElement(By.cssSelector(locator)).click();
	}
	
	public void click_xpath(String locator) {
		driver.findElement(By.xpath(locator)).click();
	}

}
