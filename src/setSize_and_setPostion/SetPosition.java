package setSize_and_setPostion;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetPosition {

	public static void main(String[] args) throws InterruptedException    {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\SelinumFiles\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://vctcpune.com/selenium/practice.html");
		Thread.sleep(100);
		driver.manage().window().getPosition();
		Point postion = driver.manage().window().getPosition();
		System.out.println(postion);
//create object of point class
		Point p=new Point(10, 30);
		driver.manage().window().setPosition(p);
		System.out.println(p);
	}

}
