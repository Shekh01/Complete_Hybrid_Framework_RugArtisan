package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import resources.Base;

public class TC_01_CheckOut_Checkout_page_Blank_fields extends Base{
	public WebDriver driver;
	
	@Test
	public void Test_And_Verify_All_Checkout_Page_Blank_field_pass_value_and_clear_Test() throws InterruptedException {
		Thread.sleep(3000);

		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,100)");
		Thread.sleep(300);
		driver.findElement(By.xpath("//ul[@class='links']//a[contains(text(),'Sign in')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='email']")).clear();
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("sajid.shekh@rugartisan.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='password']")).clear();
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Sajid01$");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='btn-submit']//span[contains(text(),'Login')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//img[@alt='shopping bag']")).click();
		Thread.sleep(2000);
		// driver.findElement(By.xpath("//a[@title='Remove This Item']")).click();
		driver.findElement(By.xpath("//*[@id=\"navbarResponsive\"]/div/div[1]/div/div[2]/ul/li/div/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[normalize-space()='+ New Address']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@id='shipping[first_name]'])[1]")).clear();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@id='shipping[last_name]'])[1]")).clear();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@id='shipping[phone]'])[1]")).clear();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@id='shipping[company_name]'])[1]")).clear();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@id='shipping_address_0'])[1]")).clear();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@id='shipping_address_1'])[1]")).clear();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@id='shipping[city]'])[1]")).clear();
		Thread.sleep(1000);
		WebElement drpco = driver.findElement(By.id("shipping_country"));
		Select sel = new Select(drpco);
		sel.selectByValue("United Kingdom");
		Thread.sleep(2000);
		WebElement drpst = driver.findElement(By.id("shipping_state"));
		Select selsta = new Select(drpst);
		selsta.selectByValue("Antrim");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@id='shipping[postcode]'])[1]")).clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[normalize-space()='Place Order']")).click();
	}


}
