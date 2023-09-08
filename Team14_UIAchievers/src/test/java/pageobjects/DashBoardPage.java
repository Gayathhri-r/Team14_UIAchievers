package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class DashBoardPage {

	public DashBoardPage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}

}
