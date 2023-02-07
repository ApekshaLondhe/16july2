package screnshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class Scrrenshot_example1 {

	public static void main(String[] args) throws InterruptedException, IOException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\SelinumFiles\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://vctcpune.com/");
	Thread.sleep(100);
	 String random=RandomString.make(3);
	 File sorce = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
     System.out.println(sorce);
     File Destination=new File("C:\\Users\\user\\Downloads\\SelinumFiles\\ScreenShotss\\myfile"+random+".png" );
     
     FileHandler.copy(sorce, Destination);
     
//=============================================================================================     
     File Sorce1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
     System.out.println(Sorce1);
     File Destination2=new File("C:\\Users\\user\\Downloads\\SelinumFiles\\ScreenShotss\\myfile.");
     
     FileHandler.copy(Sorce1, Destination2);
     driver.close();
     Thread.sleep(100);
 
     
     
     
     
     
     
     
     
     
     
     
     
     
	}

}
