package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
  
	 WebDriver driver;
	// Find the elements of the login page and perform actions on them
	 
	 @FindBy(id="login2")
	 WebElement loginButton;
	 
	 @FindBy(id="loginusername")
	 WebElement usernameField;
	 
	 @FindBy(id="loginpassword")
	 WebElement passwordField;
     
	 @FindBy(xpath="//button[contains(text(),'Log in')]")
	 WebElement submitButton;
	 
	 // Constructor to initialize the WebDriver- constructor will not have any return type
	 
	 public LoginPage(WebDriver driver) {
		 this.driver=driver;
		 PageFactory.initElements(driver, this);
	 }
	 
	 // Method to perform login action
	 public void login(String username, String password) throws InterruptedException {
		 loginButton.click();
		 Thread.sleep(2000); // Wait for the login modal to appear
		 usernameField.sendKeys(username);
		 passwordField.sendKeys(password);
		 submitButton.click();
	 }
}
