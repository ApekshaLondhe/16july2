package assignMent;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign3 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\SelinumFiles\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		Thread.sleep(1000);
		driver.findElement(By.name("q")).sendKeys("honda");
		Thread.sleep(1000);
		List<WebElement> list = driver.findElements(By.xpath("(//ul[@class=\"G43f7e\"])[1]/li"));
		
		driver.findElement(By.xpath("(//div[@class=\"pcTkSc\"])[6]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//span[@class=\"bmaJhd iJddsb\"])[2]")).click();
		Thread.sleep(1000);
		
		driver.findElements(By.tagName("img"));
		Thread.sleep(1000);
		List<WebElement> list1 = driver.findElements(By.tagName("img"));
		list1.size();
		System.out.println(list1.size());
		
		
		
	}

}
