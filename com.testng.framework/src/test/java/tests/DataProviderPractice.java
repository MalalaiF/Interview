package tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import utilities.ExcelUtility;

public class DataProviderPractice {
	
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("@BeforeMethod");
	}
	//dataProvider = dataprovider's Method Name
	@Test (dataProvider = "getData")
	public void dataProviderTest(String userName, String password) {
		System.out.println("UserName::  "+userName);
		System.out.println("Password:: " +password);
		
	}
	
	@DataProvider()
	public Object [][] getData(){
		Object data[][] = ExcelUtility.getData("Sheet1");
		return data;
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("@AfterMethod");
	}

}
