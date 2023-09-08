package manager;

import org.openqa.selenium.WebDriver;

import pageobjects.DashBoardPage;
import pageobjects.LoginPage;
import pageobjects.ProgramPage;

public class PageObjectManager {
	
	private WebDriver driver;
	private LoginPage loginPage;
	private DashBoardPage dashboardPage;
	private ProgramPage programPage;
	
	//constructor
	public PageObjectManager(WebDriver driver)
	{
		this.driver=driver;
	}
	
	//singleton design pattern
	public LoginPage getLoginPage()
	{
		if(loginPage==null)
		{
			loginPage = new LoginPage(driver);
		}
		return loginPage;
	}
	
	public DashBoardPage getdashboardPage()
	{
		if(dashboardPage==null)
		{
			dashboardPage = new DashBoardPage(driver);
		}
		return dashboardPage;
	}
	
	public ProgramPage getProgramPage()
	{
		if(programPage==null)
		{
			programPage = new ProgramPage(driver);
		}
		return programPage;
	}
	

}
