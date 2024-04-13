package tests;

import io.cucumber.java.en.*;

public class Registration {
	
	//first scenario:
	//^ and $ are optional to use, no effect on o/p, ^ starts with  $ ends with
	
	@Given("^user navigates to the registration page$")
	public void user_navigates_to_the_registration_page()
	{
		 System.out.println("<<Hello1>>");
	}	
	
	
	@And("^select subscribe to yes and agree to privacy policy$")
	public void select_subscribe_to_yes_and_agree_to_privacy_policy()
	{
		 System.out.println("<<Hello4>>");
	}
	
	
	@And("^click on continue button$")
	public void enter_email_and_other_fields()
	{
		 System.out.println("<<Hello3>>");
	}
	
	
	

	@Then("^the account is created successfully$")
	public void the_account_is_created_successfully()
	{
		 System.out.println("<<Hello6>>");
	}
	
	
	
	@When("^user navigates to the invoice page$")
    public void navigateToInvoicePage() {
		
		System.out.println("invoice 1");
   
    }

    @Then("^invoice number is displayed$")
    public void verifyInvoiceNumberDisplayed() {
     
    	System.out.println("invoice 2");
    }

	
   
     
}
