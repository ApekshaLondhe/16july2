package mypackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitel_and_geturlMethod {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\SelinumFiles\\chromedriver_win32\\chromedriver.exe");
    WebDriver driver=new ChromeDriver();
    driver.get("https://www.facebook.com/");
    Thread.sleep(1000);
    driver.manage().window().maximize();
    driver.getTitle();
    System.out.println(driver.getTitle());
    String Title = driver.getTitle();
    System.out.println("title is tile "+Title);    
    //get url method use
    driver.getCurrentUrl();
    String myurl = driver.getCurrentUrl();
    System.out.println("my url is "+myurl);
    
	}

}
