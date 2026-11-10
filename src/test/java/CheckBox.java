import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CheckBox {
	WebDriver driver;
	@Test(groups = "smoke")
	public void checkBox() throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/radio.html");
		System.out.println("User is able to navigate Demo Guru 99 page");
		Thread.sleep(3000);
		WebElement checkbox1 = driver.findElement(By.id("vfb-6-0"));
		WebElement checkbox2 = driver.findElement(By.id("vfb-6-1"));
		WebElement checkbox3 = driver.findElement(By.id("vfb-6-2"));
		checkbox1.click();
		System.out.println("check Box1 is selected");
		if(checkbox1.isSelected()) {
			checkbox1.click();
	    System.out.println("check Box1 is unselected");
		}
	}
}