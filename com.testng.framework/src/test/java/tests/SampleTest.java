package tests;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.Test;


@Test (groups = {"AllTests"})
public class SampleTest {
	WebDriver driver = null;
	
//	@Test(groups = { "sanity" })
//
//	public void T1() {
//		//System.setProperty("webdriver.gecko.driver", "/Users/malalaifarivar/Downloads/geckodriver");
//		driver= new SafariDriver();
//		driver.get("https://www.facebook.com");
//		System.out.println("Test 1 sanity | " + Thread.currentThread().getId());
//	}

//	@Test(groups = { "sanity", "smoke" })
//
//	public void T2() {
//		
//		System.setProperty("webdriver.gecko.driver", "/Users/malalaifarivar/Downloads/geckodriver");
//		driver = new FirefoxDriver();	
//		driver.get("https://www.google.com");
//		System.out.println("Test 2 sanity and smoke | " + Thread.currentThread().getId());
//	}

	@Test(groups = { "regression", "smoke" })
	

	public void T3() {
		System.setProperty("webdriver.gecko.driver", "/Users/malalaifarivar/Downloads/geckodriver");
		driver = new FirefoxDriver();
		driver.get("https://www.youtube.com");

		System.out.println("Test 3 smoke and reg | " + Thread.currentThread().getId());
	}

	@Test

	public void T4() {
		System.setProperty("webdriver.gecko.driver", "/Users/malalaifarivar/Downloads/geckodriver");
		System.out.println("Test 4 no groups | " + Thread.currentThread().getId());
	}

}
