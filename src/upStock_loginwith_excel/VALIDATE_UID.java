package upStock_loginwith_excel;

import org.testng.annotations.Test;

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
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class VALIDATE_UID {
	
	 WebDriver driver;
	 File myfile;
	 Sheet mysheet;
	 Upstock_loginwithExcel login;
	 Upstock_passcodepage ps1;
	 Upstock_welcomepage1 welcome;
	 UpStock_homepage1 TEST;
	@BeforeClass
	  public void LonchBrowser() throws InterruptedException, EncryptedDocumentException, IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\SelinumFiles\\chromedriver.exe");
		  driver= new ChromeDriver();		 
		 driver.get("https://login-v2.upstox.com/");
		 Thread.sleep(4000);
		  myfile=new File("C:\\Users\\user\\Downloads\\SelinumFiles\\16julyEven.xlsx");
		 mysheet = WorkbookFactory.create(myfile).getSheet("Sheet1");
		 login=new Upstock_loginwithExcel(driver);
		 ps1=new Upstock_passcodepage(driver);
		 welcome=new Upstock_welcomepage1(driver);
		 TEST=new UpStock_homepage1(driver);
	} 
		 
	  @AfterMethod
	  public void loginupstock() throws InterruptedException
	  {
		  login.enteruserid(mysheet.getRow(0).getCell(0).getStringCellValue());
		  login.enterPASS(mysheet.getRow(0).getCell(1).getStringCellValue());
		  login.ckickbuttion();
		  Reporter.log("login successfull....", true);
		  Thread.sleep(3000);
		  ps1.passcode(mysheet.getRow(0).getCell(2).getStringCellValue());
		  Thread.sleep(4000);
		  welcome.clickimgoodbutton();
		  Thread.sleep(8000);
	  }
	  

  @Test
  public void ValidateU() throws IOException, InterruptedException {
	  Thread.sleep(6000);
	 String expected = mysheet.getRow(0).getCell(3).getStringCellValue();
	 System.out.println( expected);
	// System.out.println(Actual);
	 Thread.sleep(6000);
	 String Actual = TEST.getActualUserid(driver);
	 System.out.println(Actual);
	 
	 Assert.assertEquals(Actual, expected,"both are match test case is pass");
  }  
	  
  @AfterMethod
  public void logoutB() throws InterruptedException
  {
	  Thread.sleep(6000);
  //TEST.clicklogoutbuttion();
 }
  @AfterClass
  public void closeB() throws InterruptedException
  {
	  Thread.sleep(6000);
 // driver.close();
  }
  
  
  
  

}
