package scripts;


import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
 
import static org.testng.Assert.*;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
 
public class AssignmentTwitter {

	WebDriver driver;
 
	@BeforeClass
	public void beforeClass() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
 
	@AfterClass
	public void afterClass() {
		
	}
 
	@Test // Test case1
	public void loginToTwitter() throws InterruptedException {
		driver.get ("https://twitter.com");
		List<WebElement> alldivclasses = driver.findElements(By.xpath("div"));
		
		
		System.out.println("Total div classes on twitter.com");
		
		}
	
	}

