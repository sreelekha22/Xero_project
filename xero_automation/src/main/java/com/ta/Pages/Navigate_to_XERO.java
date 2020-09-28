package com.ta.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.LogStatus;
import com.ta.xero_automation.Xero_Utility;

public class Navigate_to_XERO extends Xero_Utility {
	
	@FindBy(partialLinkText = "Login")
	WebElement login;
	
	@FindBy(name = "Username")
	WebElement username;
	
	@FindBy(id = "xl-form-password")
	WebElement password;
	
	@FindBy(id = "xl-form-submit")
	WebElement submit;
	
	@FindBy(xpath= "//h1[@class='xui-pageheading--title']")
	WebElement HomePage;
	
	public Navigate_to_XERO() {
		PageFactory.initElements(driver,this);
	}
	String sPathOFScreenshot1 = System.getProperty("user.dir")+"//screenshot/screenshot_Navigate_to_XERO.png";
	
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
		return HomePage;
	}
	public void validateHomePage() throws Exception {
		if(HomePage.isDisplayed()) {
			logger.log(LogStatus.PASS," User's Home Page is displayed ");
		}else {
			logger.log(LogStatus.FAIL, " User's Home Page is not displayed ");
			takeSnapShot(driver, sPathOFScreenshot1);
		}
	}
}
