package assignMent;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assgn4 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\SelinumFiles\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		Thread.sleep(100);
		driver.findElement(By.name("q")).sendKeys("iphone 14 pro max");
		Thread.sleep(100);
		List<WebElement> l1 = driver.findElements(By.xpath("(//ul[@class=\"G43f7e\"])[1]/li"));
		Thread.sleep(100);
		driver.findElement(By.xpath("(//li[@class=\"sbct\"])[1]")).click();
		Thread.sleep(100);
		driver.findElement(By.xpath("(//span[@class=\"bmaJhd iJddsb\"])[4]")).click();
		Thread.sleep(100);
		//driver.findElement(By.tagName("img"));
		List<WebElement> img = driver.findElements(By.tagName("img"));
	     System.out.println(img.size());
		
	}

}
