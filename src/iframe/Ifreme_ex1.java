package iframe;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Ifreme_ex1 {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Downloads\\SelinumFiles\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.get("https://vctcpune.com/selenium/practice.html");
		Thread.sleep(100);
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Thread.sleep(100);
		System.out.println(source);
		 File dest = new File("C:\\Users\\user\\Downloads\\SelinumFiles\\ScreenShotss\\myfile4.png");
		 FileHandler.copy(source, dest);

		driver.switchTo().frame("iframe-name");
		driver.findElement(By.xpath("//h3[contains(text(),'For')]")).getText();
		Thread.sleep(100);
		
		String mytext = driver.findElement(By.xpath("//h3[contains(text(),'For')]")).getText();
		Thread.sleep(100);
		System.out.println(mytext);
		Thread.sleep(100);
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//h1[contains(text(),'Welcome To Practice')]"));
		WebElement mytext2 = driver.findElement(By.xpath("//h1[contains(text(),'Welcome To Practice')]"));
		mytext2.getText();
		System.out.println(mytext2.getText());
		File source1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Thread.sleep(100);
		System.out.println(source1);
		 File dest2 = new File("C:\\Users\\user\\Downloads\\SelinumFiles\\ScreenShotss\\myfile3.png");
		 FileHandler.copy(source1, dest2);
	 
	 
		

	}

}
