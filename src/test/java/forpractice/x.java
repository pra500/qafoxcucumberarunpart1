package forpractice;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.*;


public class x {
	
	@Before()
	public void setup() {
		System.out.println("welcome");
		
	}
	
	
	@After()
	public void teardown() {
		System.out.println("bye");
		
	}
	
	

@Given("enter amount")
public void enter_amount() {
    System.out.println("h");
}




}
