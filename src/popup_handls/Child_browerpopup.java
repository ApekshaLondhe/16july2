package popup_handls;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Child_browerpopup {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\SelinumFiles\\chromedriver.exe");
		 WebDriver driver= new ChromeDriver();
		 Thread.sleep(1000);
		 driver.get("https://skpatro.github.io/demo/links/");
		 driver.findElement(By.name("NewTab")).click();
		 
		 Thread.sleep(1000);
		String Mpageid = driver.getWindowHandle();
		System.out.println(Mpageid);
		
		Set<String> allpageid = driver.getWindowHandles();
		 System.out.println(allpageid);
		 System.out.println("===========================================");
		 
		Iterator<String> A2 = allpageid.iterator(); 
		
		while(A2.hasNext())
		{
			System.out.println(A2.next());
		}
		 System.out.println("===========================================");
		 
		 
		 
		 ArrayList<String> AL=new ArrayList(allpageid);
		 String CHILDWINDOW = AL.get(1);
		 System.out.println(CHILDWINDOW);
		 Thread.sleep(4000);
		 driver.switchTo().window(CHILDWINDOW);
		 Thread.sleep(1000);
		 driver.findElement(By.linkText("About me")).click();
		 
		 
		 
		 
		 

	}

}
