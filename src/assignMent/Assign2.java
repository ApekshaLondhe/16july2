package assignMent;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\SelinumFiles\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		Thread.sleep(500);
		driver.findElement(By.xpath("//input[@name=\"q\"]")).sendKeys("iphone 14 pro max");
		Thread.sleep(500);
		List<WebElement> l1 = driver.findElements(By.xpath("(//ul[@class=\"G43f7e\"])[1]/li"));
		Thread.sleep(500);	
		l1.size();
		Thread.sleep(500);
		System.out.println("size is " + l1.size());
		Thread.sleep(500);
		//how to show individual option in list first of all you need a traversing then use gettext() method
		//for each loop use hare
		for(WebElement l2:l1)
		{
			System.out.println(l2.getText());
			//System.out.println();
			String expected="iphone 14 pro max";
			String actual=l2.getText();
			if(expected.equals(actual))
			{
				l2.getText();
				//break;
			}
			else {
				l2.click();
				break;
			}
			
			
			
			
			
		}
		
		
		
		
	}

}