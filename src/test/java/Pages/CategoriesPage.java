package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CategoriesPage {
	
	WebDriver driver;
	
	@FindBy(xpath="//a[text()='Phones']")
	WebElement MobilePhones;
	
	@FindBy(xpath="//a[text()='Laptops']")
	WebElement Laptops;
	
	@FindBy(xpath="//a[text()='Monitors']")
	WebElement Monitors;
	
	public CategoriesPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void Categories() throws InterruptedException {
		Thread.sleep(3000);
		MobilePhones.click();
		Laptops.click();
		Monitors.click();
	}

}
