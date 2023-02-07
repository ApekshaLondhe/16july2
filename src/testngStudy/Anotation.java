package testngStudy;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Anotation {
  @Test
  public void f() {
	  Reporter.log("@test anotation RUN", true);
  }
  @Test
  public void G() {
	  Reporter.log("@test G anotation RUN", true);
  }
  @BeforeMethod
  public void beforeMethod() {
	  Reporter.log("@BeforeMethod anotation", true);
  }

  @AfterMethod
  public void afterMethod() {
	  Reporter.log("@afterMethod anotation", true);
  }

  @BeforeClass
  public void beforeClass() {
	  Reporter.log("@beforeClass anotation", true);
  }

  @AfterClass
  public void afterClass() {
	  Reporter.log("@afterClass anotation", true);
  }

  @BeforeTest
  public void beforeTest() {
	  Reporter.log("@Beforetest anotation", true);
  }

  @AfterTest
  public void afterTest() {
	  Reporter.log("@aftertest anotation", true);
  }

  @BeforeSuite
  public void beforeSuite() {
	  Reporter.log("@beforeSuite anotation", true);
  }

  @AfterSuite
  public void afterSuite() {
	  Reporter.log("@Aftersuit anotation", true);
  }

}
