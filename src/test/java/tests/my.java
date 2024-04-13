package tests;

import io.cucumber.java.en.*;

public class my {
	
	
	@Given("^login to the dd (.+)$")
	public void login_to_the_dd_aa(String d) {
	 System.out.println("my name is "+d);
	}

	@And("^user logout (.+)$")
	public void user_logout(String d) {
		System.out.println("my name is "+d);
	}





}
