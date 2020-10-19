package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	WebDriver driver;
	
	By byheader = By.xpath("//table//tr[@class='heading3']");
	
	public HomePage(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

    public void validateDashboardUserName(String uname){
    	
    	WebElement header = driver.findElement(byheader);
    	
    	String actname = header.getText();	
    	
    	System.out.println(actname);
    	
    	if(actname.contains(uname)) {
    		
    		System.out.println("Passed");
    		
    	}
    	else {
    		
    		System.out.println("Failed");
    		
    	}
    	
    }

	
	

}
