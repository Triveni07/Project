package para.Stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import para.baseclass.ParaBankBaseClass;
import para.pages.Para_Login_page;

public class Para_Login extends ParaBankBaseClass
{
	Para_Login_page lg;
	
	
	  @Given("^the user launch the chrome browser$") 
	  public void
	  the_user_launch_the_chrome_browser() throws Throwable { // Write code here  that turns the phrase above into concrete actions 
		  launchBrowser("chrome");
		  lg=new Para_Login_page(driver);
		  }
	  
	  @When("^the user open the Parabankpage$") 
	  public void  the_user_open_the_Parabankpage() throws Throwable { // Write code here that turns the phrase above into concrete actions 
	  getUrl();
	  
	  }
	 
	@Then("^enter username$")
	public void enter_username() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    lg.enterUsername();
	}

	@And("^enter password$")
	public void enter_password() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   lg.enterPassword();
	}

	@And("^click login button$")
	public void click_login_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    lg.logInButton();
	}
}
