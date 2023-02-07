package listBox_Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class VisibalText {

	public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\SelinumFiles\\chromedriver.exe");	
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	Thread.sleep(100);
	driver.findElement(By.xpath("(//a[@role=\"button\"])[2]")).click();
	Thread.sleep(1000);
	        
	WebElement day = driver.findElement(By.name("birthday_day"));
	Thread.sleep(1000);
	 Select D=new Select(day);
	 Thread.sleep(1000);
	 D.selectByIndex(3);
	 Thread.sleep(1000);
//====================================================================================	 
	  WebElement month = driver.findElement(By.name("birthday_month"));
	  Thread.sleep(1000);
	  Select M=new Select(month);
	  Thread.sleep(1000);
	  M.selectByVisibleText("Apr");
	  Thread.sleep(1000);
//================================================================================	  
	  WebElement year = driver.findElement(By.name("birthday_year"));
	  Thread.sleep(1000);
	  Select Y=new Select(year);
	  Thread.sleep(1000);
	  Y.selectByValue("1999");
		   
	 // @FindBy(xpath = "(//span[@class=\"righttopmenu1\"])[2]//span") private WebElement Acbalance;
		
		
		

	}

}
