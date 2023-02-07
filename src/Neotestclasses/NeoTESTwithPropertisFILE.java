package Neotestclasses;

import org.testng.annotations.Test;

import Neostock_pom1.Password_page;
import Neostock_pom1.Sign_inneo;
import Neostock_pom1.Sign_up_page;
import Neostock_pom1.neoStock_popup;
import neoStock_base.Base;
import utility.Utility_Class;
import utility.Utility_newOne;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.io.IOException;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class NeoTESTwithPropertisFILE extends Base {
	Sign_up_page  login;
	Password_page pass;
	neoStock_popup popup; 
	Sign_inneo sign;
	
	@BeforeClass
	public void HitNEOurl() throws InterruptedException
	{
	//1)call the method for lounching browesr from base class	
		lonchUrl();
	//then creating object of all pom class of neoStock
		login=new Sign_up_page(driver);
		 pass=new Password_page(driver);
		 popup=new neoStock_popup(driver);
		 sign = new Sign_inneo (driver);		
	}
	
	@BeforeMethod
	public void logInNEO() throws IOException, InterruptedException
	{
		sign.ClickSign(driver);
		//CALL method for loginNEOSTOCK CALLthe method from pom signUp_page class
		login.EntermobileNumber(driver,Utility_newOne.readDataFromPropertisFILE("mobileNumber"));
		Thread.sleep(2000);
		pass.EnterPassword(driver,Utility_newOne.readDataFromPropertisFILE("password") );
		pass.clickSubmitButtion(driver);
		popup.clickOkpopup(driver);
		popup.clickOkClose(driver);
	}		
  @Test
  public void VALIDATEUID() throws IOException {
	  
	  Assert.assertEquals(popup.Getactual_useri(), Utility_newOne.readDataFromPropertisFILE("username"),"Both are not match then test case fail");
	  Utility_newOne.takeSC(driver, "VALIDUID");
  }
  @Test
  public void VLIDATEACBALNCE() throws IOException
  {
	  Assert.assertEquals(popup.Getactual_ACbalnce(), Utility_newOne.readDataFromPropertisFILE("ACbalnce"),"both are not match test case is fail");
	  Utility_newOne.takeSC(driver, "validACbalnce");
  }
  
  @AfterMethod
  public void logoutNeo()
  {
	  popup.logoutNeo(driver);
  }
  @AfterClass
  public void closeNeo()
  {
	  driver.close();
  }
  

}
