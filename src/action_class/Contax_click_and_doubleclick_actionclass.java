package action_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Contax_click_and_doubleclick_actionclass {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\SelinumFiles\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/simple_context_menu.html");
		Thread.sleep(500);
System.out.println("==================================================");

//mouse action-->doubal click

//first create object of action class

		
	Actions act=new	Actions(driver);
	
//first way
	
	WebElement doubleclick11 = driver.findElement(By.xpath("//button[text()=\"Double-Click Me To See Alert\"]"));
		
	//act.moveToElement(doubleclick11);
	//Thread.sleep(500);
	//act.doubleClick().perform();	
		
//second way
	//act.doubleClick(doubleclick11).build().perform();
		
//3rd way
	//act.doubleClick(doubleclick11).perform();
	
System.out.println("======================================================================");	
		
//mouse action-->contaxt click--->means (right click)

      WebElement contaxtclick1 = driver.findElement(By.xpath("//span[text()=\"right click me\"]"));
		
//first way
    //act.moveToElement(contaxtclick1);
    //Thread.sleep(500);
    //act.contextClick().perform();
		
//second way
   // act.contextClick(contaxtclick1).build().perform();
      
//3rdway
      act.contextClick(contaxtclick1).perform();
      
System.out.println("==============================================================");      
      
		
	}

}
