package upStock_Pom;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ValidateUserid {
	WebDriver driver;
	UpstockLogin_Page login;
	Upstock_passcode pass;
	UpStock_Welcomepage buttion;
	 UpStock_homepage NAME;
	 File myfile;
	Sheet mysheet;
	@BeforeClass
	public void lounchBrowser() throws InterruptedException, EncryptedDocumentException, IOException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\SelinumFiles\\chromedriver.exe");
		  driver= new ChromeDriver();
		 Thread.sleep(1000);
		 driver.get("https://login-v2.upstox.com/");
		 Thread.sleep(1000);
		login =new UpstockLogin_Page(driver);
		pass=new Upstock_passcode(driver);
		buttion=new UpStock_Welcomepage(driver);
		NAME=new UpStock_homepage(driver);
		 myfile=new File("C:\\Users\\user\\Downloads\\SelinumFiles\\16julyEven.xlsx");
		 mysheet = WorkbookFactory.create(myfile).getSheet("Sheet1");
	}
	
	@BeforeMethod
	public void loginUpstock()
	{
		
		
	}
	
	
	
	
	
	
  @Test
  public void f() {
  }
}
