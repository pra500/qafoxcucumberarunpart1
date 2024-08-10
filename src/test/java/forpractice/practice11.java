package forpractice;

import io.cucumber.java.en.*;

public class practice11 {

	@Given("I have a calculator")
	public void i_have_a_calculator() {
	  
		 System.out.println("hello");
	}

	@When("I add {int} and {int}")
	public void i_add_and(Integer int1, Integer int2) {
	   System.out.println(int1 + int2);
	}

	@Then("the result should be {int}")
	public void the_result_should_be(Integer int1) {
	   
		 System.out.println(int1);
	}


}
