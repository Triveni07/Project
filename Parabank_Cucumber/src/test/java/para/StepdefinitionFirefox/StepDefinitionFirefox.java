package para.StepdefinitionFirefox;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import para.baseclass.ParaBankBaseClass;
import para.pages.Para_Admin_page;
import para.pages.Para_Bill_page;
import para.pages.Para_Login_page;
import para.pages.Para_MessageToCustomerCare_page;
import para.pages.Para_Registartion_page;

public class StepDefinitionFirefox extends ParaBankBaseClass
{

	Para_Registartion_page register;	
	
	@Given("^the user launch the chrome application$")
	public void the_user_launch_the_chrome_application() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		launchBrowser("firefox");
		 register= new Para_Registartion_page(driver);
	}

	@When("^the user open the Parabank Registration page$")
	public void the_user_open_the_Parabank_Registration_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   getUrl();
	}

	@Then("^user gives the details$")
	public void user_gives_the_details() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    register.registrationOfCustomer();
	}

	@Then("^click on the Register button$")
	public void click_on_the_Register_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    register.submitRegistration();
	}

	
	Para_Login_page lg;
	
	
	  @Given("^the user launch the chrome browser$") 
	  public void
	  the_user_launch_the_chrome_browser() throws Throwable { // Write code here  that turns the phrase above into concrete actions 
		  launchBrowser("firefox");
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
	
	
	Para_Bill_page bp;
	@Given("^the user launch the chrome$")
	public void the_user_launch_the_chrome() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		launchBrowser("firefox");
		bp= new Para_Bill_page(driver);
	}

	@When("^the user open the Parabank Login Page$")
	public void the_user_open_the_Parabank_Login_Page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    getUrl();
	}

	@Then("^the user login to the account$")
	public void the_user_login_to_the_account() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    bp.customerLogin();
	}

	@And("^the user fills the details of the bill pay$")
	public void the_user_fills_the_details_of_the_bill_pay() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   bp.customerBillPay();
	}

	@And("^submit the bill pay$")
	public void submit_the_bill_pay() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    bp.submitBillPay();
	}

	
Para_MessageToCustomerCare_page mccp;
	
	@Given("^the user launchs the chrome browser$")
	public void the_user_launchs_the_chrome_browser() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		launchBrowser("firefox");
		mccp= new Para_MessageToCustomerCare_page(driver);
	}

	@When("^the user open the Parabank HomePage$")
	public void the_user_open_the_Parabank_HomePage() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    getUrl();
	}

	@Then("^the user opens the msg and fill the details$")
	public void the_user_opens_the_msg_and_fill_the_details() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    mccp.fillMessageDetails();
	}

	@And("^send the message to customer care$")
	public void send_the_message_to_customer_care() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   mccp.sendMessage();
	}

	
Para_Admin_page pa;
	
	@Given("^the user launch the chromebrowser$")
	public void the_user_launch_the_chromebrowser() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		launchBrowser("firefox");
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
