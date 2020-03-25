package para.Stepdefinition;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import para.baseclass.ParaBankBaseClass;
import para.pages.Para_Admin_page;
import para.pages.Para_Bill_page;

public class Para_Admin extends ParaBankBaseClass
{
	Para_Admin_page pa;
	
	@Given("^the user launch the chromebrowser$")
	public void the_user_launch_the_chromebrowser() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		launchBrowser("chrome");
		pa= new Para_Admin_page(driver);
	}

	@When("^the user open the Parabank Homepage$")
	public void the_user_open_the_Parabank_Homepage() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    getUrl();
	}

	@Then("^the user select the Admin Page$")
	public void the_user_select_the_Admin_Page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   pa.selectAdminpage();
	}

	@And("^the user submits the Administration Page$")
	public void the_user_submits_the_Administration_Page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    pa.submitAdministration();
	}


}
