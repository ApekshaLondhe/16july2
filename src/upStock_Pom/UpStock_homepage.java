package upStock_Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UpStock_homepage {
	
	
	@FindBy(xpath = "(//span[@class=\"_3YI_lRyLDAFhz2WE-6yGuX\"])[2]")private WebElement userId;
	
	@FindBy(id = "funds") private WebElement fundsbuttion; 
	
	@FindBy(xpath = "//div[text()=\"Logout\"]")private WebElement Logoutbuttion;

	
	

	public UpStock_homepage(WebDriver driver) {
		
		PageFactory.initElements(driver,this);
	}



	public void validateuserID()
	{
		   String actualuserId= userId.getText();
		   System.out.println(actualuserId);
		   String expecteduserid = "santosh p.";
		   if(actualuserId.equals(expecteduserid))
		   {
			   System.out.println("valid userid");
		   }
		   else {
			   System.out.println("invalid userid");
		   }
	}  
		   
		   
	public void clickfundbuttion()	   
	{
		
		fundsbuttion.click();
	}
	
	public void clicklogoutbuttion() throws InterruptedException
	{
		userId.click();
		Thread.sleep(2000);
		Logoutbuttion.click();
	}
	

}
