package tests;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageobjects.SignInPage;
import resources.Base;

public class SignInTest extends Base {
	Logger log;
	public WebDriver driver;

	
	
	
	@BeforeMethod
	public void openApplication() throws IOException {
		
		log = LogManager.getLogger(SignInTest.class.getName());
		driver = initializeDriver();
		log.debug("Browser got launched");

	}
	
	
	@Test(dataProvider = "getSignIn")
	public void clickOnSignIn(String email, String Pass, String Expectedstatus) throws IOException {

		

		SignInPage sp = new SignInPage(driver);

		sp.clickOnSignInLink().click();
		
		log.debug("Clicked on SignIn Link");

		sp.passEmail().sendKeys(email);
		
		log.debug("Paased successfully Email address");

		sp.paasPassword().sendKeys(Pass);
		
		log.debug("Paased successfully Password Value");

		sp.clickSubmit().click();
		
		log.debug("Clicked on Submit Link");

		/*String actualResult;

		try {
			sp.clickSubmit();
			actualResult = "Successfull";
			log.debug("User got logged in successfully");

		} catch (Exception e) {
			actualResult = "Failure";
			log.debug("user not logged");
		}
		Assert.assertEquals(actualResult, Expectedstatus);
		log.info("Login Test got passed");*/
		

	}

	

	@AfterMethod
	public void closeBrowser() {

		driver.close();
		
		log.debug("Browser Closed succefully");

	}

	@DataProvider
	public Object[][] getSignIn() {

		Object[][] data = { { "sajid.shekh@rugartisan.com", "Sajid01$", "Successfull" },
				 };
		//{ "sajid.shekh@rugartisan", "Sajid", "Failure" }

		return data;

	}
}
