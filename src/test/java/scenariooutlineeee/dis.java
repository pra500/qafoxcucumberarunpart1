package scenariooutlineeee;

import io.cucumber.java.en.*;

public class dis {

	@Given("user is on billing page")
	public void user_is_on_billing_page() {

		System.out.println("rolling");
	}

	@When("user enters billing amount {string}")
	public void user_enters_billing_amount(String string) {
		System.out.println(string);
	}

	@When("user enters tax amount {string}")
	public void user_enters_tax_amount(String string) {
		System.out.println(string);
	}

}
