package iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframeex3 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\SelinumFiles\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/nestedframes");
		
//nexted iframe example so we get the text of main page then		
		
		String text = driver.findElement(By.xpath("//div[text()=\"Nested Frames\"]")).getText();
		
		System.out.println("main page text "+text);
		
//then you get the text of prent freme but frist we chenge the selenium focus main page to parent freme		
		   driver.switchTo().frame("frame1");
	      String text2 = driver.findElement(By.xpath("//body[text()=\"Parent frame\"]")).getText();
		  System.out.println(text2);
				
		Thread.sleep(3000);
//then you get the text of chid freme but we need to change the focus of selenium then we than we change the 
		//focus of selenium prent freame to child freme
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@srcdoc=\"<p>Child Iframe</p>\"]")));
		Thread.sleep(3000);
		String text4 = driver.findElement(By.xpath("//p[text()=\"Child Iframe\"]")).getText();
		Thread.sleep(3000);
		System.out.println("text is "+text4);
		
//again you get text of main page than we need to focus of selenium on main page then you again chage the focus
		//of selenium child frame to main frame
		driver.switchTo().defaultContent();
		String text5 = driver.findElement(By.xpath("//div[text()=\"Elements\"]")).getText();
		System.out.println("text is "+ text5);
		
		
		
		
		
		
		
		
		
		
		
	}

}
