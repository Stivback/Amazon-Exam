package tests.amazonTest;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import selenium.DriverSetup;


public class AmazonTest {

	@BeforeClass(alwaysRun = true)
	public void setupClass()
	{
	
	}
	
	@BeforeMethod(alwaysRun = true)
	public void setupTest()
	{

	}

	@Parameters()
	@Test(description = "Test Description")
	public void groupSetup() throws Exception{
		WebDriver driver = DriverSetup.setupDriver(DriverSetup.Browser.Chrome, "chromedriver 3");
		driver.get("https://www.amazon.com");
	}
	
	@AfterMethod(alwaysRun = true)
	public void tearDownTest()
	{

	}
	
	@AfterClass(alwaysRun = true)
	public void tearDownClass()
	{

	}
}
