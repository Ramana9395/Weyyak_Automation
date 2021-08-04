package test_Cases;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.HomePage;
import resources.base;

public class ValidateTitle extends base{
	
	public WebDriver driver;
	private static Logger logger =LogManager.getLogger();
	@BeforeTest
	public void intialize() throws IOException
	{
		driver = initializeDriver();
		logger.info("Driver is intialized");
		driver.get(prop.getProperty("app_url"));
		logger.info("Navigated to Homepage");
	}
		
	@Test
	public void validateAppTitle() throws IOException
	{
		
		//one is inheritance
		// creating object to that class and invoke methods of it
		//Homepage Test
				HomePage homepage = new HomePage(driver);
				homepage.clickAgreeButton().click();
				logger.info("Clicked Agree Button Successfully");
				homepage.clickHamburgerMenu().click();
				logger.info("Clicked Hamburger Menu Successfully");
				homepage.clickLoginLink().click();
				logger.info("Clicked Login Link Successfully");
		//compare the text from the browser with actual text.- Error..
		Assert.assertEquals(homepage.getTitle().getText(),"SIGN IN");
		 logger.info("Successfully validated Text message");
		 System.out.println("Validate Title Test completed");
		
	}
	
	@AfterTest
	public void teardown()
	{
		driver.close();
	}

}
