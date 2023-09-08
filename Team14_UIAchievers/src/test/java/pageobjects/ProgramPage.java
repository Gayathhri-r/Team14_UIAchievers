package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class ProgramPage {

	//constructor
	public ProgramPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//locators
	
}
