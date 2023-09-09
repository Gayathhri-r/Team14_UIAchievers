package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_pageobj {
	
	WebDriver driver;
	public Home_pageobj(WebDriver driver)
	 {
	  this.driver = driver;
	  PageFactory.initElements(driver, this);
//	  acts= new Actions(driver);
	 }
	
	@FindBy(xpath="//button[@id='login']") WebElement btnLogin;
	
	public void urlBrowser()
	{
		driver.get("https://example.com/login");
	}
	
	public void validSuccessHomepage()
	{
		
	}
}
