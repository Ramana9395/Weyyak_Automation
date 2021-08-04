package test_Cases;


import org.testng.annotations.Test;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import pages.HomePage;
import pages.LoginPage;
import resources.base;

public class HomepageTest extends base
{
	public WebDriver driver;
	private static Logger logger = LogManager.getLogger();
	@BeforeTest
	public void intialize() throws Exception
	{
		driver = initializeDriver();
		logger.info("Driver is intialized");
		driver.get(prop.getProperty("app_url"));
		logger.info("Navigated to Homepage");
		
	}
	@Test(dataProvider = "getData")
	public void homePageNavigation(String username,String password) throws IOException
	{
		
		//Homepage Test
		HomePage homepage = new HomePage(driver);
		homepage.clickAgreeButton().click();
		logger.info("Clicked Agree Button Successfully");
		homepage.clickHamburgerMenu().click();
		logger.info("Clicked Hamburger Menu Successfully");
		homepage.clickLoginLink().click();
		logger.info("Clicked Login Link Successfully");
		
		//Loginpage Test
		LoginPage loginpage = new LoginPage(driver);
		logger.info("Successfully Validated");
		loginpage.setEmail().sendKeys(username);
		loginpage.setPassword().sendKeys(password);
		loginpage.clickContinueButton().click();
		logger.info("Login Successfully");
		 System.out.println("Homepage Test completed");
		
	}
	
	@DataProvider
	public Object[][] getData()
	{
		Object[][] data = new Object[1][2];
		data[0][0] = "testproduct@mailnesia.com";
		data[0][1] = "12345678";
		//data[0][2] = "Subscribed User";
		
		/*data[1][0] = "etisalat2@mailnesia.com";
		data[1][1] = "12345678";
		data[1][2] = "Un-Subscribed User";*/
		return data;
	}
	@AfterTest
	public void quitBrowser()
	{
		driver.close();
	}
}
