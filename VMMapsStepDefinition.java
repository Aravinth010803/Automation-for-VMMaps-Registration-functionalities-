package org.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class VMMapsStepDefinition {
      WebDriver driver;
	@Given("user Launch the VMmaps web application")
	public void userLaunchTheVMmapsWebApplication() {
		driver.get("https://accounts.vmmaps.com/");
	    driver.manage().window().maximize();

	}

	@When("user enter valid EmailId and Click on forgot password link")
	public void userEnterValidEmailIdAndClickOnForgotPasswordLink() {
		driver.findElement(By.id("login-email")).sendKeys("akaravinthkrish07@gmail.com");
		driver.findElement(By.id("Forgot-Password")).click();
	}

	@Then("user able to view the OTP page and enter valid OTP")
	public void userAbleToViewTheOTPPageAndEnterValidOTP() {
	    System.out.println("OTP page should be displayed" );
	}

	@Then("user able to view the again login page")
	public void userAbleToViewTheAgainLoginPage() {
	    System.out.println("Enter valid OTP and again login page should be displayed");
	}

	@When("user enter valid password and click on login button")
	public void userEnterValidPasswordAndClickOnLoginButton() {
		driver.findElement(By.id("login-password")).sendKeys("Aravinth@123");
		driver.findElement(By.id("loginSubmit")).click();
	}

	@Then("user able to view the homepage")
	public void userAbleToViewTheHomepage() {
	    System.out.println("Home page should be displayed");
	}

	@When("user enter Invalid EmailId and Click on forgot password link")
	public void userEnterInvalidEmailIdAndClickOnForgotPasswordLink() {
		driver.findElement(By.id("login-email")).sendKeys("aravinthkrish07@gmail.com");
	}

	@Then("user able to view the user not found error message")
	public void userAbleToViewTheUserNotFoundErrorMessage() {
	    System.out.println("user not found error message should be displayed");
	}


}
