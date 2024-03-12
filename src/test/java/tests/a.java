package tests;

import io.cucumber.java.en.*;

public class a {
	
	@Given("vwo site")
	public void vwo_site() {
		 System.out.println("hel1");
	}

	@When("enter creds")
	public void enter_creds() {
		 System.out.println("hel2");
	}

	@Then("logout from the app")
	public void logout_from_the_app() {
		 System.out.println("hel3");
	}


}
