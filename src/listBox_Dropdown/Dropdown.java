package listBox_Dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\SelinumFiles\\chromedriver.exe");
    ChromeDriver driver=new ChromeDriver();
    driver.get("https://www.facebook.com/");
 //===================================================== 
    driver.findElement(By.xpath("//input[@id=\"email\"]")).sendKeys("9175846391");
    Thread.sleep(1000);
    driver.findElement(By.xpath("//input[@id=\"pass\"]")).sendKeys("1234");
    Thread.sleep(1000);
    driver.findElement(By.xpath("(//a[@role=\"button\"])[2]")).click();
    Thread.sleep(1000);
    //==================================================
    
     WebElement days = driver.findElement(By.id("day"));
     Thread.sleep(1000);
	 Select Sdays=new Select(days);
	 Thread.sleep(100);
	 Sdays.selectByVisibleText("13");
	 Thread.sleep(1000);
//=========================================================	 
	  WebElement months = driver.findElement(By.id("month"));
	  Thread.sleep(1000);
	  Select smonth=new Select(months);
	  Thread.sleep(100);
	  smonth.selectByVisibleText("Oct");
	  Thread.sleep(100);
//========================================================
	   WebElement year = driver.findElement(By.id("year"));
	   Select Syear=new Select(year);
	   Syear.selectByVisibleText("1999");
	   Thread.sleep(100);
	//System.out.println("=================================================");   
	   
	         List<WebElement> DAYS = Sdays.getOptions();
	         DAYS.size();
	         System.out.println(DAYS.size());
	         
	         for(int i=0;i<=DAYS.size()-1;i++)
	         {
	        	 System.out.println(i);
	         } 
	        	 
	
	}

}
