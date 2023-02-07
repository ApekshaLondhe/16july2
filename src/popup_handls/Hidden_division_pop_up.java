package popup_handls;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hidden_division_pop_up {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\SelinumFiles\\chromedriver.exe");
		 WebDriver driver= new ChromeDriver();
		 Thread.sleep(1000);
		 driver.get("https://www.flipkart.com/");
		 
		 driver.findElement(By.name("q")).sendKeys("vivo fhon");
		 	 
		 driver.findElement(By.xpath("(//div[@class=\"_2QfC02\"])/button[1]")).click();
		 
		 

	}

}
