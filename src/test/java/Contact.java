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

public class Contact extends BaseClass {
     @Test
	public void Contact() throws InterruptedException {
    	 driver.findElement(By.xpath("//a[text()='Contact']")).click();
    	 Thread.sleep(2000); // Wait for the contact modal to appear
    	 driver.findElement(By.id("recipient-email")).sendKeys("varma143@gmail.com");
    	 driver.findElement(By.id("recipient-name")).sendKeys("vivek varma");
    	 driver.findElement(By.id("message-text")).sendKeys("Hello, this is a test message");
    	 driver.findElement(By.xpath("//button[text()='Send message']")).click();
    	 }
		
}
