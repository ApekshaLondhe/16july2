package Neostock_pom1;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;

import utility.Utility_Class;



public class neo_t  {

	
	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\SelinumFiles\\chromedriver.exe");
		 WebDriver driver= new ChromeDriver();
		 Thread.sleep(1000);
		 driver.get("https://neostox.com/");
		 Thread.sleep(1000);
		 Reporter.log("lonching the browser", true);
		 
		 File myfile=new File("C:\\Users\\user\\Downloads\\SelinumFiles\\16julyEven.xlsx");
		Sheet MYsheet = WorkbookFactory.create(myfile).getSheet("sheet1");
		 
		 Sign_up_page s1=new Sign_up_page(driver);
		 s1.EntermobileNumber(driver, MYsheet.getRow(1).getCell(0).getStringCellValue());
		 
		 
	}
	

}
