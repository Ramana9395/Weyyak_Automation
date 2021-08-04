package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage 
{
	public WebDriver driver;
	
	By emailTextBox = By.xpath("//input[@name='email']");
	By passwordTextBox = By.xpath("//input[@name='password']");
	By continueButton = By.xpath("//*[@id=\"root\"]/div[2]/div/section/div/div/div[1]/div[1]/div[2]/button/span");

	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public WebElement setEmail()
	{
		return driver.findElement(emailTextBox);
	}
	
	public WebElement setPassword()
	{
		return driver.findElement(passwordTextBox);
	}
	
	public WebElement clickContinueButton()
	{
		return driver.findElement(continueButton);
	}
	
	
}
