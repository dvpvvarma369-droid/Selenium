package Pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductLink {
	WebDriver driver;
	@FindBy(xpath="//a[text()='Samsung galaxy s6']")
	WebElement Phone;


public ProductLink(WebDriver driver) {
	this.driver = driver;
	PageFactory.initElements(driver, this);	
}

public void products() throws InterruptedException {
	Thread.sleep(5000);
	Phone.click();

}

}
