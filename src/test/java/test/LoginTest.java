package test;

import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import data.Dataproperties;
import data.ExcelUtils;
import pages.HomePage;
import pages.LoginPage;

public class LoginTest extends BaseTest {
	
	WebDriver driver = BaseTest.driver;
	
	//maventest
	@Test 
	public void LoginTest() throws Exception {
		
		System.out.println("Inside Test");
		LoginPage objLogin = new LoginPage(driver);
		HomePage objHome = new HomePage(driver);
		
		String username = ExcelUtils.getCellData(1, 0);
		String pwd = ExcelUtils.getCellData(1, 1);
		
		System.out.println(username);
		System.out.println(pwd);
		
		Properties prop = Dataproperties.readPropertiesFile();
	    System.out.println("username: "+ prop.getProperty("username"));
	    System.out.println("password: "+ prop.getProperty("password"));

		
		objLogin.login(username, pwd);
		objHome.validateDashboardUserName(username);
		
	}
	
	@After
	public void teardown() {
		
		System.out.println("Inside After");
		driver.quit();
	}
	
	
	

}

	/*
	 * public static void main(String[] args) { // TODO Auto-generated method stub
	 * 
	 * 
	 * WebElement Account = driver.findElement(By.name("selaccount"));
	 * 
	 * Select ddAccount = new Select(Account);
	 * 
	 * ddAccount.selectByVisibleText("Savings"); ddAccount.selectByValue("Savings");
	 * ddAccount.selectByIndex(1);
	 * 
	 * WebDriverWait wait = new WebDriverWait(driver,20);
	 * 
	 * wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("selaccount"
	 * )));
	 * 
	 * }
	 */
