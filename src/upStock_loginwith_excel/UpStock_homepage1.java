package upStock_loginwith_excel;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import commalyMethodUse.Java_comman_Methods;

public class UpStock_homepage1 {
	
	
	
	
@FindBy(xpath = "(//span[@class=\"_3YI_lRyLDAFhz2WE-6yGuX\"])[2]")private WebElement userId;
	
	@FindBy(id = "funds") private WebElement fundsbuttion; 
	
	@FindBy(xpath = "//div[text()=\"Logout\"]")private WebElement Logoutbuttion;

	
	

	public UpStock_homepage1(WebDriver driver) {
		
		PageFactory.initElements(driver,this);
	}
	
	
	public void validateuserid(String expUN)
	{
		String actual = userId.getText();
		System.out.println(actual);
		
		if(actual.equals(expUN))
		{
			System.out.println("ACTUAL AND EXPECTED ARE MATCHING THEN TEST CASE IS PASS");
		}
		else {
			System.out.println("ACTUAL AND EXPECTED ARE NOT MATCHING THEN TEST CASE IS FILE");
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
			public String getActualUserid( WebDriver driver) throws IOException 
			{
				String actual = userId.getText();
				System.out.println(actual);
				Java_comman_Methods.Scrollintoview(driver, userId);
				Java_comman_Methods.takeshreenshot(driver, actual);
				return actual;
				
			}
		
		
		
	
}	
	


