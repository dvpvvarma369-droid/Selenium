import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BaseClass {
	 WebDriver driver;
		@BeforeClass	
		public void setup() throws InterruptedException {
			driver = new ChromeDriver();
			driver.get("https://www.demoblaze.com/");
			driver.manage().window().maximize();
			driver.findElement(By.id("login2")).click();
			Thread.sleep(2000); // Wait for the login modal to appear
			driver.findElement(By.id("loginusername")).sendKeys("vivek varma");
			driver.findElement(By.id("loginpassword")).sendKeys("Vivek@123");
			driver.findElement(By.xpath("//button[text()='Log in']")).click();
			Thread.sleep(2000); // Wait for the login process to complete
			}
		@AfterClass
		public void teardown() {
			if (driver != null) {
			driver.quit();
			}
		}
			
	
}
