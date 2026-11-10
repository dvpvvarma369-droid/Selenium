package Tests;

import org.testng.annotations.Test;

import Pages.ContactPage;

public class ContactTest extends BaseFile{
	@Test
	public void contact() throws InterruptedException {
		ContactPage contact = new ContactPage(driver);
		contact.contact("dvpvvarma123@gmail.com", "Varma", "Hi");
	}

}
