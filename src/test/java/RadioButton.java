import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class RadioButton {
	WebDriver driver;
	@Test(groups = "smoke")
	public void Pathnavigation() {
		driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/radio.html");
		System.out.println("user is able to navigate Demo Guru99 WebSite");
	}
	@Test
	public void radiobutton() {
		WebElement radiobutton1 = driver.findElement(By.id("vfb-7-1"));
		WebElement radiobutton2 = driver.findElement(By.id("vfb-7-2"));
		WebElement radiobutton3 = driver.findElement(By.id("vfb-7-3"));
		radiobutton2.click();
	}

}
