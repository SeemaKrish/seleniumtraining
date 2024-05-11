package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class AssignmentOrangeHrm {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		 driver = new ChromeDriver();
		//driver = new FirefoxDriver();

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(3000);

		WebElement user = driver.findElement(By.name("username"));
		user.sendKeys("Admin");

		WebElement pass = driver.findElement(By.name("password"));
		pass.sendKeys("admin123");

		Thread.sleep(3000);
		pass.submit();

		String expectedPageTitleAfterLogin = ("OrangeHRM");
		Thread.sleep(3000);
		String actualPageTitleAfterLogin = driver.getTitle();

		if (expectedPageTitleAfterLogin.equals(actualPageTitleAfterLogin)) {

			System.out.println("Login Successful!!");

		} else

			System.out.println("Login Failed!");
	}

}
