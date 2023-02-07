package webelement_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelected {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\SelinumFiles\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		driver.findElement(By.xpath("//label[@for=\"radio1\"]"));
		WebElement option = driver.findElement(By.xpath("//label[@for=\"radio1\"]"));		
		option.isSelected();
		System.out.println(option.isSelected());
		Thread.sleep(500);
		// WebElement click1 = driver.findElement(By.xpath("//label[text()=\"Radio2\"]"));
		//Thread.sleep(500);
		//click1.click();
		//WebElement check = driver.findElement(By.tagName("//input[@id=\"checkBoxOption2\"]"));
		//Thread.sleep(500);
		//check.click();
		
		
		

	}

}
