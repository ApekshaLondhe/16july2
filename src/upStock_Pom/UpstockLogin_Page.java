package upStock_Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UpstockLogin_Page {
	
	
	@FindBy(name = "userId") private WebElement Username;
	@FindBy(name = "password")private WebElement password;
	@FindBy(xpath = "//div[text()=\"Sign into Upstox\"]")private WebElement signupbutton;
	
	public UpstockLogin_Page(WebDriver driver)
	{
	   PageFactory.initElements(driver,this );
		
	}
	
	public void senduserid(){
		Username.sendKeys("55BNWJ");	
		
	}
	public void sendpassword() {
		password.sendKeys("A27@santosh");
	}
	public void clickbuttion()
	{
		signupbutton.click();
		
	}
	
	
	
	
	
	
	

}
