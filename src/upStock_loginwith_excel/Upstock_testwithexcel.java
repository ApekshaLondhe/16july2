package upStock_loginwith_excel;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Upstock_testwithexcel {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\SelinumFiles\\chromedriver.exe");
		 WebDriver driver= new ChromeDriver();		 
		 driver.get("https://login-v2.upstox.com/");
		 Thread.sleep(1000);
		 
		 File myfile=new File("C:\\Users\\user\\Downloads\\SelinumFiles\\16julyEven.xlsx");
		Sheet mysheet = WorkbookFactory.create(myfile).getSheet("Sheet1");
		String Id = mysheet.getRow(0).getCell(0).getStringCellValue();
		System.out.println(Id);
		 
		
		 
		 Upstock_loginwithExcel login=new Upstock_loginwithExcel(driver);
		 login.enteruserid(Id);


		 login.enterPASS(mysheet.getRow(0).getCell(1).getStringCellValue());
		 login.ckickbuttion();
		 Thread.sleep(4000);
		 
		 Upstock_passcodepage ps1=new Upstock_passcodepage(driver);
		 ps1.passcode(mysheet.getRow(0).getCell(2).getStringCellValue());
		 
		 Thread.sleep(5000);
		 Upstock_welcomepage1 welcome=new Upstock_welcomepage1(driver);
		 welcome.clickimgoodbutton();
		 
		 Thread.sleep(6000);
		 UpStock_homepage1 TEST=new UpStock_homepage1(driver);
		 TEST.validateuserid(mysheet.getRow(0).getCell(3).getStringCellValue());
		 TEST.clickfundbuttion();
		// TEST.getActualUserid(driver);
		// TEST.clicklogoutbuttion();
		 Thread.sleep(6000);
		 UpStock_fundpage1 fun=new UpStock_fundpage1(driver) ;
		 fun.getmyfunds();
		 fun.getmyriviev9();
		 TEST.clicklogoutbuttion();
		 
		 
		 //driver.close();
		 
	}

	
		
		
	}


