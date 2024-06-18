package StepDefinations;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.loginPage;

public class POM_loginStepDefinations {
	static WebDriver driver;

	loginPage login;

	@Given("User is on login page")
	public void user_is_on_login_page() {
		// Write code here that turns the phrase above into concrete actions
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.saucedemo.com/");
	}

	@When("User enters valid {string} and {string}")
	public void user_enters_valid_username_and_password(String username, String password) throws InterruptedException {

		login = new loginPage(driver);
		login.enterusername(username);
		login.enterpassword(password);

	}

	@And("Clicks on login Button")
	public void clicks_on_login_button() {

		login.clicklogin();
	}

	@Then("User is navigated to home page")
	public void user_is_navigated_to_home_page() {
		login.applogo();

	}

	@And("Close the browser")
	public void close_the_browser() {
		driver.close();
	}
}
