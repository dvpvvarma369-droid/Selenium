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

public class DemoBlazeTitle extends BaseClass {

	
	 @Test
	    public void demoBlazeTitle() {
	        // driver is already available and navigated via BaseClass
	        System.out.println("User is able to navigate DemoBlaze path: " + driver.getTitle());
	    }

	  @Test
	    public void linkValidation() {
	        String expectedResult = "https://www.demoblaze.com/";
	        String actualResult = driver.getCurrentUrl();
	        
	        // Note: TestNG Assert syntax is typically Assert.assertEquals(actual, expected, message)
	        Assert.assertEquals(actualResult, expectedResult, "Invalid URL once navigated to the dashboard");
	    }

	}

