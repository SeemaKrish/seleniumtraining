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
 
public class WebElementMethods {
	WebDriver driver;
 

public void handlingDropdowns()throws InterruptedException{
	driver.get("https://cookbook.seleniumacademy.com/Config.html");
	WebElement Make = driver.findElement(By.name("Make"));
	
		
	List<WebElement> allOptions = driver.findElements(By.cssSelector("option[value]"));
	List<WebElement> allOptions = driver.findElements[By.xpath("//select[@name='make']/option");
	
	System.out.println("Total dropdowns on cookbook.seleniumacademy.com are make - " + allmake.size());

	}
}

First Create Event Bus
java -jar selenium-server-4.18.1.jar  event-bus
 
Session Map
java -jar selenium-server-4.18.1.jar sessions
 
New Session Queue
java -jar selenium-server-4.18.1.jar sessionqueue
 
Distributor
java -jar selenium-server-4.18.1.jar distributor --sessions http://localhost:5556 --sessionqueue http://localhost:5559 --bind-bus false
 
Router
java -jar selenium-server-4.18.1.jar router --sessions http://localhost:5556 --distributor http://localhost:5553 --sessionqueue http://localhost:5559
 
Create Nodes
java -jar selenium-server-4.18.1.jar node --max-sessions 4 --log-level "fine" --port 7777 --driver-implementation "firefox" --driver-implementation "edge"
 
java -jar selenium-server-4.18.1.jar node --max-sessions 4 --log-level "fine" --port 7778 --driver-implementation "firefox" --driver-implementation "edge"
 
java -jar selenium-server-4.18.1.jar node --max-sessions 4 --log-level "fine" --port 7779 --driver-implementation "firefox" --driver-implementation "edge"
