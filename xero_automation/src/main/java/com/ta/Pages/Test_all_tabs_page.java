package com.ta.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.relevantcodes.extentreports.LogStatus;
import com.ta.xero_automation.Xero_Utility;

public class Test_all_tabs_page extends Xero_Utility{
	
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
	
	@FindBy(xpath= "//a[@name='navigation-menu/dashboard']")
	WebElement DashBoard;
	
	@FindBy(xpath= "//title[contains(text(),'Xero | Dashboard | abc.com')]")
	WebElement DashBoardTitle;
	
	@FindBy(xpath= "//button[@name='navigation-menu/accounting']")
	WebElement Accounts;
	
	@FindBy(xpath= "//div[@class='xrh-dropdown-layout xrh-nav--dropdown xrh-dropdown-is-open xrh-dropdown-is-opening xrh-dropdown-positionleft']")
	WebElement AccountsDropDown;
	
	@FindBy(linkText = "Reports")
	WebElement Reports;
	
	@FindBy(xpath= "//title[contains(text(),'Xero | Reports | abc.com')]")
	WebElement ReportsPage;
	
	@FindBy(name = "navigation-menu/contacts")
	WebElement Contacts;
	
	@FindBy(xpath= "//div[@class='xrh-dropdown-layout xrh-nav--dropdown xrh-dropdown-is-open xrh-dropdown-is-opening xrh-dropdown-positionleft']//div[@class='xrh-dropdown--body']")
	WebElement ContactsDropDown;
	
	@FindBy(xpath = "//div[@class='xrh-appbutton--body']")
	WebElement appBtn;
	
	@FindBy(xpath = "//a[contains(text(),'Settings')]")
	WebElement Settings;
	
	@FindBy(xpath = "//title[contains(text(),'Xero | Organization settings | abc.com')]")
	WebElement SettingsTitle;
	
	@FindBy(xpath = "//li[1]//button[1]//div[1]")
	WebElement newBtn;
	
	@FindBy(xpath = "//div[@class='xrh-dropdown-layout xrh-addon--dropdown xrh-dropdown-is-open xrh-dropdown-is-opening xrh-dropdown-positionright']//div[@class='xrh-dropdown--panel']")
	WebElement newDropDown;
	
	@FindBy(xpath = "//a[contains(text(),'Files')]")
	WebElement Files;
	
	@FindBy(xpath = "//title[contains(text(),'Files | abc.com | Xero')]")
	WebElement FilesTitle;
	
	@FindBy(xpath = "//li[3]//button[1]//div[1]")
	WebElement notifications;
	
	@FindBy(xpath = "//iframe[@id='post_office_frame']")
	WebElement notificationsPage;
	
	@FindBy(xpath = "//li[2]//button[1]//div[1]")
	WebElement search;
	
	@FindBy(xpath = "//iframe[@id='GlobalSearchApp']")
	WebElement searchBar;
	
	@FindBy(xpath = "//li[4]//button[1]//div[1]")
	WebElement help;
	
	@FindBy(xpath = "//div[@class='xn-h-task-list xn-h-task-list-narrow']")
	WebElement helpArea;
	
	String sPathOFScreenshot1 = System.getProperty("user.dir")+"//screenshot/screenshot_Test_all_tabs_page.png";
	
	public Test_all_tabs_page() {
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
	public void ValidateDashBoardPage() throws Exception {
		clickObj(DashBoard, "DashBoard");
		if(DashBoardTitle.isEnabled()) {
			logger.log(LogStatus.PASS," you are now in dashboard page ");
		}else {
			logger.log(LogStatus.FAIL, " dashboard Page is not displayed ");
			takeSnapShot(driver, sPathOFScreenshot1);
		}
	}
	public void validateAccountsDropDown() throws Exception {
		clickObj(Accounts, "Accounts ");
		if(AccountsDropDown.isDisplayed()) {
			logger.log(LogStatus.PASS," you are now in account drop down page ");
		}else {
			logger.log(LogStatus.FAIL, " account drop down Page is not displayed ");
			takeSnapShot(driver, sPathOFScreenshot1);
		}
	}
	public void ReportsPageValidation() throws Exception {
		clickObj(Reports, "Reports ");
		if(ReportsPage.isEnabled()) {
			logger.log(LogStatus.PASS," you are now in reports page ");
		}else {
			logger.log(LogStatus.FAIL, " Reports page is not displayed ");
			takeSnapShot(driver, sPathOFScreenshot1);
		}
	}
	public void ContactPageDropDown() throws Exception {
		clickObj(Contacts, "Contacts ");
		if(ContactsDropDown.isDisplayed()) {
			logger.log(LogStatus.PASS," you are now in contact drop down page ");
		}else {
			logger.log(LogStatus.FAIL, " contact drop down page is not displayed ");
			takeSnapShot(driver, sPathOFScreenshot1);
		}
	}
	public void Settings() throws Exception {
		clickObj(appBtn, "appBtn ");
		clickObj(Settings, "Settings");
		if(SettingsTitle.isEnabled()) {
			logger.log(LogStatus.PASS," you are now in Settings drop down page ");
		}else {
			logger.log(LogStatus.FAIL, " Settings drop down page is not displayed ");
			takeSnapShot(driver, sPathOFScreenshot1);
		}
	}
	
	public void NewDropDownvalidation() throws Exception {
		clickObj(newBtn, "newBtn ");
		if(newDropDown.isDisplayed()) {
			logger.log(LogStatus.PASS," you are now in new drop down page ");
		}else {
			logger.log(LogStatus.FAIL, " new drop down page is not displayed ");
			takeSnapShot(driver, sPathOFScreenshot1);
		}
	}
	
	public void FilesValidation() throws Exception {
		clickObj(appBtn, "appBtn ");
		clickObj(Files, "Files ");
		if(FilesTitle.isEnabled()) {
			logger.log(LogStatus.PASS," you are now in files page ");
		}else {
			logger.log(LogStatus.FAIL, " file page is not displayed ");
			takeSnapShot(driver, sPathOFScreenshot1);
		}
	}
	public void Notification() throws Exception {
		clickObj(notifications, "notifications ");
		if(notificationsPage.isEnabled()) {
			logger.log(LogStatus.PASS," Notification page is displayed ");
		}else {
			logger.log(LogStatus.FAIL, " Notification page is not displayed ");
			takeSnapShot(driver, sPathOFScreenshot1);
		}
	}
	public void ValidateSearch() throws Exception {
		clickObj(search, "search ");
		if(searchBar.isEnabled()) {
			logger.log(LogStatus.PASS," search Bar is displayed ");
		}else {
			logger.log(LogStatus.FAIL, " search Bar is not displayed ");
			takeSnapShot(driver, sPathOFScreenshot1);
		}
	}
	public void HelpAreavalidation() throws Exception {
		clickObj(help, "help ");
		if(helpArea.isDisplayed()) {
			logger.log(LogStatus.PASS," Help area field is displyed ");
		}else {
			logger.log(LogStatus.FAIL, " Help area field is not displayed ");
			takeSnapShot(driver, sPathOFScreenshot1);
		}
	}
}
