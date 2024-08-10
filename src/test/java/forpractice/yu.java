package forpractice;

import io.cucumber.java.en.*;

public class yu {
	

	@Given("test with output <{string}>")
	public void test_with_output(String string) {
	  System.out.println("input1");
	}

	@And("test with input<{string}>")
	public void test_with_input(String string) {
	 System.out.println("input2");
	 
	}

	@Then("get the result44")
	public void get_the_result44() {
	  System.out.println("input3");
	}


}
