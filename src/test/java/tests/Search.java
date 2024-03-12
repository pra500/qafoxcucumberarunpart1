package tests;

import io.cucumber.java.en.*;

public class Search {
	
	
	
	@Given("login to opencart site")
	public void login_to_opencart_site() {
		
		
		System.out.println("<< Fine >>");
	   
	}

	@When("search for {string} product")
	public void search_for_product(String string) {
		
		System.out.println("<< Fine1 >>");
	   
	}

	@When("press enter")
	public void press_enter() {
		
		System.out.println("<< Fine2 >>");
	   
	}

	@When("products are displayed")
	public void products_are_displayed() {
		
		System.out.println("<< Fine3 >>");
	  
	}

	@When("msg dispayed - {string}")
	public void msg_dispayed(String string) {
		
		System.out.println("<< Fine4 >>");
	
	}


	@When("logout")
	public void logout() {
		
		System.out.println("<< Fine37 >>");
	  
	}

}
