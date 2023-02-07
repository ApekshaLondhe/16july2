package framework_practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_PAGE {
	
	@FindBy(xpath = "//input[@id=\"email\"]")  private WebElement Username;
	@FindBy(xpath = "//input[@name=\"pass\"]")public  WebElement password;
	@FindBy(xpath = "//button[@name=\"login\"]") public  WebElement loginbutton;
	
	
	public Login_PAGE(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void sendkeyusername()
	{
		Username.sendKeys("7507665995");
	}
	
	public void sendkeyspassword()
	{
		password.sendKeys("321946");
	}
	
	public void clickloginbuttion()
	{
		loginbutton.click();	
	}


	
}
