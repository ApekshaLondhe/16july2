package upStock_Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UpStock_fundspage {
	
	@FindBy(xpath = "((//div[@class=\"_2Bthrplw1VYHfLzzQv0asZ\"])[1]//div)[3]")private WebElement myfunds;
	
	
   public UpStock_fundspage(WebDriver driver)
   {
	   PageFactory.initElements(driver, this);
   }
   
   public void gettextofooo()
   {
	 String get = myfunds.getText();
	 System.out.println(get);
	 
   }
   
   
   
   
	
	
	
	
	
}
