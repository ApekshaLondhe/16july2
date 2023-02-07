package iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe_ex2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\SelinumFiles\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/");
		Thread.sleep(100);
		
	    WebElement text1 = driver.findElement(By.xpath("//a[@id='navbtn_references']"));
	    text1.getText();
		driver.switchTo().frame(text1);
		//Thread.sleep(1000);
	    
	    //WebElement test2 = driver.findElement(By.xpath("//a[contains(text(),'HTML Browser Support')]"));
	    //test2.getText();
	    //System.out.println(test2.getText());

	}

}
 
