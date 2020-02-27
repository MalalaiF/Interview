package tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class dependsOnMethod {
	
	@Test(priority = 5, enabled = false)
	  public void tcOne() {
		  System.out.println("Test #1");
	  }
	  
	  @Test (priority = 4)
	  public void tcTwo() {
		  System.out.println("Test #2");
	  }
	  
	  @Test (priority = 3)
	  public void tcThree() {
		  System.out.println("Test #3");
	  }
	  @Test (priority = 1)
	  public void tcFour() {
		  System.out.println("Test #4");
		  
		  String actual = "TEK School";
		  String expected = "TEK School";
		  Assert.assertEquals(expected, actual);
	  }
	  
	  @Test (priority = 2,  dependsOnMethods = {"tcFour"})
	  public void tcFive() {
		  System.out.println("Test #5");
		  System.out.println("This is dependent on successful execution of method tcFour");
	  }

	  @BeforeMethod
	  public void beforeMethod() {
		  System.out.println("---------------->This is beforeMetod");
	  }

	  @AfterMethod
	  public void afterMethod() {
		  System.out.println("---------------->This is AfterMethod");
	  }

}
