package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver driver;
	
	//------------------------------- WebElements -----------------------------
	
	@FindBy(css="input[name='uid']")
	WebElement username;
	@FindBy(xpath="//input[@type='password']")
	WebElement pwd;
	@FindBy(name="btnLogin")
	WebElement lognbtn;
	
	/*
	 * By byusername = By.cssSelector("input[name='uid']"); By bypassword =
	 * By.xpath("//input[@type='password']"); By bylogin = By.name("btnLogin");
	 */
	
	
	//-------------------------------- Method --------------------------------
	public LoginPage(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	public void login(String uname, String password) {
		
			
		//WebElement username = 	driver.findElement(By.name("uid"));
		//WebElement username = driver.findElement(By.cssSelector("input[name='uid']"));
		//WebElement pwd = 	driver.findElement(By.name("password"));
		//WebElement pwd = 	driver.findElement(By.cssSelector("input[name='password']"));
		//WebElement pwd = driver.findElement(By.xpath("//input[@type='password']"));
		
		//WebElement lognbtn = 	driver.findElement(By.name("btnLogin"));
		
		//String uname = "mngr289192";
			
		//WebElement username = driver.findElement(byusername);
		//WebElement pwd = driver.findElement(bypassword);
		//WebElement lognbtn = 	driver.findElement(bylogin);
		
		
		username.sendKeys(uname);
		pwd.sendKeys(password);
		lognbtn.click();
	
		
		
	}

}
