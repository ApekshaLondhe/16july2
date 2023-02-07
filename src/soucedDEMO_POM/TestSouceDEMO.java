package soucedDEMO_POM;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestSouceDEMO {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
		
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\SelinumFiles\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		Thread.sleep(100);
		driver.get("https://www.saucedemo.com/");
		
		File myfile=new File("C:\\Users\\user\\Downloads\\SelinumFiles\\16julyEven.xlsx");
		Sheet Mysheet = WorkbookFactory.create(myfile).getSheet("Sheet1");
		String USERNAME = Mysheet.getRow(2).getCell(0).getStringCellValue();
		System.out.println(USERNAME);
		
		SouceD_LoginPage Login=new SouceD_LoginPage(driver);
		Login.EnterUsername(USERNAME);
		Login.EnterPWD(Mysheet.getRow(2).getCell(1).getStringCellValue());
		Login.clickLoginButton();
		
		
		
		
		

	}

}
