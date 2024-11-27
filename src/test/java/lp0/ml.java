package lp0;

import io.cucumber.java.en.*;

public class ml {
	
	

@Given("the user is on the form page")
public void the_user_is_on_the_form_page() {
	 System.out.print("World1");
}

@When("the user clicks the {string} button")
public void the_user_clicks_the_button(String string) {
	 System.out.print("World2");
}

@Then("the form should be submitted successfully")
public void the_form_should_be_submitted_successfully() {
	 System.out.print("World3");
}

@Then("the user should see a confirmation message {string}")
public void the_user_should_see_a_confirmation_message(String string) {
	 System.out.print("World4");
  
}

@Given("the user navigates to the URL {string}")
public void the_user_navigates_to_the_url(String string) {
	 System.out.print("World5");
}

@Then("the webpage should load successfully")
public void the_webpage_should_load_successfully() {
	 System.out.print("World6");
}

@Then("the URL should be {string}")
public void the_url_should_be(String string) {
	 System.out.print("World7");
}

@Then("the page title should be {string}")
public void the_page_title_should_be(String string) {
	 System.out.print("World8");
}


}
