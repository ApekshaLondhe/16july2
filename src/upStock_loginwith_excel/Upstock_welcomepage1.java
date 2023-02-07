package upStock_loginwith_excel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Upstock_welcomepage1 {
	
	
	
	
	 @FindBy(xpath = "//div[text()=\"No, I’m good\"]")private WebElement imgoodbuttion;	
		
		public Upstock_welcomepage1(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
		
		public void clickimgoodbutton()
		{
			imgoodbuttion.click();
		}
		

}
