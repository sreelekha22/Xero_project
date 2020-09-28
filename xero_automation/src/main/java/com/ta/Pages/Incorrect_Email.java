package com.ta.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.LogStatus;
import com.ta.xero_automation.Xero_Utility;

public class Incorrect_Email extends Xero_Utility{
	
	@FindBy(partialLinkText = "Login")
	WebElement login;
	
	@FindBy(name = "Username")
	WebElement username;
	
	@FindBy(id = "xl-form-password")
	WebElement password;
	
	@FindBy(id = "xl-form-submit")
	WebElement submit;
	
	@FindBy(xpath = "//li[contains(text(),'Your email or password is incorrect')]")
	WebElement ErrorMsg;
	
	String sPathOFScreenshot1 = System.getProperty("user.dir")+"//screenshot/screenshot_Incorrect_Email.png";
	
	public Incorrect_Email() {
		PageFactory.initElements(driver,this);
	}
	public String ValidateLaunchPage() throws Exception {
		WebElement title =  driver.findElement(By.tagName("title"));
		if(title.isEnabled()) {
			logger.log(LogStatus.PASS," Xero application page is displayed ");
		}else {
			logger.log(LogStatus.FAIL, " Xero application page is not displayed ");
			takeSnapShot(driver, sPathOFScreenshot1);
		}
		return driver.getTitle();
	}
	public WebElement Login(String un,String pwd) throws Exception {
		
		clickObj(login, "login");
		enterText(username, un , "UserName");
		enterText(password, pwd , "PassWord");
		clickObj(submit, "Submit");
		return ErrorMsg;
	}
	public void validateErrorMsg() throws Exception {
		
		if(ErrorMsg.isDisplayed()) {
			logger.log(LogStatus.PASS," error message is displayed ");
		}else {
			logger.log(LogStatus.FAIL, " error message is not displayed ");
			takeSnapShot(driver, sPathOFScreenshot1);
		}
	}

	
}
