package upStock_Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class Up_upstocktest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\SelinumFiles\\chromedriver.exe");
		 WebDriver driver= new ChromeDriver();
		 Thread.sleep(1000);
		 driver.get("https://login-v2.upstox.com/");
		 Thread.sleep(1000);
		 
		 UpstockLogin_Page login=new UpstockLogin_Page(driver);
		 
		 login.senduserid();
		 
		 login.sendpassword();
		 
		 login.clickbuttion();
		 
		 
		 Thread.sleep(1000);
		 Upstock_passcode pass=new Upstock_passcode(driver);
		 Thread.sleep(1000);
		 pass.enterpasscode();
		 
		 
		 Thread.sleep(4000);
		 UpStock_Welcomepage buttion=new UpStock_Welcomepage(driver);
		 Thread.sleep(5000);
		 
		 buttion.clickimgoodbutton();
		 Thread.sleep(2000);
		 UpStock_homepage NAME=new UpStock_homepage(driver);
		 Thread.sleep(2000);
		 
		 NAME.validateuserID();
		 Thread.sleep(2000);
		 NAME.clickfundbuttion();
		 
		 Thread.sleep(2000); 
		 UpStock_fundspage funds1=new UpStock_fundspage(driver);
		 Thread.sleep(2000);
		 funds1.gettextofooo();
		 
		 Thread.sleep(2000);
		 NAME.clicklogoutbuttion();
		 
		 
		 
		 
	}

}
