package opl;

import java.util.Map;

import io.cucumber.java.en.*;
import io.cucumber.datatable.DataTable;

public class xc {

	@Given("the user is on the checkout page")
	public void the_user_is_on_the_checkout_page() {

		System.out.println("all well");

	}

	@When("the user enters an expired discount code")
	public void the_user_enters_an_expired_discount_code() {
		System.out.println("all nice");
	}

	@When("user give below details")
	public void user_give_below_details(DataTable dataTable) {

		Map<String, String> map1 = dataTable.asMap(String.class, String.class);
		System.out.println("enter username as: " + map1.get("us1"));
		System.out.println("enter password as: " + map1.get("us2"));

	}

}
