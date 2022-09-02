package stepdefinitions;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.SignInPage;
import resources.Base;

public class SignIn extends Base{
	
	WebDriver driver;
	SignInPage sp;
	

	@Given("^Open any Browser$")
	public void open_any_browser() throws IOException {
		
		 driver = initializeDriver();
		
		

	}

	@And("^Navigate to Login page$")
	public void navigate_to_login_page() {
		
		 sp = new SignInPage(driver);

		sp.clickOnSignInLink().click();
		

	}

	@When("^User enters username as \"([^\"]*)\" and password as \"([^\"]*)\" into the fields$")
	public void user_enters_username_as_something_and_password_as_something_into_the_fields(String username,
			String password) {
		 sp = new SignInPage(driver);
		sp.passEmail().sendKeys(username);
		sp.paasPassword().sendKeys(password);
		

	}

	@And("^User clicks on Login button$")
	public void user_clicks_on_login_button() {
		 sp = new SignInPage(driver);
		sp.clickSubmit().click();
		

	}

	@Then("^Verify user is able to successfully login$")
	public void verify_user_is_able_to_successfully_login() {
		
		

	}
	@After
	public void closeBrowser() throws InterruptedException {
		Thread.sleep(3000);
		driver.close();
	}

}
