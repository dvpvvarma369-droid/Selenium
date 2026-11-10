package Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import Pages.LoginPage;

public class BaseFile {
	
	WebDriver driver;
	
	@Parameters("browser")
	@BeforeMethod(alwaysRun = true) // alwaysRun ensures setup runs even when filtering groups
	public void setUp(String browser) throws InterruptedException {
	    if(browser.equalsIgnoreCase("chrome")) driver = new ChromeDriver();
	    else if(browser.equalsIgnoreCase("firefox")) driver = new FirefoxDriver();
	    else if(browser.equalsIgnoreCase("ie")) driver = new EdgeDriver();
	    
	    driver.get("https://www.demoblaze.com/");
	    LoginPage loginPage = new LoginPage(driver);
		loginPage.login("vivek varma", "Vivek@123");
	}
	
private WebDriver getDriver() {
		// TODO Auto-generated method stub
		return null;
	}
	
//	@BeforeMethod
//	public void setup() throws InterruptedException {
//		driver= new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("https://www.demoblaze.com/");
//		LoginPage loginPage = new LoginPage(driver);
//		loginPage.login("vivek varma", "Vivek@123");
//	}
    @AfterMethod
	public void teardown() {
		driver.quit();
    }
	

}
