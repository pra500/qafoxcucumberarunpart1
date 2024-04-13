package tests;

import io.cucumber.java.en.*;

public class L1 {
		

	@Given("add to cart")
	public void add_to_cart() {
		
		System.out.println("<< hello world >>");
	 
	}

	@When("cart page")
	public void cart_page() {
		
		System.out.println("<< hello world 1>>");	   
	}

	@Then("cart no")
	public void cart_no() {
	  
		System.out.println("<< hello world 2>>");
	}

	@When("order page")
	public void order_page() {
		System.out.println("<< hello world 3>>");
		
	  }

	@Then("order no")
	public void order_no() {
		System.out.println("<< hello world 4>>");
	   
	}

	@Given("payment page and enroll no")
	public void payment_page_and_enroll_no() {
		
		System.out.println("<< hello world 5>>");
	  
	}

	@When("search item and press enter")
	public void search_item_and_press_enter() {
		System.out.println("<< hello world 6>>");
	    
	}

	@Then("logout from the application and login again")
	public void logout_from_the_application_and_login_again() {
		
		
		System.out.println("<< hello world 7>>");
	 
	}
	
	
	
	@Given("logintoappp and then checking consciouslly")
	public void logintoappp_and_then_checking_consciouslly() {
		
		System.out.println("<< hello world 8>>");
	 
	}

	@When("search item")
	public void search_item() {
		
		System.out.println("<< hello world 9>>");
		
	   
	}

	@Then("logout from the application")
	public void logout_from_the_application() {
	  
		System.out.println("<< hello world 10>>");
	}

}
