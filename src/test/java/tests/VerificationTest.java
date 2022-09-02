package tests;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pageobjects.OmbreVerificationPage;
import resources.Base;

public class VerificationTest extends Base {
	public WebDriver driver;
	
	
	@BeforeMethod
	public void openApplication() throws IOException {
		driver = initializeDriver();
	}


	@Test
	public void verification() throws IOException {

		OmbreVerificationPage op = new OmbreVerificationPage(driver);

		Assert.assertTrue(op.verification().isDisplayed());

	}

	
	@AfterMethod
	public void closeBrowser() {
		driver.close();
	}

}
