package listBox_Dropdown;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import commalyMethodUse.Java_comman_Methods;

public class DropdownEX3 {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\SelinumFiles\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.get("https://demoqa.com/select-menu");
	     WebElement mdrop = driver.findElement(By.xpath("//select[@name=\"cars\"]"));
	     Select S=new Select(mdrop);
	     System.out.println("Dropdown is multiselected "+S.isMultiple());
	     
	     S.selectByIndex(0);
	     S.selectByValue("saab");
	     S.selectByVisibleText("Opel");
	     S.selectByIndex(3);
	     System.out.println("DROPDOWN IS MULTISLECTED "+S.getFirstSelectedOption().getText());
System.out.println("===============================================================================");	    
	    
	    S.deselectByIndex(0);
	    S.deselectAll();
	    Java_comman_Methods.Scrollintoview(driver, mdrop);
	   // Java_comman_Methods.takeshreenshot(driver, "aps1");
	    Java_comman_Methods.waitmethod(driver, 1000);
	    
	   List<WebElement> as = S.getAllSelectedOptions();
	   as.size();
	   System.out.println(as.size());
	   System.out.println("===============================================================");
	   
	   mdrop.getText();
	   System.out.println(mdrop.getText());
	    
	}

}
