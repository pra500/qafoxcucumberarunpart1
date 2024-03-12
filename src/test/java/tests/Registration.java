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
	  
	
	@When("enter firstname {string}")
	public void enter_firstname() {
		 System.out.println("<<Hello2>>");
	}

	@When("enter email luctus.vulputate@outlook.ca")
	public void enter_email_luctus_vulputate_outlook_ca() {
		 System.out.println("<<Hello3>>");
	}

	@When("enter pwd {int}")
	public void enter_pwd(Integer int1) {
		 System.out.println("<<Hello4>>");
	}

	@When("enter email justo@yahoo.com")
	public void enter_email_justo_yahoo_com() {
		 System.out.println("<<Hello5>>");
	   
	}

	@When("enter email eu.placerat@aol.net")
	public void enter_email_eu_placerat_aol_net() {
		 System.out.println("<<Hello64>>");
	}


	
	
	
	@And("^enter email and other fields$")
	public void enter_email_and_other_fields()
	{
		 System.out.println("<<Hello3>>");
	}
	
	
	@And("^select subscribe to yes and agree to privacy policy$")
	public void select_subscribe_to_yes_and_agree_to_privacy_policy()
	{
		 System.out.println("<<Hello4>>");
	}
	
	@And("^click on continue button$")
	public void click_on_continue_button()
	{
		 System.out.println("<<Hello5>>");
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

	
    @When("^user navigates to the production page$")
    public void navigateToProdPage() {
    	
    	System.out.println("prod 1");
       
    }
    
    @Then("^production number is displayed$")
    public void verifyProdNumberDisplayed() {
    
    	System.out.println("prod 2");
    }
     
}
