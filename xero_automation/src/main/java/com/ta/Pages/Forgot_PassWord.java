package com.ta.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.LogStatus;
import com.ta.xero_automation.Xero_Utility;

public class Forgot_PassWord extends Xero_Utility{
	
	@FindBy(partialLinkText = "Login")
	WebElement login;
	
	@FindBy(linkText = "Forgot password?")
	WebElement forgotPwd;
	
	@FindBy(xpath = "//title[contains(text(),'Xero | Forgot Password')]")
	WebElement forgotPage;
	
	@FindBy(id = "Email")
	WebElement Email;
	
	@FindBy(id = "submit-reset-password")
	WebElement SendLink;
	
	@FindBy(tagName = "title")
	WebElement ReserMsg;
	
	String sPathOFScreenshot1 = System.getProperty("user.dir")+"//screenshot/screenshot_Forgot_PassWord.png";

	public Forgot_PassWord() {
		PageFactory.initElements(driver,this);
	}
	public String ValidateLoginPage() throws Exception {
		clickObj(login, "login");
		WebElement title =  driver.findElement(By.tagName("title"));
		if(title.isEnabled()) {
			logger.log(LogStatus.PASS," Xero application page is displayed ");
		}else {
			logger.log(LogStatus.FAIL, " Xero application page is not displayed ");
			takeSnapShot(driver, sPathOFScreenshot1);
		}
		return driver.getTitle();
	}
	public WebElement ForgotPassword() throws Exception {
		clickObj(forgotPwd, "forgot password ");
		if(forgotPage.isEnabled()) {
			logger.log(LogStatus.PASS," Xero forgot password page is displayed ");
		}else {
			logger.log(LogStatus.FAIL," Xero forgot password page is not displayed ");
			takeSnapShot(driver, sPathOFScreenshot1);
		}
		return forgotPage;
	}
	public WebElement ResetMessage(String un) throws Exception {
		enterText(Email, un , "User Email ");
		clickObj(SendLink, "SendLink ");
		return ReserMsg;
	}
	public boolean validateResetMsg() throws Exception {
		if(ReserMsg.isEnabled()) {
			logger.log(LogStatus.PASS," Password reset message is displayed ");
		}else {
			logger.log(LogStatus.FAIL," Password reset message is not displayed ");
			takeSnapShot(driver, sPathOFScreenshot1);
		}
		return ReserMsg.isDisplayed();
	}
}
