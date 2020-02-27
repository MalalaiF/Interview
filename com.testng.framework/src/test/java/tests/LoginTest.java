package tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import core.Base;
import pageObjects.LoginPageObject;
import utilities.ExcelUtility;




public class LoginTest extends Base {
	LoginPageObject loginpage;
	
	@BeforeMethod
	public void setUp() {
		Base.initializeDriver();

	}
	
	@Test(dataProvider = "getMyData")
	public void loginToCanvasTest(String userName, String password){
		loginpage = new LoginPageObject();
		System.out.println(loginpage.pageTitle());
		loginpage.clickOnLoginToClassLink();
		System.out.println(driver.getTitle());
		System.out.println("this is test");
		
		loginpage.LoginToCanvas(userName, password);
	}
	@DataProvider()
	public Object [][] getMyData(){
		Object myData[][] = ExcelUtility.getData("Canvas");
		return myData;
	} 
	
	
	@Test(enabled = false)
	public void loginToTestEnvironmentTest(){
		loginpage = new LoginPageObject();
		System.out.println(loginpage.pageTitle());
		loginpage.clickOnLoginToClassLink();
		System.out.println(driver.getTitle());
		System.out.println("this is test");
	}
	
	
	@AfterMethod
	public void tearDown() {
		
		Base.teardown();
		System.out.println("this is @AfterMethod");
	}

}
