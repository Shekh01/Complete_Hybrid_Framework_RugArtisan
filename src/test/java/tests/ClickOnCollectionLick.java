package tests;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pageobjects.LandingPage;
import resources.Base;

public class ClickOnCollectionLick extends Base{
	public WebDriver driver;
	
	
	
	@BeforeMethod
	public void openApplication() throws IOException {
		 driver = initializeDriver();
		
	}
	
	@Test
	public void ClickOnCollectionLickTest() throws IOException, InterruptedException {
		
	
		
		
		
		driver.findElement(By.xpath("//a[@class='dropdown-toggle collection']")).click();
		
		LandingPage landing = new LandingPage(driver);
		landing.clickOnShopColl().click();

		Thread.sleep(3000);
		
		Assert.assertTrue(true);
		

	}
	
	@AfterMethod
	public void closeBrowser() {
		driver.close();
	}

}
