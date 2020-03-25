package para.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import para.baseclass.ParaBankBaseClass;

public class Para_Registartion_page {
	
	  public static  WebDriver driver;
	   
	   By register=By.xpath("//*[@id='loginPanel']/p[2]/a");
	   By firstname=By.id("customer.firstName");
	   By lastname=By.id("customer.lastName");
	   By address=By.name("customer.address.street");
	   By city=By.id("customer.address.city");
	   By state=By.name("customer.address.state");
	   By zipcode=By.name("customer.address.zipCode");
	   By phoneNo=By.xpath("//*[@id='customer.phoneNumber']");
	   By SSN=By.id("customer.ssn");
	   By username=By.xpath("//table[@class='form2']//tbody//tr[10]//input");
	   By password=By.id("customer.password");
	   By confirmpassword=By.id("repeatedPassword");
	   By registerButton=By.xpath("//*[@id='customerForm']/table/tbody/tr[13]/td[2]/input");
	   By logout=By.partialLinkText("Log Out");
	   
	 public Para_Registartion_page(WebDriver driver)
	 {
		 this.driver=driver;
	 }
	   
	   public void registrationOfCustomer()
	   {
		   driver.findElement(register).click();
		  driver.findElement(firstname).sendKeys("kfjksfjk");
		  driver.findElement(lastname).sendKeys("jnajkfb");
		  driver.findElement(address).sendKeys("Kphb colony 2nd line");
		  driver.findElement(city).sendKeys("hyderabad");
		  driver.findElement(state).sendKeys("Telangana");
		  driver.findElement(zipcode).sendKeys("522336");
		  driver.findElement(phoneNo).sendKeys("8523697415");
		  driver.findElement(SSN).sendKeys("1236549879");
		  driver.findElement(username).sendKeys("tri");
		  driver.findElement(password).sendKeys("tri123");
		  driver.findElement(confirmpassword).sendKeys("tri123");
	   }
	   
	   public void submitRegistration() throws InterruptedException
	   {
		   driver.findElement(registerButton).click();
		   Thread.sleep(3000);
		   //driver.findElement(logout).click();
		   //Thread.sleep(3000);
		   driver.close();
	   }

}
