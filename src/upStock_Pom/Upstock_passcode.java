package upStock_Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Upstock_passcode {
	
	@FindBy(name = "yob")private WebElement passcode;
	
	
	 public Upstock_passcode(WebDriver driver)
	 {
		 PageFactory.initElements(driver, this);
	 }
	 
	
	public void enterpasscode()
	{
		passcode.sendKeys("1995");
	}
	

}
