package upStock_Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UpStock_Welcomepage {

  @FindBy(xpath = "//div[text()=\"No, I’m good\"]")private WebElement imgoodbuttion;	
	
	public UpStock_Welcomepage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickimgoodbutton()
	{
		imgoodbuttion.click();
	}
	
	
}
