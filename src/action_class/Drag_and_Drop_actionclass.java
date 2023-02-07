package action_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_and_Drop_actionclass {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\SelinumFiles\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/drag_drop.html");
		Thread.sleep(500);
		System.out.println("==============================================================");
		
//mouse action-->drang and drop
		
		 Actions act=new Actions(driver);
		WebElement drag = driver.findElement(By.xpath("(//a[@class=\"button button-orange\"])[2]"));
		WebElement drop = driver.findElement(By.id("amt8"));
		
//first way		
		//act.moveToElement(drag).clickAndHold().release(drop).perform();
		
//second way
		//act.moveToElement(drag).perform();
		//act.clickAndHold().release(drop).perform();
		
//3rd way
		act.dragAndDrop(drag, drop).perform();
	    
		
		

	}

	

	

}
