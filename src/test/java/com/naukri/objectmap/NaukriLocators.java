package com.naukri.objectmap;

public interface NaukriLocators {

	
	/**********Login Page **********************/
	String NAUKRI_LOGIN_USERNAME_XPATH="//input[@id='usernameField']";
	String NAUKRI_LOGIN_PASSWORD_CSS="input#passwordField";
	String NAUKRI_LOGIN_BUTTON_XPATH="//button[normalize-space()='Login']";
	
	/**********Home Page **********************/
	String NAUKRI_HOME_UPDATE_PROFILE_CSS="div[class='updateProfile']";
	String NAUKRI_HOME_STATUS_XPATH="//span[text()='Profile Last updated']/following-sibling::span";
	
	/**********Profile Page **********************/
	String NAUKRI_PROFILE_EDIT_XPATH="//em[@class='icon edit']";
	String NAUKRI_PROFILE_EDIT_MOBILE_NUMBER_XPATH="//input[@id='mob_number']";
	String NAUKRI_PROFILE_EDIT_SAVE_XPATH="//button[@id='saveBasicDetailsBtn']";
	
}
