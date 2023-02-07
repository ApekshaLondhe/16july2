package screnshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Example2 {

	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\SelinumFiles\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		Thread.sleep(100);
		driver.get("https://vctcpune.com/");
		 //driver.switchTo().frame("courses-iframe");
		Thread.sleep(100);	
		
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Thread.sleep(100);
		System.out.println(source);
		 File dest = new File("C:\\Users\\user\\Downloads\\SelinumFiles\\ScreenShotss\\myfile5.png");
		 FileHandler.copy(source, dest);
		 Thread.sleep(100);
		

		 

	}


	
		
	}


