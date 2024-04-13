package beforeeachstephooks;

import io.cucumber.java.en.*;

public class beforeeachstep1 {
	
	@Given("I am")
	public void i_am() {
		 System.out.println("jan");
	}

	@When("I click on the signout button")
	public void i_click_on_the_signout_button() {
		 System.out.println("feb");
	}

	@Then("I should be logged out successfully")
	public void i_should_be_logged_out_successfully() {
	   System.out.println("march");
	}

}
