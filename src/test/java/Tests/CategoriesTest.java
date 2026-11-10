package Tests;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import Pages.CategoriesPage;

public class CategoriesTest extends BaseFile {
	
	@Test
	public void categories() throws InterruptedException {
		CategoriesPage cat = new CategoriesPage(driver);
		cat.Categories();
	}	
}
