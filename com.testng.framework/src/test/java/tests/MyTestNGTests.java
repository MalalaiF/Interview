package tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import core.Base;
import pageObjects.ObjectsForTestNG;
import utilities.ExcelUtility;

public class MyTestNGTests extends Base{
	
	ObjectsForTestNG myObject = new ObjectsForTestNG();
	
	@BeforeMethod
	public void setUp() throws InterruptedException {
		Base.initializeDriver();
		System.out.println("@BeforeMethod");
		

	}
	
	@Test(dataProvider = "getMyData", enabled = false)
	public void registerMe(String fName, String lName , String email,String password, String confPass,
			String yesOrNo) {
		
		ObjectsForTestNG myObject = new ObjectsForTestNG();// ---NullPointException
		myObject.clickOnTestEnvironmentLink();
		myObject.clickOnMyAccount();
		myObject.clickonRegister();
		myObject.fNameLName(fName, lName);
		myObject.passConfirmPass(password, confPass);	
		myObject.subscribeRadioButton(yesOrNo);
		myObject.clickOnContinue();  
	}
	
	
	@Test(dataProvider = "getMyData")
	public void loginToAccount(String email, String password) {
	ObjectsForTestNG myObject = new ObjectsForTestNG();
	myObject.clickOnTestEnvironmentLink();
	myObject.clickOnMyAccount();
	myObject.loginToAccount(email, password);
	}
	@DataProvider()
	public Object [][] getMyData(){
		Object myData[][] = ExcelUtility.getData("Login");
		return myData;
	} 
	
	@AfterMethod
	public void tearDown() {
		
		Base.teardown();
		System.out.println("@AfterMethod");
	}

}
