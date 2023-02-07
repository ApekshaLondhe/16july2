package upStock_loginwith_excel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UpStock_fundpage1 {
	@FindBy(xpath = "((//div[@class=\"_2Bthrplw1VYHfLzzQv0asZ\"])[1]//div)[3]")private WebElement myfunds;
	@FindBy(xpath = "((//div[@class=\"_3GCY3U-TwoRanbb3LgPm5-\"])[2]//div)[6]")private WebElement reviv;
	
	   public UpStock_fundpage1(WebDriver driver)
	   {
		   PageFactory.initElements(driver, this);
	   }
	   
	   public void getmyfunds()
	   {
		 String get = myfunds.getText();
		 System.out.println(get);
	   } 
	   public void getmyriviev9()
	   {
		   String re = reviv.getText();
		   System.out.println(re);
	   }

}
