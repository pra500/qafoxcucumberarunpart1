package tests;

import io.cucumber.java.en.*;

public class g {
	
	@Given("login to app {string}")
	public void login_to_app(String ss) {
	  System.out.println("helllo"  + ss);
	}

	@When("enter creds {string}")
	public void enter_creds(String s) {
		
		 System.out.println("helllo"  + s);
	  
	}

	@When("press submit {string}")
	public void press_submit(String p) {
		
		 System.out.println("helllo"  + p);
	  
	}

}
