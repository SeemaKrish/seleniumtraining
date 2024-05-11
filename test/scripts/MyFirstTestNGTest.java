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

public class MyFirstTestNGTest {
	WebDriver driver;
	
	@Test
	public void googleTest() {
		driver.get("http://www.google.com");
		driver.findElement(By.name("q")).sendKeys("Selenium Training");		
	}
	
	@BeforeMethod // Executes before test.
	public void beforeMethod() {		
	System.out.println("I am in before Method, I get executed before every test");
		
	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("I am in before class, I get executed only once before first test");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
	}

	@AfterClass
	public void afterClass() {
		System.out.println("I am in after class, I get executed only once after last test is executed.");
		driver.quit();
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("I am in after Method, I get executed after every test");
	}

	@Test // Test case1
	public void loginToNicheTourism() throws InterruptedException {
		driver.get("https://nichethyself.com/tourism/home.html");
		WebElement user = driver.findElement(By.name("username"));
		user.sendKeys("stc123");

		WebElement pass = driver.findElement(By.name("password"));
		pass.sendKeys("12345");

		// user.submit();
		pass.submit();

		String expectedPageTitleAfterLogin = "My account1";// This information I will get from requirements document,
															// Stories,
		Thread.sleep(3000);
		String actualPageTitleAfterLogin = driver.getTitle();		
	//	assertEquals(actualPageTitleAfterLogin, expectedPageTitleAfterLogin);
		assertEquals(actualPageTitleAfterLogin, expectedPageTitleAfterLogin,"Seems the Page title is not Correct. May be login was not successful");
		
	}
}
