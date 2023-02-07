package assignMent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sens_send_withjavaScript {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\SelinumFiles\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
//one more option of sendkeys with help of javascript we can send value how let see
		//1)first typescast u r driver intonjavasciptexcuter interface
		WebElement enter = driver.findElement(By.name("email"));
		JavascriptExecutor sendkeys = (JavascriptExecutor)driver;
		sendkeys.executeScript("arguments[0].value='9175846391';", enter);

	}

}
