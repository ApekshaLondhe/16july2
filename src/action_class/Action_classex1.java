package action_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Action_classex1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\SelinumFiles\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/drag_drop.html");
		Thread.sleep(500);
System.out.println("===============================================================");		
		//action class-->move to elemet
		//1-->crete object of action class
		
		Actions act=new Actions(driver);
		Thread.sleep(500);
		//by using one of the action class method perform requaird action
		WebElement sale1 = driver.findElement(By.xpath("//a[contains(text(),\" SALES \")]"));
		Thread.sleep(500);
		act.moveToElement(sale1).perform();
		Thread.sleep(500);
System.out.println("=====================================================================");		
		//Mouse Action-->click() method
		//driver.findElement(By.xpath("(//a[contains(text(),\"Selenium\")])[2]")).click();

		WebElement selenium1 = driver.findElement(By.xpath("(//a[contains(text(),\"Selenium\")])[2]"));
		Thread.sleep(500);
		
		//first way
		
		////act.moveToElement(selenium1);
		//Thread.sleep(500);
		//act.click().perform();
		
		//second way
		
		//act.click(selenium1).build().perform();
//3rd way
		
		act.click(selenium1).perform();
System.out.println("==================================================================");		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
