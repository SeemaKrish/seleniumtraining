package scripts;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
 
import static org.testng.Assert.*;
 
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
 
public class MyTemplateTestNG {
	WebDriver driver;
 
	@BeforeClass
	public void beforeClass() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
 
	@AfterClass
	public void afterClass() {
		driver.quit();
	}
 
	@Test // Test case1
	public void loginToNicheTourism() throws InterruptedException {
		driver.get("");
	}
}
