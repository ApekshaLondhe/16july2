package web_Table_reading;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Total_Rows {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Downloads\\SelinumFiles\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.get("https://vctcpune.com/selenium/practice.html");
		Thread.sleep(100);
		
		JavascriptExecutor Js = (JavascriptExecutor)driver;
		Thread.sleep(1000);
		Js.executeScript("window.scrollBy(0,1200)");
		
		//how many rows in table
		
		List<WebElement> tatalRows = driver.findElements(By.xpath("//table[@id=\"product\"]//TR"));
		
		tatalRows.size();
		System.out.println("Total rows in table "+tatalRows.size());
		
		
		//HOW TO GET TABAL HEADEAR
		List<WebElement> totalth = driver.findElements(By.xpath("((//table[@id=\"product\"]//TR[1])/TH)"));
		totalth.size();
		System.out.println("total head is "+totalth.size());
		

	}

}
