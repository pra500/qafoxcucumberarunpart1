package tests;

import io.cucumber.java.en.*;


public class cucumberexpression {
	
	
	
	@Given("loginhomepage")
	public void loginhomepage()
	{
		System.out.println("wee");
	}
	
	
	@When("^enter email22 (.+)$")
	public void enter_email22_yy_gmail_com(String s) {
		System.out.println("mmm "+s);
	    	}

	@And("^enter password22 (.+)$")
	public void enter_password22(int ii) {
		
		System.out.println("mmm2 "+ii);
	 
	}

	@And("enter username22 {string}")
	public void enter_username22(String s) {
		
		System.out.println("mmm3 "+s);
	   
	}

	@And("enter popup {int}")
	public void enter_popup(int i) {
		
		System.out.println("mmm4 "+i);
	}
	
	@And("enter alertpopup {float}")
	public void enter_alertpopup(float h) {
		
		System.out.println("mmm5 "+h);
	}

	



}
