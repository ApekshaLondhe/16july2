package upStock_loginwith_excel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Upstock_passcodepage {
	
	
	
	
	@FindBy(name = "yob")private WebElement passcode;
	
	
	 public Upstock_passcodepage(WebDriver driver)
	 {
		 PageFactory.initElements(driver, this);
	 }
	 
	
	public void passcode(String ps)
	{
		passcode.sendKeys(ps);
	}

}
