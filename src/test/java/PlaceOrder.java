import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class PlaceOrder extends AddtoCart {
	@Test
	public void placeOrder() throws InterruptedException {
		// Click on the "Place Order" button
		driver.findElement(By.xpath("//button[text()='Place Order']")).click();
		Thread.sleep(2000); // Wait for the order modal to appear

		// Fill in the order form
		driver.findElement(By.id("name")).sendKeys("vivek varma");
		driver.findElement(By.id("country")).sendKeys("India");
		driver.findElement(By.id("city")).sendKeys("Hyderabad");
		driver.findElement(By.id("card")).sendKeys("1234 5678 9012 3456");
		driver.findElement(By.id("month")).sendKeys("12");
		driver.findElement(By.id("year")).sendKeys("2025");

		// Click on the "Purchase" button
		driver.findElement(By.xpath("//button[text()='Purchase']")).click();
		Thread.sleep(2000); // Wait for the confirmation modal to appear

		// Optionally, you can verify the confirmation message here
		WebElement confirmationMessage = driver.findElement(By.xpath("//h2[text()='Thank you for your purchase!']"));
		assertEquals(confirmationMessage.isDisplayed(), true, "Confirmation message is not displayed.");
	}

}
