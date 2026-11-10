package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import Pages.DashBoardPage;

public class DashBoardTest extends BaseFile {
	
	@Test
	public void testDashBoardTitle() throws InterruptedException {
	
		DashBoardPage dashBoardPage = new DashBoardPage(driver);
		String actualTitle = dashBoardPage.getDashBoardTitle();
		String expectedTitle = "PRODUCT STORE";
		
		Assert.assertEquals(actualTitle, expectedTitle, "Dashboard title does not match!");
	}

}
