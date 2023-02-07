package Riview_Ratings;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Riview_ratings {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\SelinumFiles\\chromedriver.exe");
		 WebDriver driver= new ChromeDriver();
		 Thread.sleep(1000);
		 driver.get("https://www.flipkart.com/");
		 
		 driver.findElement(By.name("q")).sendKeys("i fhon 13");
		 	 
		 driver.findElement(By.xpath("(//div[@class=\"_2QfC02\"])/button[1]")).click();
		 
		 driver.findElement(By.xpath("//button[@class=\"L0Z3Pu\"]")).click();
		 
	//how to get rating on of any product
		 Thread.sleep(4000);
		 WebElement ratings = driver.findElement(By.xpath("((//div[@class=\"col col-7-12\"])[1]//span)[1]"));
		 ratings.getText();
		 System.out.println("ratings is "+ ratings.getText());
		 
		 
		 Thread.sleep(4000);
		 WebElement mytext = driver.findElement(By.xpath("(//div[@class=\"col col-7-12\"])[1]//span[3]"));
		 
		 mytext.getText();
		 System.out.println("i phon riview is "+mytext.getText());
		 
		 

		 

	}

}
