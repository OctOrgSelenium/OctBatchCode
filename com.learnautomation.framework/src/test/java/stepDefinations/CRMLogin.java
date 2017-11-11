package stepDefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import factory.BrowserFactory;

public class CRMLogin {

	WebDriver driver;

	@Given("^Open firefox and start application$")
	public void open_firefox_and_start_application() throws Throwable {

		driver = BrowserFactory.startApplication("Chrome", "http://opensource.demo.orangehrmlive.com/");

	}

	@When("^I enter valid username and valid password$")
	public void i_enter_valid_username_and_valid_password() throws Throwable {

		driver.findElement(By.id("txtUsername")).sendKeys("admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin");
		driver.findElement(By.id("btnLogin")).click();

	}

	@Then("^user should be able to login successfully$")
	public void user_should_be_able_to_login_successfully() throws Throwable {
		boolean status = driver.getCurrentUrl().contains("dashboard");
		Assert.assertTrue(status);
	}

	@Then("^browser should get closed$")
	public void browser_should_get_closed() throws Throwable {
		driver.quit();
	}

}
