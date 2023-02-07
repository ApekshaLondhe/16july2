package webelement_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnable {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\SelinumFiles\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.googleadservices.com/pagead/aclk?sa=L&ai=DChcSEwjXzbWMi-r6AhWomWYCHbaRBYMYABABGgJzbQ&ohost=www.google.com&cid=CAESa-D2M4Q6-NxrDniIXEri4-3zXpwQfLnhoHKQRwCJoJUKKLRLL1KDnc2vNfQh41wvKkJscP_SJl5FuyKY43uce8dmPHL44DDvrUm8HOK-gqoClR2aLr17VH3UKbNzTSJBHdgHZthCxqer-TTW&sig=AOD64_379ucPBAaik8pwGVGpNo5qBeuOVQ&q&adurl&ved=2ahUKEwie76yMi-r6AhUXyDgGHZQBCmgQ0Qx6BAgJEAE");
        Thread.sleep(3000);
	    driver.findElement(By.xpath("(//h6[text()=\"Sign In\"])[2]")).click();
	    Thread.sleep(3000);
	    WebElement isenable = driver.findElement(By.xpath("//button[text()=\"Get OTP\"]"));
	    Thread.sleep(5000);
	   isenable.isEnabled();
	   Thread.sleep(6000);
		System.out.println(isenable.isEnabled());
		Thread.sleep(7000);
		driver.findElement(By.xpath("//input[@id=\"mobileNumber\"]")).sendKeys("9175846391");
		Thread.sleep(8000);
		isenable.isEnabled();
		System.out.println(isenable.isEnabled());
		
		//WebElement email = driver.findElement(By.xpath("//input[@id=\"mobileNumber\"]"));
		//Thread.sleep(5000);
		//email.sendKeys("91837887383");
		
		
		
		

	}

}
