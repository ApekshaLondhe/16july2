package scroling;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrolling_into_view {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\SelinumFiles\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://vctcpune.com/selenium/practice.html");
		Thread.sleep(100);
		WebElement text = driver.findElement(By.xpath("//legend[text()=\"Switch To Alert Example\"]"));
	      //scrolling into view  
		 JavascriptExecutor view = (JavascriptExecutor)driver;
		 view.executeScript("arguments[0].scrollIntoView(true)", text);
        System.out.println("text is " +text.getText());
	}

}
