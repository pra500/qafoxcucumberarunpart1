package beforeeachstephooks;

import io.cucumber.java.en.*;

public class sdd {
	
	@Given("I am loggexxx")
	public void i_am_loggexxx() {
		System.out.println("hey z");
	   }

	@When("I navigate to the adxxx")
	public void i_navigate_to_the_adxxx() {
		System.out.println("hey z1");
	   }

}
