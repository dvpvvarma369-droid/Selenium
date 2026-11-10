package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class ContactPage {
	
	WebDriver driver;
	@FindBy(xpath="//a[text()='Contact']")
	WebElement Contact;
	
	@FindBy(id="recipient-email")
	WebElement emailid;
	@FindBy(id="recipient-name")
	WebElement recipientname;
	@FindBy(id="message-text")
	WebElement message;
	@FindBy(xpath="//button[text()='Send message']")
	WebElement button;
	
	public ContactPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void contact(String EmailId,String RecipientName,String Message) throws InterruptedException {
		Thread.sleep(3000);
		Contact.click();
		Thread.sleep(3000);
		emailid.sendKeys(EmailId);
		recipientname.sendKeys(RecipientName);
		message.sendKeys(Message);
		button.click();
	}

}
