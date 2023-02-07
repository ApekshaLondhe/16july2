package webelement_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sandkeys1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\SelinumFiles\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(500);
		driver.findElement(By.xpath("//input[@id=\"email\"]")).sendKeys("AJINKYA");
		Thread.sleep(500);
		driver.findElement(By.xpath("//input[@id=\"email\"]")).clear();
		Thread.sleep(500);
		driver.findElement(By.xpath("//input[@id=\"email\"]")).sendKeys("Apeksha");
		Thread.sleep(500);
		//driver.findElement(By.xpath("(//a[@role=\"button\"])[2]")).click();
		driver.findElement(By.xpath("(//a[@role=\"button\"])[2]")).click();
		WebElement text1 = driver.findElement(By.xpath("//h2[text()=\"Facebook helps you connect and share with the people in your life.\"]"));
		
		text1.getText();
		System.out.println(text1.getText());
		
		

	}

}
