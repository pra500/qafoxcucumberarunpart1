package datatable;

import java.util.Map;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;

public class regis {
	
	
	
	
	//advantage: data table reduces lines of code in both feature file and step definition file
	
	
	
	@Given("user enters below details")
	public void user_enters_below_details(DataTable datatable) {
		
		//key, value   //String.class,    String.class  // firstname, Pragti 
			
		
		Map<String, String>map1=datatable.asMap(String.class, String.class);		
		System.out.println("user has entered the firstname as "+map1.get("firstname"));		
		System.out.println("user has entered the lastname as "+map1.get("lastname"));
		System.out.println("user has entered the email as "+map1.get("email"));
		System.out.println("user has entered the pwd as "+map1.get("pwd"));
		System.out.println("user has entered the confirmpwd as "+map1.get("confirmpwd"));
		
		
	}

	@And("select privacy policy")
	public void select_privacy_policy() {
		
		System.out.println("abc");
	  
	}

	@And("click on continue btn")
	public void click_on_continue_btn() {
		
		System.out.println("abcd");
	 
	}

	@Then("user should be able to register successfully")
	public void user_should_be_able_to_register_successfully() {
		
		System.out.println("abcde");
	  
	}



}
