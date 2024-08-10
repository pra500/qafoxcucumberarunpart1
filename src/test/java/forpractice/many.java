package forpractice;

import io.cucumber.java.en.*;

public class many {
	


	@Given("test4")
	public void test4() {
	  System.out.println("hello");
	}

	@And("test5 <{string}> and <{string}>")
	public void test5_and(String string, String string2) {
		  System.out.println("hello1");
	}








}
