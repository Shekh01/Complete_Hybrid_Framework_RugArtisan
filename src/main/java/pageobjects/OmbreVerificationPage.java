package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OmbreVerificationPage {
	WebDriver driver;
	
	
	public OmbreVerificationPage(WebDriver driver) {
		this.driver=driver;
		
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(xpath = "//span[@class='shop-collection']")
	private WebElement ombreveri;

	public WebElement verification() {
		return ombreveri;
	}
}
