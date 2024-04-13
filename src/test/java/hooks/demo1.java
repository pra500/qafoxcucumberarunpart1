package hooks;

import io.cucumber.java.en.*;

public class demo1 {

	@Given("I am on the login page")
	public void goToLoginPage() {
		System.out.println("welcome to india people");
	}

	@When("I enter my username and password")
	public void enterCredentials() {
		System.out.println("welcome to us people");
	}

	@And("I click the login button")
	public void clickLoginButton() {
		System.out.println("welcome to uk people");
	}

	@Then("I should be logged in successfully")
	public void verifyLoginSuccess() {
		System.out.println("welcome to ireland people");
	}

}
