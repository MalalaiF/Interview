package tests;

import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGPractice {
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Start of SDET Aug 2019");
	}
	
	@Test(priority = 2)
	@Parameters({"url", "address", "date"})
	  public void tcOne(String url, String add, String date) {
		
		  System.out.println("URL: " + url);
		  System.out.println("Address: " + add);
		  System.out.println("Date: " + date);
	  }
	  
	  @Test (priority = 1, dependsOnMethods = {"tcOne"})
	  public void tcTwo() {
		  System.out.println("Test #2");
	  }
	  
	  @Test (priority = 3, enabled = false)
	  public void tcThree() {
		  System.out.println("Test #3");
	  }
	  
	  @AfterMethod
		public void afterMethod() {
			System.out.println("End of SDET is Jan 2020");

		}

}
