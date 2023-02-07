package sirially_parallalyExcution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ParrallyExcutionEx2 {
  
  @Test
  public void Login4() throws InterruptedException
  {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\SelinumFiles\\chromedriver.exe");
		 WebDriver driver= new ChromeDriver();
		 Thread.sleep(1000);
		 driver.get("https://neostox.com/");
		 Thread.sleep(1000);
		 Reporter.log("lonching the browser four", true);	 
  }



@Test
public void Login5() throws InterruptedException
{
  System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\SelinumFiles\\chromedriver.exe");
	 WebDriver driver= new ChromeDriver();
	 Thread.sleep(1000);
	 driver.get("https://neostox.com/");
	 Thread.sleep(1000);
	 Reporter.log("lonching the browser five", true);	 
}

@Test
public void Login6() throws InterruptedException
{
  System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\SelinumFiles\\chromedriver.exe");
	 WebDriver driver= new ChromeDriver();
	 Thread.sleep(1000);
	 driver.get("https://neostox.com/");
	 Thread.sleep(1000);
	 Reporter.log("lonching the browser six", true);	 
}

@Test
public void Login7() throws InterruptedException
{
  System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\SelinumFiles\\chromedriver.exe");
	 WebDriver driver= new ChromeDriver();
	 Thread.sleep(1000);
	 driver.get("https://neostox.com/");
	 Thread.sleep(1000);
	 Reporter.log("lonching the browser Sevan", true);	 
}
}


