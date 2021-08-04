package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage 
{
	public WebDriver driver;
	 
	
    
	By click_Agree = By.xpath("//*[@id=\"root\"]/div[2]/div[2]/div/div/section/div/button[1]");
	By click_Menu = By.xpath("//*[@id=\"root\"]/div[2]/header/div/div[1]/button[1]/img");
	By click_Login_Link = By.xpath("//*[@id=\"root\"]/div[2]/section/div/div[1]/div[2]/button[2]/span");
	By get_Title = By.xpath("//*[@id=\"root\"]/div[2]/div/section/div/div/span");
    
    public HomePage(WebDriver driver) {
		this.driver=driver;
	}
	public WebElement clickAgreeButton()
    {
    	return driver.findElement(click_Agree);
    }
    public WebElement clickHamburgerMenu()
    {
    	return driver.findElement(click_Menu);
    }
    public WebElement clickLoginLink()
    {
    	return driver.findElement(click_Login_Link);
    }
	public WebElement getTitle() {
		
		return driver.findElement(get_Title);
	}
}
