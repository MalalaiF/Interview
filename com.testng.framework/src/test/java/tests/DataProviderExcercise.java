package tests;

import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import utilities.ExcelUtility;

public class DataProviderExcercise {
	
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("-------------------------------@BeforeMethod");
	}
	
	
	@Test (dataProvider = "getMyData")
	public void dProvider(String city, String state, String zipcode) {
		System.out.println("City---------" + city);
		System.out.println("State---------" + state);
		System.out.println("ZipCode---------" + zipcode);
		
	}
	
	@DataProvider()
	public Object [][] getMyData(){
		Object myData[][] = ExcelUtility.getData("TestDataSheet");
		return myData;
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("--------------------------------@AfterMethod");
	}
	
}
