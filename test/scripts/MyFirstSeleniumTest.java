package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MyFirstSeleniumTest {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		// driver = new ChromeDriver();

		driver = new FirefoxDriver();

		driver.manage().window().maximize();
		// to maximize the screen

		driver.get("https://nichethyself.com/tourism/home.html");

		WebElement user = driver.findElement(By.name("username"));
		user.sendKeys("stc123");
		// locater in Selenium
		// able to find any element
		WebElement pass = driver.findElement(By.name("password"));
		pass.sendKeys("12345");

		// user.submit();
		pass.submit();

		String expectedPageTitleAfterLogin = "My account";
		// this information I will get from requirements document
		Thread.sleep(3000);
		String actualPageTitleAfterLogin = driver.getTitle();

		if (expectedPageTitleAfterLogin.equals(actualPageTitleAfterLogin)) {
			System.out.println("Login Successful !!");
		}

		else {
			System.out.println(actualPageTitleAfterLogin);
			System.out.println("Login Failed");

		}
		driver.quit();

	}
}
