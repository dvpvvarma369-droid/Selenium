import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Saucedemo {
	
	WebDriver driver;
	@Test(groups = {"Regression"})
	public void login() {
		driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		System.out.println("User is able to navigate SauceDemo path");
	}
	@Test
	public void validcreditinals() {
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		System.out.println("User is able to login SauceDemo Page");
	}

}
