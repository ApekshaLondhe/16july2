package upStock_loginwith_excel;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class ValidateUserID {
	WebDriver driver;
	Upstock_loginwithExcel login;
	 Upstock_passcodepage ps1;
	Upstock_welcomepage1 welcome;
	UpStock_homepage1 TEST;
	File myfile;
	Sheet mysheet;
	@AfterClass
	public void lounchBrowser() throws InterruptedException, EncryptedDocumentException, IOException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\SelinumFiles\\chromedriver.exe");
		  driver= new ChromeDriver();		 
		 driver.get("https://login-v2.upstox.com/");
		 Thread.sleep(1000);
		 login=new Upstock_loginwithExcel(driver);
		 ps1=new Upstock_passcodepage(driver);
		 welcome=new Upstock_welcomepage1(driver);
		 TEST=new UpStock_homepage1(driver);
		  myfile=new File("C:\\Users\\user\\Downloads\\SelinumFiles\\16julyEven.xlsx");
		 mysheet = WorkbookFactory.create(myfile).getSheet("Sheet1");
	}
	@AfterMethod
	public void loginUpstock() throws InterruptedException
	{
		String Id = mysheet.getRow(0).getCell(0).getStringCellValue();
		login.enteruserid(Id);
		login.enterPASS(mysheet.getRow(0).getCell(1).getStringCellValue());
		login.ckickbuttion();
		ps1.passcode(mysheet.getRow(0).getCell(2).getStringCellValue());
		Reporter.log("login successful....", true);
		Thread.sleep(5000);
		welcome.clickimgoodbutton();
		Thread.sleep(5000);
	}
		
  @Test
  public void validateuserid( WebDriver driver) throws IOException {
	  
	  String expected = mysheet.getRow(0).getCell(3).getStringCellValue();
	  String ACID = TEST.getActualUserid(driver);
	  
	  Assert.assertEquals(ACID, expected,"if both are not equal that time test case is fail");
	  
  }
  @AfterMethod
  public void logout() throws InterruptedException
  {
	  TEST.clicklogoutbuttion();
	  
  }
  @AfterClass
  public void closeB()
  {
	  driver.close();
  }
  
  
}
