package tests;

import io.cucumber.java.en.*;

public class kk {
	
	@Given("^chkout page (.+)$")      
	public void chkout_page(String s)
	{
		System.out.println("world "+s);
	}
	
	@And("chkout history {string}")
	public void chkout_history(String s)
	{

		System.out.println("world1 "+s);
	}
	
	@And("chkout history1 {string}")
	public void chkout_history1(String s)
	{

		System.out.println("world2 "+s);
	}
	
	@And("chkout history2 {string}")
	public void chkout_history2(String s)
	{

		System.out.println("world3 "+s);
	}

}
