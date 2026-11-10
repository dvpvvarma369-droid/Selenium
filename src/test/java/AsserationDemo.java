

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.*;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AsserationDemo {
	WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	// Suite is nothing but combination of multiple scripts 
    @BeforeSuite
    public void setup() {
    	 driver = new ChromeDriver();
    	 driver.manage().window().maximize();
    	 driver.get("https://www.saucedemo.com/");
    }
    // Test case 1
    @Test
    public void login() {
    	driver.findElement(By.id("user-name")).sendKeys("standard_user");
    	driver.findElement(By.id("password")).sendKeys("secret_sauce");
    	driver.findElement(By.id("login-button")).click();
    }
    //Test case 2
//    @Test
//    public void Dashboard() throws InterruptedException {
//    	String ExpectedResult = "https://www.saucedemo.com/inventory.html";
//    	Thread.sleep(3000);
//    	String ActualResult = driver.getCurrentUrl(); 
//    	Assert.assertEquals(ExpectedResult, ActualResult, "Login Failed, Invalid URL in Dashboard"); // Hard Assert
//
//    }
    
//    //Test Case3
//        @Test
//        public void DashBoardHeading() throws InterruptedException {
//    	String ExpectedResult = "Swag Labs";
//    	Thread.sleep(3000);
//    	String ActualResult = driver.findElement(By.xpath("//div[text()='Swag Labs']")).getText();
//    	//SoftAssert SoftAssert = new SoftAssert();  // SoftAssert will execute below test cases even it is failed in that particular test case
//    	Assert.assertEquals(ExpectedResult,ActualResult,"Login Failed, Invalid Heading in Dashboard");
//    }
    
    //Test Case4
    @Test
    public void ItemLink() throws InterruptedException{
    	Thread.sleep(3000);
    	driver.findElement(By.id("item_1_title_link")).click();
    }
//    //Test case 5
//    public void backtoproductstab(){
//    	String ExpectedResult = "Back to products";
//    	String ActualResult = driver.findElement(By.id("back-to-products")).getText();
//    	SoftAssert SoftAssert = new SoftAssert(); 
//    	Assert.assertEquals(ExpectedResult,ActualResult,"Invalid text in Back to products");
//    }

}
