package com.sri.Xero_Cucumber;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.NoSuchElementException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Xero_Utility {
	public static ExtentTest logger;
	public static ExtentReports report;
	public static WebDriver driver;
	public static Properties prop;

public Xero_Utility(){
		
		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream(System.getProperty("user.dir") + 
			  "/src/main/java/com/sri/Xero_Cucumber/config.properties");
			prop.load(ip);
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void initialization() {
		
		String browserName = prop.getProperty("browser");
		if(browserName.equals("chrome")){
			
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			
		}else if(browserName.equals("forefox")){
			
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			
		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get(prop.getProperty("url"));
		
	}
	public static WebElement findElement(By location,String objName) {
		WebElement obj = null;
		try {
			obj = driver.findElement(location);
			System.out.println("pass: "+objName+" Found on the page");
			//logger.log(LogStatus.PASS, ""+ objName +" Found on the page");
		}
		catch(NoSuchElementException errMessage) {
			System.out.println("Fail: "+objName+" not found on the page");
			//logger.log(LogStatus.FAIL, ""+ objName +" not Found on the page");
		
		}
		return obj;
	}

	public static void teardown() {
		driver.quit();
	}
	public static void createreport() {
		String path = "C:/Users/dolby/eclipse-workspace/xero_Cucumber/Report/report.html";
		report = new ExtentReports(path);
	}
	public static void CloseReport() {
		report.flush();
	}
	
	public static void CreateTestScriptReport(String TestScriptName) {
		logger = report.startTest(TestScriptName);
	}

	public static void enterText(WebElement obj,String textval,String objName) throws Exception

	{
		if(obj.isEnabled())
		{
			Thread.sleep(4000);
			obj.sendKeys(textval);
			System.out.println("pass: "+textval+" value is entered in "+objName+"field");
			//Call take screenshot function
			//logger.log(LogStatus.PASS,textval+" value is entered in "+objName+"field");
			
			
		}
		else
		{
			System.out.println("fail:" +objName+ " field does not exist please check application");
			//logger.log(LogStatus.FAIL,textval+objName+" field does not exist please check application");
			
		}
	}
	
	public static void clickObj(WebElement obj,String objName) throws Exception
	{
		if(obj.isEnabled())
		{
			obj.click();
			System.out.println("pass :" +objName + " button is clicked");
			//logger.log(LogStatus.PASS, objName+ " button is displayed and clicked");
		}
		else
		{
			System.out.println("Fail:" +objName+"button is not displayed ,please check the application");
			//logger.log(LogStatus.FAIL, objName+ "button is not displayed ,please check the application");
		}
	}
	

	public static void selectCheckBox(WebElement obj, String objName) {
		
		if(obj.isDisplayed()) {
			
			if(obj.isSelected()) {
				System.out.println("Pass: "+objName+" is already selected");
				//logger.log(LogStatus.INFO, objName + "is already selected");
			}else{
			obj.click();
			System.out.println("Pass: "+objName+" is selected");
			//logger.log(LogStatus.PASS, objName + "is selected");
		    }}
			else {
			System.out.println("Fail:"+objName+" is not present.Please chk application");	
			//logger.log(LogStatus.FAIL, objName+ " is not displayed ,please check the application");
		}	
	}
	
	public static void selectDropdown(WebElement obj, String objName) {
						
				if(obj.isDisplayed()) {
					System.out.println("Pass: "+objName+" is  selected");
					obj.click();
				}else
				{
				
					System.out.println("Fail:"+objName+" is not present.Please chk application");	
				
			    }
		}
				
	
	public static void validateErrormsg(String actualmsg, String errormsg) {
		
		if(actualmsg.equals(errormsg))
		{
			System.out.println("TestCase is passed");
			//logger.log(LogStatus.PASS,  "TestCase is passed" );
		}else
	    {
		System.out.println("TestCase is failed");
		//logger.log(LogStatus.FAIL,  "TestCase is failed" );
	    }
	}

public static void switchFrame( WebDriver driver,WebElement obj) {
	 
    if(obj.isDisplayed()) {
     driver.switchTo().frame(obj);
     System.out.println("Pass: we can switch to the "+obj+ " frame");
     //logger.log(LogStatus.PASS,  "Switch to frame" );
     
    }else {
     System.out.println("fail: we can't switch to the "+obj+ " frame");
     //logger.log(LogStatus.FAIL,  "Cannot Switch to frame" );
    }
}


public static void switchFrameid( WebDriver driver,String obj) {
	 
     driver.switchTo().frame(obj);
     System.out.println("Pass: we can switch to the "+obj+ " frame");
     //logger.log(LogStatus.PASS,  "we can switch to the frame" );
     
    }

public static void switchdefaultFrame( WebDriver driver){
	driver.switchTo().defaultContent();
	System.out.println("Pass: we can switch to the "+ driver + " back to frame");
	//logger.log(LogStatus.PASS,  "we can switch back to the frame" );
}



public static void mouseOver(WebDriver driver,WebElement obj) {
	if(obj.isDisplayed()) {
   Actions action=new Actions(driver);
   action.moveToElement(obj).build().perform();
	System.out.println("Pass: "+obj+" is present");
	//logger.log(LogStatus.PASS,  "obj is present" );
	}
 else {
		System.out.println("Fail:"+obj+" is not present.Please chk application");
		//logger.log(LogStatus.FAIL,  "obj is not present.Please chk application" );
	}
}


public static void SelectbyText(WebElement we, String VisibleText){
	   if(we.isDisplayed())
	   {
		   Select selObj=new Select(we);
           selObj.selectByVisibleText(VisibleText);
	           System.out.println("Pass: "+VisibleText+ " is Selected by VisibleText" );
	           //logger.log(LogStatus.PASS, " is Selected by VisibleText" );
	           
	   } 
	   else
	   {
	    System.out.println("Fail: "+VisibleText+ " is not available");
	    //logger.log(LogStatus.FAIL, " is not Selected by VisibleText" );
	    
	   }
	      
}

public static void SelectByValue(WebElement obj, String val) {
	  //if(obj.isSelected()) {
	if(obj.isDisplayed()) {
	   Select selObj=new Select(obj);
	    
	   selObj.selectByValue(val);
	  System.out.println("pass:"+val + " is selected from drop down ");
	  //logger.log(LogStatus.PASS, " is selected from drop down " );
	 
	  }else {
	   System.out.println("Fail:"+val+"is not selected");
	   //logger.log(LogStatus.FAIL, " is not selected from drop down " );
	  }
}	  



public static void selectByIndex(WebElement obj, int index) {
	  if(obj.isDisplayed()) {
	   Select selObj=new Select(obj);
	  selObj.selectByIndex(index);
	  
	  System.out.println("pass:"+index + " is selected from drop down ");
	  //logger.log(LogStatus.PASS, " is selected from drop down " );
	  }else {
	   System.out.println("Fail:"+index+"is not selected");
	   //logger.log(LogStatus.FAIL, " is not selected from drop down " );
	  }
	 }

public static void selectByVisibleText(WebElement obj, String Name) {
	if(obj.isEnabled()) {
		 Select drop = new Select(obj);
		 drop.selectByVisibleText(Name);
	 System.out.println("Pass: dropdown is selected");
	 }else {
	 System.out.println("Fail: dropdown is not available check your application");
	 }
 }


public static void Radiobutton(WebElement obj, String objName) {
	
	if(obj.isDisplayed() ){
		obj.click();
		System.out.println("Pass: "+objName+" is clicked");
	}else {
		System.out.println("Fail:"+objName+" is not displayed .Please check your application");			
	}
}


public static void switchtoAlert(WebDriver driver) {
	 driver.switchTo().alert().accept();
	 System.out.println("Pass: alert is present and accept");
}
public static void switchtoAlertDismiss(WebDriver driver) {
	 driver.switchTo().alert().dismiss();
	 System.out.println("Pass: alert is present and dismissed");
}
	
	public static String[][] readXlData() throws IOException{
		String path = System.getProperty("user.dir")+"\\Resources_Xero\\Xero_Data.xls";
		//System.out.println(path);
		FileInputStream fs=new FileInputStream(new File(path));
		HSSFWorkbook wb=new HSSFWorkbook(fs);
		HSSFSheet sheet=wb.getSheet("Sheet1");
		int rowCount=sheet.getLastRowNum()+1;
		int colCount=sheet.getRow(0).getLastCellNum();
		String[][] data=new String[rowCount][colCount];
		//System.out.println(sheet.getRow(0).getCell(0).getStringCellValue());
		for(int i=0;i<rowCount;i++){
			for(int j=0;j<colCount;j++){
				//System.out.println(i + " " +j);
				int cellType=sheet.getRow(i).getCell(j).getCellType();
				if(cellType==HSSFCell.CELL_TYPE_NUMERIC){
					int val=(int)sheet.getRow(i).getCell(j).getNumericCellValue();
					data[i][j]=String.valueOf(val);
				}
				else
					data[i][j]=sheet.getRow(i).getCell(j).getStringCellValue();
				//System.out.println(data[i][j]);
			}
		}
		return (data);
	}
	public static void takeSnapShot(WebDriver webdriver,String fileWithPath) throws Exception{

        //Convert web driver object to TakeScreenshot

        TakesScreenshot scrShot =((TakesScreenshot)webdriver);

        //Call getScreenshotAs method to create image file

                File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);

            //Move image file to new destination

                File DestFile=new File(fileWithPath);

                //Copy file at destination

                FileUtils.copyFile(SrcFile, DestFile);

    }
	public static void scroll() throws Exception {
		JavascriptExecutor js = (JavascriptExecutor) driver;
				Thread.sleep(1500);
		js.executeScript("window.scrollBy(0,1000)");
	}

}
