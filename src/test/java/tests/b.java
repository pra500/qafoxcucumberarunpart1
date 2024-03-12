package tests;

import io.cucumber.java.en.*;

public class b {
	
	@Given("^loginnn$")
	public void loginnn() {
	   System.out.println("hello world");
	}

	@When("^enter email (.+)$")
	public void enter_email_yy_gmail_com(String mail) {
		System.out.println("the email for is "+mail);
	  
	}

	@And("^enter password (.+)$")
	public void enter_password(String pwww) {
		System.out.println("the password for is "+pwww);
			}


}
