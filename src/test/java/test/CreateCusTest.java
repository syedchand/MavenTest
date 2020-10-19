package test;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import pages.CreateCustomerPage;
import pages.LoginPage;

public class CreateCusTest extends BaseTest{
	
	WebDriver driver = BaseTest.driver;
	
	@Test
	public void createcustomer() throws Exception {
		
		LoginPage objLogin = new LoginPage(driver);
		CreateCustomerPage objCust = new CreateCustomerPage(driver);
		
		objLogin.login("mngr289192", "YgUqavY");
		objCust.createcustomer();
		
		
	}

}
