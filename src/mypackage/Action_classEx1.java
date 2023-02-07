package mypackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action_classEx1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Downloads\\SelinumFiles\\chromedriver_win32\\chromedriver.exe" );
	     WebDriver driver=new ChromeDriver();	
		
		driver.get("https://www.googleadservices.com/pagead/aclk?sa=L&ai=DChcSEwiGtL6mmYn7AhVkk2YCHY4KBiQYABAAGgJzbQ&ohost=www.google.com&cid=CAESa-D28xEiKWqWLLvejvM_rD7XxHA-_h-siKkUTG7RVRnKNVl1TvFBeCswlPusY5jxzmT5kERBU0-la6XFWpMgEeaJQ79uy6At780zd25NRwd2xRgbrxFT3vPAMWyj1bceDSUOGXvudq63UEJ_&sig=AOD64_1l1wS83Vy1453JXk7bJqHLEdzvZw&q&adurl&ved=2ahUKEwjVi7immYn7AhVL9DgGHYEsChYQ0Qx6BAgJEAE");
		
		
		Actions act=new Actions(driver);
		
//1)movetoelement() method of action class
		WebElement best = driver.findElement(By.xpath("(//a[text()=\"Best Sellers\"])[1]"));
		act.moveToElement(best).perform();
		
	    WebElement mobile = driver.findElement(By.xpath("//a[text()=\"Mobiles\"]"));
		
//2)click() method of action class
	    // act.click().perform();
	    
	    //1)FIRST WAY
	   // act.moveToElement(mobile).click().build().perform();
	    
	    //2)3rd way
	   // act.moveToElement(mobile).perform();
	   // act.click().build().perform();
	    	    
	    //3)second way
	  //  act.click(mobile).perform();
	    
//doubleclick() method of action class
	    
WebElement doubleclick = driver.findElement(By.xpath("//a[@id=\"nav-hamburger-menu\"]"));
	    
	//act.doubleClick().perform();
//first way
//act.moveToElement(doubleclick).doubleClick().build().perform();
		
//second way
//act.moveToElement(doubleclick).perform();
//Thread.sleep(500);
//act.doubleClick().perform();

//3rd way		
//act.click(doubleclick).perform();
		
//contextclick() method of action class--->means-->right click

   WebElement contaxtclick = driver.findElement(By.xpath("(//a[@class=\"nav-a  \"])[4]"));
	
	//first way
  // act.moveToElement(contaxtclick).contextClick().build().perform();
		
	//second way
  // act.moveToElement(contaxtclick).perform();
 // act. contextClick().build().perform();	
		
	//3rd way
   act.contextClick(contaxtclick).perform();
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
