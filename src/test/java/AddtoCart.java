import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class AddtoCart extends BaseClass {
	@Test
	public void addToCart() throws InterruptedException {
		// Navigate to the "Phones" category
		driver.findElement(By.xpath("//a[text()='Phones']")).click();
		Thread.sleep(2000); // Wait for the page to load

		// Click on a specific phone (e.g., "Samsung galaxy s6")
		driver.findElement(By.xpath("//a[text()='Samsung galaxy s6']")).click();
		Thread.sleep(2000); // Wait for the product page to load

		// Click on the "Add to cart" button
		driver.findElement(By.xpath("//a[text()='Add to cart']")).click();
		Thread.sleep(2000); // Wait for the alert to appear

		// Handle the alert
		driver.switchTo().alert().accept();
	}
	@Test
	public void cickoncart() throws InterruptedException {
		// Navigate to the "Cart" page
		driver.findElement(By.xpath("//a[text()='Cart']")).click();
		Thread.sleep(2000); // Wait for the cart page to load
	}

}
