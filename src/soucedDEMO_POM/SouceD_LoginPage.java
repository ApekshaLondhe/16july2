package soucedDEMO_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SouceD_LoginPage {

	
	@FindBy(id = "user-name")private WebElement Username;
	
	@FindBy(id="password")private WebElement Password;
	
	@FindBy(name = "login-button") private WebElement loginButton;
	
	
	public SouceD_LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void EnterUsername(String username)
	{
		Username.sendKeys(username);
	}
	public void EnterPWD(String PWD)
	{
		Password.sendKeys(PWD);
	}
	
	public void clickLoginButton()
	{
		loginButton.click();
	}
	
}
