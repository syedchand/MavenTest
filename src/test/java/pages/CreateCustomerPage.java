package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import data.ExcelUtils;

public class CreateCustomerPage {
	
	WebDriver driver;
	
	//------------------------------- WebElements -----------------------------
	@FindBy(linkText="New Customer")
	WebElement NewCustomer;
	@FindBy(xpath="//*[@class='heading3']")
	WebElement AddNewCustomer;
	@FindBy(name="name")
	WebElement Fname;
	@FindBy(xpath="//input[@value='m']")
	WebElement Gender;
	@FindBy(xpath="//input[@name='dob']")
	WebElement DOB;
	@FindBy(xpath="//*[@name='addr']")
	WebElement Address;
	@FindBy(xpath="//input[@name='city']")
	WebElement city;
	@FindBy(xpath="//input[@name='state']")
	WebElement state;
	@FindBy(xpath="//input[@name='pinno']")
	WebElement pinno;
	@FindBy(xpath="//input[@name='telephoneno']")
	WebElement telephoneno;
	@FindBy(xpath="//input[@name='emailid']")
	WebElement emailid;
	@FindBy(xpath="//input[@name='password']")
	WebElement password;
	@FindBy(xpath="//*[@type='submit' or @name='sub']")
	WebElement sub;
	
	
	//-------------------------------- Method --------------------------------
	 
	public CreateCustomerPage(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void createcustomer() throws Exception {
		
		//WebElement NewCustomer = driver.findElement(By.linkText("New Customer"));
		NewCustomer.click();
		
		//WebElement AddNewCustomer = driver.findElement(By.xpath("//*[@class='heading3']"));
		if(AddNewCustomer.isDisplayed()) {
			System.out.println("Add new customer is displayed");
			
			
		} else {
			
			System.out.println("Add new customer is not displayed");
		}
		
		String FirstName = ExcelUtils.getCellData(1, 2);
		
		//WebElement Fname = driver.findElement(By.name("name"));
		Fname.sendKeys("Chand");
		//WebElement Gender = driver.findElement(By.xpath("//input[@value='m']"));
		Gender.click();
		//WebElement DOB = driver.findElement(By.xpath("//input[@name='dob']"));
		DOB.sendKeys("01/01/1991");
		//WebElement Address = driver.findElement(By.xpath("//*[@name='addr']"));
		Address.sendKeys("1234 Lincoln Avenu APT 202");
		city.sendKeys("Warren");
		state.sendKeys("New Jersey");
		pinno.sendKeys("088516");
		telephoneno.sendKeys("3025467890");
		emailid.sendKeys("syedchand01@gmail.com");
		password.sendKeys("Test123$");
		sub.click();
		
		
		
				
				
				
				
///html/body/table/tbody/tr/td/table/tbody/tr[5]/td[2]/input[1]
		
		//driver.quit();
		
		
	}

}
