package upStock_loginwith_excel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Upstock_loginwithExcel {
	@FindBy(name = "userId")private WebElement userid;
	@FindBy(name = "password")private WebElement password;
	@FindBy(xpath = "//div[text()=\"Sign into Upstox\"]")private WebElement signupbutton;

	
	public Upstock_loginwithExcel(WebDriver driver)	
	{
		PageFactory.initElements(driver,this);
	}
	
	public void enteruserid(String UI)
	{
		userid.sendKeys(UI);
	}
	
	public void enterPASS(String PASS)
	{
		password.sendKeys(PASS);
	}
	
	public void ckickbuttion()
	{
		signupbutton.click();
	}
	
	
	

	}


