package hooks;

import io.cucumber.java.en.*;

public class demo3 {
	
	@Given("I am on the order page")
	public void i_am_on_the_order_page() {
		
		System.out.println("bye1");
	   
	}

	@When("I select valid items")
	public void i_select_valid_items() {
		System.out.println("bye2");
	   
	}

	@When("I provide valid shipping information")
	public void i_provide_valid_shipping_information() {
		System.out.println("bye3");
		
	  
	}

	@When("I proceed to place the order")
	public void i_proceed_to_place_the_order() {
		System.out.println("bye4");
	    
	}

	@Then("I should receive a confirmation message")
	public void i_should_receive_a_confirmation_message() {
		System.out.println("bye5");
	  
	}
	
	@Then("I should receive a confirmation message1")
	public void i_should_receive_a_confirmation_message1() {
		System.out.println("bye6");
	}
	
	
	
	 @Given("I am logged in to the application")
	    public void loginToApplication() {
		 System.out.println("bye7");
	    }

	    @When("I navigate to the history page")
	    public void navigateToHistoryPage() {
	    	System.out.println("bye8");
	    }

	    @Then("I should see a list of my purchase history")
	    public void verifyPurchaseHistoryDisplayed() {
	    	System.out.println("bye9");
	      
	    }


	    
	    @Given("I am on the product page")
	    public void goToProductPage() {
	    	System.out.println("bye10");
	    }

	    @When("I select a product")
	    public void selectProduct() {
	    	System.out.println("bye11");
	    }

	    @Then("I should see the product details")
	    public void verifyProductDetailsDisplayed() {
	    	System.out.println("bye12");
	    }


}
