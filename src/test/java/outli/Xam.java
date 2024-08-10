package outli;

import io.cucumber.java.en.*;

public class Xam {

	@When("user clicks on Order link {string}")
	public void user_clicks_on_order_link(String string) {
	  System.out.println(string);
	}

	@Then("user checks the previous order detials {int}")
	public void user_checks_the_previous_order_detials(Integer int1) {
	  System.out.println(int1);
	}

	@Then("user checks the open order details {int}")
	public void user_checks_the_open_order_details(Integer int1) {
		 System.out.println(int1);
	}
}
