package para.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class Para_Login_page 
{
  public static WebDriver driver;
	
	   By username=By.name("username");
	   By password=By.name("password");
	   By login=By.xpath("//*[@id='loginPanel']/form/div[3]/input");
	   By logout=By.partialLinkText("Log Out");
	   

   public Para_Login_page(WebDriver driver)
   {
		   this.driver=driver;
   }
	       
   public void enterUsername()
   {
	   driver.findElement(username).sendKeys("tri");
   }
   
   public void enterPassword()
   {
	   driver.findElement(password).sendKeys("tri123");
   }
   
   public void logInButton() throws InterruptedException
   {
	   driver.findElement(login).click();
	   Thread.sleep(3000);
	   driver.findElement(logout).click();
	   Thread.sleep(3000);
	   driver.close();
   }

}
