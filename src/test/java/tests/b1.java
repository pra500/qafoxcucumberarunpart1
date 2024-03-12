package tests;

import io.cucumber.java.en.*;

public class b1 {
	
	@Given("^login to the site side$")
	public void login_to_the_site_side() {
		
		System.out.println("the holiday");
	  
	}

	@When("^enter deptt name (.+)$")
	public void enter_deptt_name_cs(String departnem) {
		
		System.out.println("the holiday is "+departnem);
	  
	}

	@And("^enter country name (.+)$")
	public void enter_country_name_india(String countt) {
		
		System.out.println("the holiday is "+countt);
	  }

	@And("enter state {string}")
	public void enter_state(String sta) {
	   
		System.out.println("the state name is "+sta);
	}
	
	@Given("^check order history$")
	public void check_order_history() {
		
		System.out.println("history");
	  
	}

	@When("^enter orderno$")
	public void enter_orderno() {
		
		System.out.println("order");
	  
	}

	
}
