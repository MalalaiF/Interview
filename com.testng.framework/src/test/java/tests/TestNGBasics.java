package tests;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class TestNGBasics {
  @Test (priority = 2)
  public void f() {
	  System.out.println("This is test #1");
  }
  
  @Test (priority = 1, enabled = false)
  public void ff() {
	  System.out.println("This is test #2");
  }
  
  @Test (priority = 0)
  public void fff() {
	  System.out.println("This is test #3");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("@BeforeMethod prints before each @Test");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("@AfterMethod prints after each @Test");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("@BeforeClass prints before class");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("@AfterClass prints after class");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("@BeforeTest runs only once before the first @Test");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("@AfterTest runs only once after the last @Test");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("@BeforeSuite");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("@AfterSuite");
  }

}
