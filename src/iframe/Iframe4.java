package iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe4 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Downloads\\SelinumFiles\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
		Thread.sleep(100);
		
	   String text = driver.findElement(By.xpath("//label[text()=\"Topic : \"]")).getText();
		System.out.println("the main page text is "+text);
		
		driver.switchTo().frame("frame1");
		String text3 = driver.findElement(By.xpath("//b[@id=\"topic\"]")).getText();
		System.out.println("prent page text is "+text3);
		

		
	  driver.switchTo().frame("frame3");
	  String text1 = driver.findElement(By.xpath("//b[text()=\"Inner Frame Check box :\"]")).getText();
	  System.out.println("text of parent page "+text1);
	  
	  
		  

	}

}
