package com.ta.Pages;

import java.awt.Robot;
import java.awt.event.InputEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.ClickAction;
import org.openqa.selenium.remote.server.handler.SwitchToFrame;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.LogStatus;
import com.ta.xero_automation.Xero_Utility;

public class Test_Upload_profile_image extends Xero_Utility{
	
	@FindBy(xpath = "//img[@class='xrh-avatar']")
	WebElement AccountBtn;
	
	@FindBy(xpath = "//div[@class='xrh-dropdown-layout xrh-addon--dropdown xrh-dropdown-is-open xrh-dropdown-is-opening xrh-dropdown-positionright']//div[@class='xrh-dropdown--panel']")
	WebElement NavigationBox;
	
	@FindBy(xpath = "//li[@class='xrh-addon xrh-addon-lastvisible']//li[1]")
	WebElement Profile;
	
	@FindBy(xpath = "//title[contains(text(),'My Xero | Profile Settings')]")
	WebElement ProfilePageTitle;
	
	//@FindBy(xpath = "//div[@id='button-1041-btnWrap']")
	@FindBy(xpath = "/html[1]/body[1]/div[4]/form[1]/div[1]/div[2]/div[1]/div[1]/span[1]/div[1]/div[1]/span[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]")
	WebElement UploadImageBtn;
	
	@FindBy(xpath = "//div[@id='ext-comp-1167']")
	WebElement frame;
	
	@FindBy(xpath = "//div[@id='filefield-1174-button']")
	WebElement Browse;
	
	@FindBy(xpath = "//a[@id='button-1178-btnEl']")
	WebElement Upload;
	
	@FindBy(xpath = "//div[@id='button-1164']")
	WebElement Save;
	@FindBy(xpath = "//img[@class='your-logo']")
	WebElement imageDisp;
	
	String sPathOFScreenshot1 = System.getProperty("user.dir")+"//screenshot/screenshot_Test_Upload_profile_image.png";
	
	public Test_Upload_profile_image() {
		PageFactory.initElements(driver,this);
	}
	public void NavigationBoxValidation() throws Exception {
		
		clickObj(AccountBtn, "AccountBtn");
		if(NavigationBox.isDisplayed()) {
			logger.log(LogStatus.PASS, "Xero navigation box is displayed");
		}else {
			logger.log(LogStatus.FAIL, "Xero navigation box is not displayed");
			takeSnapShot(driver, sPathOFScreenshot1);
		}
	}
	public void ProfilePageValidation() throws Exception {
		
		clickObj(Profile, "Profile ");
		if(ProfilePageTitle.isEnabled()) {
			logger.log(LogStatus.PASS, "Profile Setting page is displayed");
		}else {
			logger.log(LogStatus.FAIL, "Profile Setting is not displayed");
			takeSnapShot(driver, sPathOFScreenshot1);
		}
	}
	public void UploadPicture() throws Exception {
		
		clickObj(UploadImageBtn, "Upload Image Btn ");
		clickObj(Browse, "Browse ");
		//   Upload by using auto it
		//Runtime.getRuntime().exec("C:/Users/dolby/Downloads/micky.jpg");
		//Thread.sleep(5000);
		
		Robot robot = new Robot();
		robot.mouseMove(100,220);
		//Navigating through mouse hover. Note that the coordinates might differ,
		//kindly check the coordinates of x and y axis and update it accordingly.
		Thread.sleep(2000);
		robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		Thread.sleep(2000);
		robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
		Thread.sleep(2000);
		robot.mouseMove(200,190);
		Thread.sleep(2000);
		robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
		robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
		Thread.sleep(4000);
		
		clickObj(Upload, "Upload ");
		Thread.sleep(2000);
		clickObj(Save, "Save");
		if(imageDisp.isDisplayed()) {
			logger.log(LogStatus.PASS, "Uploaded Image is displayed");
		}else {
			logger.log(LogStatus.FAIL, "Uploaded Image is not displayed");
			takeSnapShot(driver, sPathOFScreenshot1);
		}
	}
	
}
