package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;

public class demo2 {
	
	
	//hooks like preconditions and postconditions, @Before/@After we need to use, if in one class we use it, automatically 
	//it will be applicable in other classes
	//ll be applicable for each of the scenarios
	
	//tagged hooks: like above, where the tag ll be der, that particular scenarios ll be executed
	
	
	 
      /*
	  @Before()
	  public void setup() {
	  
	  System.out.println("starting");
	  
	  }
	  
	  
	  @After()
	  public void teardown() {
	  
	  System.out.println("stopping");
	  
	  }
	*/
	
	
	  @Before("@regression")
	  public void setup() {
	  
	  System.out.println("starting");
	  
	  }
	  
	  
	  @After("@regression")
	  public void teardown() {
	  
	  System.out.println("stopping");
	  
	  }
	 
	
	@Given("I am on the checkout page")
	public void i_am_on_the_checkout_page() {		
		System.out.println("cucumber learning");
	  }

	@When("I add a valid item to the cart")
	public void i_add_a_valid_item_to_the_cart() {

		System.out.println("cucumber learning1");
	  }
	
	

	@When("I proceed to checkout")
	public void i_proceed_to_checkout() {

		System.out.println("cucumber learning2");
	   }

	@Then("I should see the payment page")
	public void i_should_see_the_payment_page() {

		System.out.println("cucumber learning3");
	    }

}
