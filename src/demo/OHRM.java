package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class OHRM {
	
	public WebDriver driver;

	@BeforeMethod
	public void setUp() throws InterruptedException {
		// to Initialize browser
		System.setProperty("webdriver.chrome.driver", "./Drivers2\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();

		Thread.sleep(3000);
	}

	@Test(priority = 0)
	public void LoginTest() throws InterruptedException {
		WebElement objUserName = driver.findElement(By.name("username"));

		if (objUserName.isDisplayed()) {
			Reporter.log("Username element found in Application and Script executing ....", true);
			// to perform login operation
			driver.findElement(By.name("username")).sendKeys("Admin");
			driver.findElement(By.name("password")).sendKeys("admin123");
			driver.findElement(By.tagName("button")).click();
			Thread.sleep(5000);

			String pgTitle = driver.getTitle();
			System.out.println("page title is...." +pgTitle);
			Assert.assertEquals(pgTitle, "Orange");
			Reporter.log("Successful login operation",true);
		} 
		else 
		{
			Reporter.log("Username Element not found",true);
		}

		}

	@AfterMethod
	public void tearDown() {
		driver.close();
	}


}
