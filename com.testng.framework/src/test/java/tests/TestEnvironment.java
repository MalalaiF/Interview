package tests;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import core.Base;
import pageObjects.ObjectsForTestNG;
import utilities.ExcelUtility;
import utilities.Utility;

public class TestEnvironment extends Base {

	ObjectsForTestNG myObject = new ObjectsForTestNG();

	@BeforeMethod
	/*
	 * intitializing the WebDriver
	 */
	public void setUp() throws InterruptedException {

		Base.initializeDriver();
		System.out.println("@BeforeMethod");

	}

	@Test(dataProvider = "getMyData")
	/*
	 * Method to login to TestEnviromnet using email and password
	 */
	public void loginToTestEnvironment(String email, String password) {
		ObjectsForTestNG myObject = new ObjectsForTestNG();
		myObject.clickOnTestEnvironmentLink();
		myObject.clickOnMyAccount();
		myObject.loginToAccount(email, password);
		try {
			Utility.screenshot(driver);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@DataProvider()
	/*
	 * Calling the DataProvider Utility Class
	 */
	public Object[][] getMyData() {
		Object myData[][] = ExcelUtility.getData("Login");
		return myData;
	}

	@AfterMethod
	public void tearDown() {
		Base.teardown();
		System.out.println("@AfterMethod");
	}

}
