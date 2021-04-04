package stepDefinition;

import java.io.IOException;

import javax.swing.text.Utilities;

import org.junit.Assert;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Cucumber.Automation.CBase;
import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
public class StepDefinition extends CBase {
	public WebDriver driver;

	@Given("^user is on the login page$")
	public void user_is_on_the_login_page() throws IOException {

		driver = initializeDriver();

		driver.get("http://qaclickacademy.com");

	}

	@When("^user enters email (.*)$")
	public void user_enters_username(String username) {

		driver.findElement(By.xpath("//span[normalize-space()='Login']")).click();
		driver.findElement(By.xpath("//input[@id='user_email']")).sendKeys(username);
	}

	@And("^user enters password (.*)$")
	public void user_enters_password(String password) {

		driver.findElement(By.xpath("//input[@id='user_password']")).sendKeys(password);

	}

	@Then("^user get confirmation$")
	public void user_get_confirmation() {

		System.out.println("Then user get confirmation");

		String title = driver.findElement(By.xpath("//div[@role='alert']")).getText();

		Assert.assertTrue(title, true);

	}

}
