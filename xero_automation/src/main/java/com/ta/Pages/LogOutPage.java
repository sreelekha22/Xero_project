package com.ta.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.LogStatus;
import com.ta.xero_automation.Xero_Utility;

public class LogOutPage extends Xero_Utility{
	
	@FindBy(xpath = "//img[@class='xrh-avatar']")
	WebElement AccountBtn;
	
	@FindBy(xpath = "//div[@class='xrh-dropdown-layout xrh-addon--dropdown xrh-dropdown-is-open xrh-dropdown-is-opening xrh-dropdown-positionright']//a[@class='xrh-verticalmenuitem--body'][contains(text(),'Log out')]")
	WebElement logout;
	
	@FindBy(xpath = "//div[@class='form-container']")
	WebElement WelcomePage;
	
	@FindBy(xpath = "//fieldset//div[1]")
	WebElement userNameField;
	
	String sPathOFScreenshot1 = System.getProperty("user.dir")+"//screenshot/screenshot_LogOutPage.png";
	
	public LogOutPage() {
		PageFactory.initElements(driver,this);
	}
	
	public void logout() throws Exception{
		
		clickObj(AccountBtn, "AccountBtn");
		clickObj(logout, "logout");
		if(WelcomePage.isDisplayed()) {
			logger.log(LogStatus.PASS, "Welcome to xero page is displayed.");
		}else {
			logger.log(LogStatus.FAIL, "Welcome to xero page is not displayed.");
			takeSnapShot(driver, sPathOFScreenshot1);
		}
	}
	public void UserNameFieldValidation() throws Exception {
		if(userNameField.isDisplayed()) {
			logger.log(LogStatus.PASS, "user name displayed in user name field");
		}else {
			logger.log(LogStatus.FAIL, "user name is not displayed");
			takeSnapShot(driver, sPathOFScreenshot1);
		}
	}
}
