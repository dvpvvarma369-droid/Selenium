package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Pages.ProductLink;

public class ProductTest extends BaseFile {
	WebDriver driver;
	
	@Test
	public void product() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.linkText("Nokia lumia 1520")).click();
	}



}
