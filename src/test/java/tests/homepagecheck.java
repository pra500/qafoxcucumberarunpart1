package tests;

import io.cucumber.java.en.*;


public class homepagecheck {
	
	@Given("login333")
	public void login333()
	{
		System.out.println("wel");
	}
	
	@When("search anything {string}")
	public void login2(String productname)
	{
		System.out.println("wel1" + productname);
		
	}
	
	@And("list shown")
	public void login3()
	{
		
		System.out.println("wel2");
	}
	
	@Then("click on particular")
	public void login4()
	{
		System.out.println("wel3");
	}
	
	

	@Given("login12")
	public void logingg1()
	{
		System.out.println("bye");
	}
	
	
	@When("search anything here {string}")
	public void logingg2(String productname)
	{
		System.out.println("bye1" + productname);
		
	}
	
	@And("list shown12")
	public void logingg3()
	{
		
		System.out.println("bye2");
	}
	
	@Then("click on particular12")
	public void logingg4()
	{
		System.out.println("bye3");
	}
	
	



}
