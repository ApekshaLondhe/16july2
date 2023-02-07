package assignMent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\SelinumFiles\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			
			driver.get("https://vctcpune.com/");
			Thread.sleep(500);
			//driver.close();
			//driver.quit();
			//driver.manage().window().maximize();
           //driver.manage().window().minimize();
			
			//String tital = driver.getTitle();
			//System.out.println("tital is "+ tital);
			
			// String url = driver.getCurrentUrl();
			// System.out.println(url);
			
			//if(tital.equals(tital))
			//{
				//System.out.println("test case pass");
			//}
			//else {
				//System.out.println("test case fail");
			//}
			
	}

}
