package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {
	
	public static WebDriver driver;
	
	public BaseTest() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shaik\\Documents\\Selenium Client\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.navigate().to("http://demo.guru99.com/V4/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
	}

}
