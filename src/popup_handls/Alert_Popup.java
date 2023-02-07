package popup_handls;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Alert_Popup {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\SelinumFiles\\chromedriver.exe");
		 WebDriver driver= new ChromeDriver();
		 Thread.sleep(1000);
		 driver.get("https://demoqa.com/alerts");
		 
		 driver.findElement(By.id("alertButton")).click();
		 
	//how to handle alert pop-up
		 //1)1 st create the alrt class object
	Alert alt=driver.switchTo()	.alert();
	
	//suppose u want to silenium alrt page text then
	alt.getText();
	System.out.println(alt.getText());
	Thread.sleep(1000);
	alt.accept();
		 
		 
		
		
		
		
		
		

	}

}
