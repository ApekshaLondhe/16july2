package listBox_Dropdown;

import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import commalyMethodUse.Java_comman_Methods;

public class DropdownEX1 {

	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\SelinumFiles\\chromedriver.exe");
	    ChromeDriver driver=new ChromeDriver();
	    driver.get("https://www.facebook.com/");
	    
	   WebElement c1 = driver.findElement(By.xpath("(//a[@role=\"button\"])[2]"));
	   c1.click();
	  // Java_comman_Methods.waitmethod(driver, 1000);
	  // Java_comman_Methods.takeshreenshot(driver, "aps");
	 //select[@name="birthday_day"]
System.out.println("=====================================================================");	   
	   driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
	   WebElement days = driver.findElement(By.id("day"));
	   
	  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	  
	   Select S1=new Select(days);
	   Thread.sleep(1000);
	   S1.selectByIndex(11);
System.out.println("========================================================================");
       driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
       WebElement months = driver.findElement(By.xpath("//select[@name=\"birthday_month\"]"));
	    Select s2=new Select(months);
	    Thread.sleep(1000);
	    s2.selectByVisibleText("Oct");
	    driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
System.out.println("===========================================================================");
       WebElement monts = driver.findElement(By.xpath("//select[@name=\"birthday_year\"]"));
       Select s3=new Select(monts);
       driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
       s3.selectByVisibleText("1998");
System.out.println("======================================================");


List<WebElement>days1=S1.getOptions();
 days1.size();
System.out.println(days1.size());

for(int i=0;i<=days1.size()-1;i++)
{
System.out.println(i);	
}
System.out.println("========================================================");

 String M1 = months.getText();
 System.out.println(M1);
 System.out.println("======================================================");
 
    
  String m2 = monts.getText();
  System.out.println(m2);
  


	}

}
