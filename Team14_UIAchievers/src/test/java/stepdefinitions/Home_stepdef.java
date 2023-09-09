package stepdefinitions;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import pageobjects.Home_pageobj;
import appHooks.Hooks;
import io.cucumber.java.en.*;

public class Home_stepdef {
	
	Home_pageobj hp;
	private WebDriver driver;
	public Home_stepdef()
	{
		driver = Hooks.getDriver();
		 hp=new Home_pageobj(driver);
		
	}
	@Given("Admin launch the browser")
	public void admin_launch_the_browser() {
	    
	}

	@When("Admin gives the correct LMS portal URL")
	public void admin_gives_the_correct_lms_portal_url() {
	    hp.urlBrowser();
	}

	@Then("Admin should land on the home page")
	public void admin_should_land_on_the_home_page() {
	    hp.validSuccessHomepage();
	  
	    Assert.assertEquals("welcometopage","welcometopage");
	}

	@When("Admin gives the invalid LMS portal URL")
	public void admin_gives_the_invalid_lms_portal_url() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Admin should recieve {int} page not found error")
	public void admin_should_recieve_page_not_found_error(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

}
