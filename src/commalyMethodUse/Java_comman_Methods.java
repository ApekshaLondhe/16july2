package commalyMethodUse;


import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;

public class Java_comman_Methods {
	
	
	public static void takeshreenshot(WebDriver driver,String name) throws IOException {
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest=new File("C:\\Users\\user\\Downloads\\SelinumFiles\\ScreenShotss\\myScreenshot"+name+".png");
        FileHandler.copy(src, dest);
	}
	
	//comman method for Scrollinginto view
	 public static void Scrollintoview(WebDriver driver,WebElement Elements)
	 {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)", Elements);
	 }
	 
	 //comman method for wait
	 
	 public static void waitmethod(WebDriver driver,int wait)
	 {
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	 }
	 
	 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
