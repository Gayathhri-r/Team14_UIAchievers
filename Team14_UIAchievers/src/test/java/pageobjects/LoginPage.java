package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver driver;

	public LoginPage(WebDriver ldriver)
	{
		driver = ldriver;
		PageFactory.initElements(driver, this); //'this' to optimize our code instead of specifying each and every page
	}
	
	//locators
	@FindBy(id="username") WebElement txtUsername;
	@FindBy(id="password") WebElement txtPassword;
	@FindBy(xpath="//button[@id='login']") WebElement btnLogin;
	@FindBy(xpath="//a[href='Forgot Username or Password']") WebElement linkForgotUsernameOrPassword;
	@FindBy(xpath="//a[href='Forgot Username or Password']") WebElement resetPassword;
	
	//methods
	
	public void setLogin(String username, String password)
	{
		txtUsername.clear();
		txtUsername.sendKeys(username);
		txtPassword.clear();
		txtPassword.sendKeys(password);
	}
	
	public void clickLoginButton()
	{
		btnLogin.click();
	}
	
	public void clickLinkForgotUsernameOrPassword()
	{
		linkForgotUsernameOrPassword.click();
	}
	
	public void clickLinkResetPassword()
	{
		resetPassword.click();
	}
	
	//navigate to loginpage
	public String getUrl() 
	{
		return driver.getCurrentUrl();	
	}
}
