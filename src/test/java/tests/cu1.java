package tests;

import io.cucumber.java.en.*;

public class cu1 {
	
	@Given("^my login page outlined (.+)$")
	public void my_login_page_outlined(String s) {
	 System.out.println("home "+s);
	}
	
	
	
	

	@When("sari {string}")
	public void get(String s) {
	 System.out.println("homeggg "+s);
	}


}
